package com.pt.sl.domain;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Domain {
	
	/*
	 * unique
	 */
	Long domainId;
	String domainName;
	List<Subject> subjects;
	String discriptionOfDomain;
	User user;

	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getDomainId() {
		return domainId;
	}
	public void setDomainId(Long domainId) {
		this.domainId = domainId;
	}
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	public String getDiscriptionOfDomain() {
		return discriptionOfDomain;
	}
	public void setDiscriptionOfDomain(String discriptionOfDomain) {
		this.discriptionOfDomain = discriptionOfDomain;
	}
}
