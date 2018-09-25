package com.noticeboard.mapper;

import java.util.ArrayList;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.noticeboard.model.Notice;

public class NoticeMapper {

	// convert Notice Object to MongoDB DBObject
	// take special note of converting id String to ObjectId
	public static DBObject toDBObject(Notice notice) {
		
		
		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start().append("title", notice.getTitle());
		if (notice.getId() != null)
			builder = builder.append("_id", new ObjectId(notice.getId()));
		/*.append("catId", notice.getCatId())
				.append("deptId", notice.getDeptId()).append("desc", notice.getDesc())
				.append("eventDate", notice.getEventDate()).append("postedDate", notice.getPostedDate())
				.append("coordinates", notice.getCoordinates());*/

		return builder.get();
	}

	// convert DBObject Object to Notice
	// take special note of converting ObjectId to String
	public static Notice toNotice(DBObject doc) {
		BasicDBList list = (BasicDBList) doc.get("coordinates");
		Notice notice = new Notice();
		ArrayList<Float> coordList = new ArrayList<Float>();
		if (list != null && list.size() > 0) {
			for (Object item : list) {	
				coordList.add((Float) item);
			}
		}
		ObjectId id = (ObjectId) doc.get("_id");
		notice.setId(id.toString());
		notice.setTitle((String) doc.get("title"));
		/*notice.setCatId((String) doc.get("catId"));
		notice.setDeptId((String) doc.get("deptId"));
		notice.setDesc((String) doc.get("desc"));
		notice.setEventDate((Long) doc.get("eventDate"));
		notice.setPostedDate((Long) doc.get("postedDate"));
		notice.setCoordinates(coordList.get(0), coordList.get(1));*/
		return notice;
	}
}
