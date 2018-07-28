package com.fil.thinkFIL.dao.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fil.thinkFIL.dao.models.Answer;


@Entity
public class AnswerVote {

	@Id
	@Column
	private String answerVoteId;
	@Column
	private Answer answer;
	public String getAnswerVoteId() {
		return answerVoteId;
	}
	public void setAnswerVoteId(String answerVoteId) {
		this.answerVoteId = answerVoteId;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public AnswerVote() {
		super();
	}
	
}
