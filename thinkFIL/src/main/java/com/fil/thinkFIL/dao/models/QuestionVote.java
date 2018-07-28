package com.fil.thinkFIL.dao.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class QuestionVote {

	@Id
	@Column
	private String questionVoteId;
	@Column
	private Question question;
	@Column 
	private User voter;
	public QuestionVote() {
		super();
	}
	public String getQuestionVoteId() {
		return questionVoteId;
	}
	public void setQuestionVoteId(String questionVoteId) {
		this.questionVoteId = questionVoteId;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public User getVoter() {
		return voter;
	}
	public void setVoter(User voter) {
		this.voter = voter;
	}
	
	
}
