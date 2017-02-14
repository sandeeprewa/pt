package com.pt.sl.domain;

import java.util.List;

public class Question {
	
	Long questionId;
	String questionString;
	List<Option> options;
	Answer answer;
	Discussion discussion;
	User user;
	DifficultyLevel difficultyLevel;
	ConfidenceLevel confidenceLevel;
	
	
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getQuestionString() {
		return questionString;
	}
	public void setQuestionString(String questionString) {
		this.questionString = questionString;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Discussion getDiscussion() {
		return discussion;
	}
	public void setDiscussion(Discussion discussion) {
		this.discussion = discussion;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public DifficultyLevel getDifficultyLevel() {
		return difficultyLevel;
	}
	public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	public ConfidenceLevel getConfidenceLevel() {
		return confidenceLevel;
	}
	public void setConfidenceLevel(ConfidenceLevel confidenceLevel) {
		this.confidenceLevel = confidenceLevel;
	}
	
	
	
	
}

