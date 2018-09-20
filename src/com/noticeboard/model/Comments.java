package com.noticeboard.model;

public class Comments {
	private String id, noticeid, userid, comment;
	private long commentDate; //comment posted date and time in epoch
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setNoticeId(String nid) {
		this.noticeid = nid;
	}
	
	public String getNoticeId() {
		return this.noticeid;
	}
	
	public void setUserId(String uid) {
		this.userid = uid;
	}
	
	public String getUserId() {
		return this.userid;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getComment() {
		return this.comment;
	}
	
	public void setCommentDate(long date) {
		this.commentDate = date;
	}
	
	public long getCommentDate() {
		return this.commentDate;
	}
}