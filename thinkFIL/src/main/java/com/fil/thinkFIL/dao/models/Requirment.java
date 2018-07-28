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
@Entity
public class Requirment {
	@Id
	@Column
	private String requirmentId;
	@Column
	private Date date;
	@Column
	private User user;
	@Column
	private int numberOfApplicants;
	@Column 
	private Date expiryDate;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="requirmentId")
	private List<Applicant> applicants=new ArrayList<>();
	
	
	
	
	
	public String getRequirmentId() {
		return requirmentId;
	}
	public void setRequirmentId(String requirmentId) {
		this.requirmentId = requirmentId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getNumberOfApplicants() {
		return numberOfApplicants;
	}
	public void setNumberOfApplicants(int numberOfApplicants) {
		this.numberOfApplicants = numberOfApplicants;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public List<Applicant> getApplicants() {
		return applicants;
	}
	public void setApplicants(List<Applicant> applicants) {
		this.applicants = applicants;
	}
	public Requirment() {
		super();
	}
	
	
}
