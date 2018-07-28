package com.fil.thinkFIL.dao.models;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	private String questionId;
	@Column
	private Date date;
	@Column
	private User questioner;
	@Column
	private String questionDescription;
	@Column
	private int upvotes;

	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="questionId")
	private List<Answer> answers=new ArrayList<>();
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="questionId")
	private List<QuestionComment> questionComments=new ArrayList<>();

	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="questionId")
	private List<QuestionVote> questionVoters=new ArrayList<>();
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="questionId")
	private List<Tag> tags=new ArrayList<>();
	
	public Question() {
		super();
	}
	public String getQuestionDescription() {
		return questionDescription;
	}
	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}
	public int getUpvotes() {
		return upvotes;
	}
	public void setUpvotes(int upvotes) {
		this.upvotes = upvotes;
	}
	public List<QuestionVote> getQuestionVoters() {
		return questionVoters;
	}
	public void setQuestionVoters(List<QuestionVote> questionVoters) {
		this.questionVoters = questionVoters;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public List<QuestionComment> getQuestionComments() {
		return questionComments;
	}
	public void setQuestionComments(List<QuestionComment> questionComments) {
		this.questionComments = questionComments;
	}
	public void setQuestionID(String questionId) {
		this.questionId = questionId;
	}
	

}
