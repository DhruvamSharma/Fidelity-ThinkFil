package com.fil.thinkFIL.dao.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.ValueGenerationType;
@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String userName;
	
	@Column
	private String picture;
	@Column
	private String employeeName;
	@Column
	private String password;
	@Column
	private int rewardPoint;
	
//	@OneToMany(fetch=FetchType.EAGER)
//	@JoinColumn(name="corpId")
//	private List<Question> questions=new ArrayList<>();
//	@OneToMany(fetch=FetchType.LAZY)
//	@JoinColumn(name="corpId")
//	private List<Answer> answers=new ArrayList<>();
//	@ManyToMany(fetch=FetchType.EAGER)
//	@JoinColumn(name="corpId")
//	private List<Bookmark> bookmarks=new ArrayList<>();
	
	
	public User() {
		super();
	}
	public User(User user) {
		this.userName=user.getUserName();
		this.employeeName=user.getEmployeeName();
		this.rewardPoint=user.getRewardPoint();
		this.id=user.getId();
		this.picture=user.getPicture();
		this.password=user.getPassword();
		// TODO Auto-generated constructor stub
		
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRewardPoint() {
		return rewardPoint;
	}
	public void setRewardPoint(int rewardPoint) {
		this.rewardPoint = rewardPoint;
	}
//	public List<Question> getQuestions() {
//		return questions;
//	}
//	public void setQuestions(List<Question> questions) {
//		this.questions = questions;
//	}
//	public List<Answer> getAnswers() {
//		return answers;
//	}
//	public void setAnswers(List<Answer> answers) {
//		this.answers = answers;
//	}
//	public List<Bookmark> getBookmark() {
//		return bookmarks;
//	}
//	public void setBookmark(List<Bookmark> bookmark) {
//		this.bookmarks = bookmark;
//	}
	
	
}
