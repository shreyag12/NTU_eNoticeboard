package com.noticeboard.DAO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import com.noticeboard.mapper.NoticeMapper;
import com.noticeboard.model.Notice;

//DAO class for different MongoDB CRUD operations
//take special note of "id" String to ObjectId conversion and vice versa
//also take note of "_id" key for primary key
public class NoticeDAO {

	private DBCollection col;
	private DB db;
	
//	public NoticeDAO(MongoClient mongo) {
//
//       if(mongo==null){
//        	mongo = DAOConnection.getMongoClient();
//        }
//
//		this.col = mongo.getDB("ENoticeBoard").getCollection("Notice");
//	}
	public NoticeDAO(MongoClient mongo) {
		db = mongo.getDB("myDb");
		col = db.getCollection("random");
//		this.col = mongo.getDB("myDb").getCollection("random");
		System.out.println("connecting to db");
	}


	public Notice createNotice(Notice notice) {
		DBObject doc = NoticeMapper.toDBObject(notice);
		this.col.insert(doc);
		ObjectId id = (ObjectId) doc.get("_id");
		notice.setId(id.toString());
		return notice;
	}

	public void updateNotice(Notice notice) {
		DBObject query = BasicDBObjectBuilder.start()
				.append("_id", new ObjectId(notice.getId())).get();
		this.col.update(query, NoticeMapper.toDBObject(notice));
	}

	public List<Notice> readAllNotice() {
		List<Notice> data = new ArrayList<Notice>();
		DBCursor cursor = col.find();
		while (cursor.hasNext()) {
			DBObject doc = cursor.next();
			Notice notice = NoticeMapper.toNotice(doc);
			data.add(notice);
		}
		return data;
	}

	public void deleteNotice(Notice notice) {
		DBObject query = BasicDBObjectBuilder.start()
				.append("_id", new ObjectId(notice.getId())).get();
		this.col.remove(query);
	}

	public Notice readNotice(Notice notice) {
		DBObject query = BasicDBObjectBuilder.start()
				.append("_id", new ObjectId(notice.getId())).get();
		DBObject data = this.col.findOne(query);
		return NoticeMapper.toNotice(data);
	}
	public Notice createNotice(Notice n, File imageFile) {
		String newFileName = "mkyong-java-image";
		GridFS gfsPhoto = new GridFS(db, "photo");
		try {
			GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
			gfsFile.setFilename(newFileName);
			gfsFile.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BasicDBObject doc = new BasicDBObject();
				doc.append("title",n.getTitle()).append("cnumber",n.getCnumber())
				.append("oname",n.getOname()).append("url", n.getUrl())
				.append("startdate", n.getSdate()).append("starttime", n.getStime())
				.append("enddate", n.getEdate()).append("endtime", n.getEtime())
				.append("category",n.getCategory()).append("department", n.getDepartment());
                this.col.insert(doc);
				System.out.println("creating notice");
////				String newFileName = "mkyong-java-image";
////				GridFS gfsPhoto = new GridFS(db, "photo");
//				GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);
//				System.out.println(imageForOutput);
				getSingleImageExample(db);
				return n;
	}
	public List<Notice> readAllTitle() {
		List<Notice> data = new ArrayList<Notice>();
		DBCursor cursor = col.find();
		while (cursor.hasNext()) {
			DBObject doc = cursor.next();
			Notice n = new Notice();
			n.setTitle((String) doc.get("title"));
			ObjectId id = (ObjectId) doc.get("_id");
			n.setId(id.toString());
			data.add(n);
		}
		System.out.println(data);
		return data;
	}
	 private static void getSingleImageExample(DB db) {
		 String newFileName = "mkyong-java-image";
			GridFS gfsPhoto = new GridFS(db, "photo");
			GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);
			System.out.println(imageForOutput);
	    }

}
