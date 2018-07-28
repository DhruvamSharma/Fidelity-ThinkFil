package com.fil.thinkFIL.dao.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class RequirmentComment {
	@Id
	@Column
	private String requirmentCommentId;
	@Column
	private User user;
	@Column
	private Requirment requirment;
	@Column
	private Date date;
	@Column
	private String commentDescription;
	public RequirmentComment() {
		super();
	}
	public String getRequirmentCommentId() {
		return requirmentCommentId;
	}
	public void setRequirmentCommentId(String requirmentCommentId) {
		this.requirmentCommentId = requirmentCommentId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Requirment getRequirment() {
		return requirment;
	}
	public void setRequirment(Requirment requirment) {
		this.requirment = requirment;
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

}
