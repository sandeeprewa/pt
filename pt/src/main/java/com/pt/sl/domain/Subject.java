package com.pt.sl.domain;

import java.util.List;

public class Subject {

	Long subjectId;
	String subjectName;
	List<Topic> topics;
	String subjectDiscription;
	User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public List<Topic> getTopics() {
		return topics;
	}
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	public String getSubjectDiscription() {
		return subjectDiscription;
	}
	public void setSubjectDiscription(String subjectDiscription) {
		this.subjectDiscription = subjectDiscription;
	}
}
