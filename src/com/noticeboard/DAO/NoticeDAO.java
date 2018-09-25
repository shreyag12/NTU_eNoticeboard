package com.noticeboard.DAO;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.noticeboard.mapper.NoticeMapper;
import com.noticeboard.model.Notice;

//DAO class for different MongoDB CRUD operations
//take special note of "id" String to ObjectId conversion and vice versa
//also take note of "_id" key for primary key
public class NoticeDAO {

	private DBCollection col;
	
	public NoticeDAO(MongoClient mongo) {

       if(mongo==null){
        	mongo = DAOConnection.getMongoClient();
        }

		this.col = mongo.getDB("ENoticeBoard").getCollection("Notice");
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

}
