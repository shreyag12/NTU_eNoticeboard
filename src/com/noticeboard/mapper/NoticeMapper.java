package com.noticeboard.mapper;

import java.awt.List;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

import com.noticeboard.model.Notice;

public class NoticeMapper {

	// convert Notice Object to MongoDB DBObject
	// take special note of converting id String to ObjectId
	public static DBObject toDBObject(Notice notice) {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start().append("id", notice.getId())
				.append("title", notice.getTitle()).append("catId", notice.getCatId())
				.append("deptId", notice.getDeptId()).append("desc", notice.getDesc())
				.append("eventDate", notice.getEventDate()).append("postedDate", notice.getPostedDate())
				.append("coordinates", notice.getCoordinates());

		return builder.get();
	}

	// convert DBObject Object to Books
	// take special note of converting ObjectId to String
	public static Notice toNotice(DBObject doc) {

		Notice notice = new Notice();
		notice.setId((String) doc.get("id"));
		notice.setTitle((String) doc.get("title"));
		notice.setCatId((String) doc.get("catId"));
		notice.setDeptId((String) doc.get("deptId"));
		notice.setDesc((String) doc.get("desc"));
		notice.setEventDate((Long) doc.get("eventDate"));
		notice.setPostedDate((Long) doc.get("postedDate"));
		// notice.setCoordinates((Float)doc.get("coordinates"),
		// (Float)doc.get("coordinates"));
		return notice;
	}
}
