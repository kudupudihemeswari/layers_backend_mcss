package models;

public class student {
private int st_id;
private String st_name;
private String st_email;
public student(int st_id, String st_name, String st_email, long st_mobile, String st_branch) {
	super();
	this.st_id = st_id;
	this.st_name = st_name;
	this.st_email = st_email;
	this.st_mobile = st_mobile;
	this.st_branch = st_branch;
}
public student() {
	super();
	// TODO Auto-generated constructor stub
}
private long st_mobile;
private String st_branch;
public int getSt_id() {
	return st_id;
}
public void setSt_id(int st_id) {
	this.st_id = st_id;
}
public String getSt_name() {
	return st_name;
}
public void setSt_name(String st_name) {
	this.st_name = st_name;
}
public String getSt_email() {
	return st_email;
}
public void setSt_email(String st_email) {
	this.st_email = st_email;
}
public long getSt_mobile() {
	return st_mobile;
}
public void setSt_mobile(long st_mobile) {
	this.st_mobile = st_mobile;
}
public String getSt_branch() {
	return st_branch;
}
public void setSt_branch(String st_branch) {
	this.st_branch = st_branch;
}
}
