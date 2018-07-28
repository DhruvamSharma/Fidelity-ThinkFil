package com.fil.thinkFIL.dao.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class QuestionComment {
	@Id
	@Column
	private String questionCommentId;
	@Column
	private User user;
	@Column
	private Question question;
	@Column
	private Date date;
	@Column
	private String commentDescription;
	
	public String getQuestionCommentId() {
		return questionCommentId;
	}
	public void setQuestionCommentId(String questionCommentId) {
		this.questionCommentId = questionCommentId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCommentDescription() {
		return commentDescription;
	}
	public void setCommentDescription(String commentDescription) {
		this.commentDescription = commentDescription;
	}
	public QuestionComment() {
		super();
	}
	

}
