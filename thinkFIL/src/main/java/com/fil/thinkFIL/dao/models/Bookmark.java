package com.fil.thinkFIL.dao.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fil.thinkFIL.dao.models.Question;



@Entity
public class Bookmark {
	@Id
	@Column
	private String bookmarkId;
	@Column
	private Question question;
	@Column
	private User user;
	@Column
	private Date date;
	public Bookmark() {
		super();
	}
	public String getBookmarkId() {
		return bookmarkId;
	}
	public void setBookmarkId(String bookmarkId) {
		this.bookmarkId = bookmarkId;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
