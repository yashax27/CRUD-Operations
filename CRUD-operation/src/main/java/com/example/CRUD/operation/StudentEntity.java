package com.example.CRUD.operation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	@Id
int rollno;
String stuname;
String course;
int percentage;
public StudentEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public StudentEntity(int rollno, String stuname, String course, int percentage) {
	super();
	this.rollno = rollno;
	this.stuname = stuname;
	this.course = course;
	this.percentage = percentage;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getStuname() {
	return stuname;
}
public void setStuname(String stuname) {
	this.stuname = stuname;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getPercentage() {
	return percentage;
}
public void setPercentage(int percentage) {
	this.percentage = percentage;
}
@Override
public String toString() {
	return "StudentEntity [rollno=" + rollno + ", stuname=" + stuname + ", course=" + course + ", percentage="
			+ percentage + "]";
}


}
