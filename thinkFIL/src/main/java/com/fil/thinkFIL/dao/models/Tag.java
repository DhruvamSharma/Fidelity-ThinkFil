package com.fil.thinkFIL.dao.models;

import javax.persistence.Entity;

@Entity
public class Tag {
	private String TagId;
	private Question questionId;
	private Category categoryId;
	public String getTagId() {
		return TagId;
	}
	public void setTagId(String tagId) {
		TagId = tagId;
	}
	public Question getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Question questionId) {
		this.questionId = questionId;
	}
	public Category getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}
	public Tag() {
		super();
	}
	
}
