package com.fil.thinkFIL.dao.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fil.thinkFIL.dao.models.User;



@Entity
public class Applicant {
	@Id
	private String applicantId;
	@Column
	private Requirment requirment;
	@Column
	private User user;
	@Column
	private String pitch;
	public Applicant() {
		super();
	}
	public String getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}
	public Requirment getRequirment() {
		return requirment;
	}
	public void setRequirment(Requirment requirment) {
		this.requirment = requirment;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getPitch() {
		return pitch;
	}
	public void setPitch(String pitch) {
		this.pitch = pitch;
	}


}
