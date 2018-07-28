package com.fil.thinkFIL.dao.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fil.thinkFIL.dao.models.Answer;
@Entity
public class AnswerComment {
	@Id
	@Column
	private String answerCommentId;
	@Column
	private Answer answer;
	@Column
	private User user;
	@Column
	private Date date;
	@Column
	private String commentDescription;
	public String getAnswerCommentId() {
		return answerCommentId;
	}
	public void setAnswerCommentId(String answerCommentId) {
		this.answerCommentId = answerCommentId;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
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
	public String getCommentDescription() {
		return commentDescription;
	}
	public void setCommentDescription(String commentDescription) {
		this.commentDescription = commentDescription;
	}
	public AnswerComment() {
		super();
	}

}
