package com.crunchify.restjersey;

////////////////////////////////////////
//
//Post.java
//
//Senior project 
//
//Author: Naomi Makovkin
//
//Java class representing the
//'post' data model from class
//
////////////////////////////////////////

import java.time.*;

public class Post{

	private String title,course,user,note;
	private LocalDate postDate,classDate;
	private boolean flag;
	
	public Post(String t, String c, String u
				, String n, int y, int m, int d ){
		this.title = t;
		this.course = c;
		this.user = u;
		this.note = n;
		setClassDate(y,m,d);
		this.postDate = LocalDate.now();
		this.flag = false;
	
	}
	
	//
	//GETTERS
	//
	public String getTitle(){
		return title;
	}
	
	public String getCourse(){
		return course;
	}
	
	public String getNote(){
		return note;
	}
	public LocalDate getClassDate(){
		return classDate;
	}
	
	public LocalDate getPostDate(){
		return postDate;
	}
	
	public boolean getFlag(){
		return flag;
	}
	
	public String getUser(){
		return user;
	}
	
	public String toString(){
		return "Post:\n" + getTitle() + "\n" 
			+ getCourse() + "\n" + getUser() + "\n"
			+ getNote() + "\n" + "Class Date: " + getClassDate()
			+ "\n" + "Last Modified: " + getPostDate() 
			+ "Flagged: " + getFlag() + "\n";
	}
	
	//
	//SETTERS
	//
	public void setTitle(String t){
		title = t;
	}
	
	public void setCourse(String c){
		course = c;
	}
	
	public void setUser(String u){
		user = u;
	}
	
	public void setNote(String n){
		note = n;
	}
	
	public void flag(){
		flag = !flag;
	}
	
	public void setPostDate(){
		postDate = LocalDate.now();
	}
	
	public void setClassDate(int year, int month, int day){
		classDate = LocalDate.of(year, month, day);
	}

}