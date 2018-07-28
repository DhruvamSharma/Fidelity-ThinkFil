package com.fil.thinkFIL.dao.models;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fil.thinkFIL.dao.models.Question;



@Entity
public class Answer {
	@Id
	private String answerId;
	@Column
	private Question question;
	@Column
	private  User user;
	@Column
	private String answerDescription;
	@Column
	private Date date;
	@Column 
	private int upvotes;
	@Column
	private boolean approved;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="answerId")
	private List<AnswerVote> answerVoters=new ArrayList<>();
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="answerId")
	private List<AnswerComment> answerComments=new ArrayList<>();
	public int getUpvotes() {
		return upvotes;
	}
	public void setUpvotes(int upvotes) {
		this.upvotes = upvotes;
	}
	public void setAnswerID(String answerId) {
		this.answerId = answerId;
	}
	public void setQuestionID(Question question) {
		this.question = question;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setAnswerDescription(String answerDescription) {
		this.answerDescription = answerDescription;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public void setAnswerVoters(List<AnswerVote> answerVoters) {
		this.answerVoters = answerVoters;
	}
	public void setAnswerComments(List<AnswerComment> answerComments) {
		this.answerComments = answerComments;
	}
	public Answer() {
		super();
	}
}
