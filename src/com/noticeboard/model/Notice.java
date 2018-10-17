package com.noticeboard.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Notice {

	private String id, title, posterId, deadline, departmentId, categoryId, status, contactNumber, address, description,
			organiser, noOfBookings, noOfShares, noOfFavourites, noOfSeats, url;
	private long eventDate, postedDate; // date stored as epoch
	private float[] location = new float[2]; // 0-Latitude, 1-Longitude

	public Notice() {
	} // needed for JAXB

	public Notice(String id, String title, String posterId, String deadline, String departmentId, String categoryId,
			String status, String contactNumber, String address, String description, String organiser,
			String noOfBookings, String noOfShares, String noOfFavourites, String noOfSeats, String url, long eventDate,
			long postedDate, float[] location) {
		super();
		this.id = id;
		this.title = title;
		this.posterId = posterId;
		this.deadline = deadline;
		this.departmentId = departmentId;
		this.categoryId = categoryId;
		this.status = status;
		this.contactNumber = contactNumber;
		this.address = address;
		this.description = description;
		this.organiser = organiser;
		this.noOfBookings = noOfBookings;
		this.noOfShares = noOfShares;
		this.noOfFavourites = noOfFavourites;
		this.noOfSeats = noOfSeats;
		this.url = url;
		this.eventDate = eventDate;
		this.postedDate = postedDate;
		this.location = location;
	}

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

	public String getPosterId() {
		return posterId;
	}

	public void setPosterId(String posterId) {
		this.posterId = posterId;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrganiser() {
		return organiser;
	}

	public void setOrganiser(String organiser) {
		this.organiser = organiser;
	}

	public String getNoOfBookings() {
		return noOfBookings;
	}

	public void setNoOfBookings(String noOfBookings) {
		this.noOfBookings = noOfBookings;
	}

	public String getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(String noOfShares) {
		this.noOfShares = noOfShares;
	}

	public String getNoOfFavourites() {
		return noOfFavourites;
	}

	public void setNoOfFavourites(String noOfFavourites) {
		this.noOfFavourites = noOfFavourites;
	}

	public String getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(String noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public float[] getLocation() {
		return location;
	}

	public void setLocation(float lat, float lng) {
		this.location[0] = lat;
		this.location[1] = lng;
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

	/*
	 * public float[] getCoordinates() { return this.coordinates; }
	 * 
	 * public void setCoordinates(float lat, float lng) { this.coordinates[0] = lat;
	 * this.coordinates[1] = lng; }
	 */
}