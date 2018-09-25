package com.noticeboard.model;

public class Notice {
	private String id, title;/*, catId, deptId, desc;  
	private long eventDate, postedDate; //date stored as epoch
	private float[] coordinates = new float[2]; //0-Latitude, 1-Longitude
*/	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	/*public String getCatId() {
		return this.catId;
	}
	
	public void setCatId(String cid) {
		this.catId = cid;
	}
	
	public String getDeptId() {
		return this.deptId;
	}
	
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public long getEventDate() {
		return this.eventDate;
	}
	
	public void setEventDate(long date) {
		this.eventDate = date;
	}
	
	public long getPostedDate() {
		return this.postedDate;
	}
	
	public void setPostedDate(long date) {
		this.postedDate = date;
	}
	
	public float[] getCoordinates() {
		return this.coordinates;
	}
	
	public void setCoordinates(float lat, float lng) {
		this.coordinates[0] = lat;
		this.coordinates[1] = lng;
	}*/
}