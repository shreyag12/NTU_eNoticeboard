package com.noticeboard.model;

public class Users {
	private String id;
	private String roleid;
	private String firstName, lastName, email, username;
	private long contactNo;
	private String pswd;
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getRoleId() {
		return this.roleid;
	}
	
	public void setRoleId(String rid) {
		this.roleid = rid;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String fname) {
		this.firstName = fname;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lname) {
		this.lastName = lname;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void getUsername(String uname) {
		this.username = uname;
	}
	
	public long getContactNo() {
		return this.contactNo;
	}
	
	public void setContactNo(long num) {
		this.contactNo = num;
	}
	
	public String getPswd() {
		return this.pswd;
	}
	
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
}
