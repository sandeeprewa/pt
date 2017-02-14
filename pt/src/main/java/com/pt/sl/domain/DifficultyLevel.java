package com.pt.sl.domain;

public enum DifficultyLevel {
		
	EASY("easy"),
	MODERATE("moderate"),
	HARD("hard");
	
	private final String levelValue;
	
	private DifficultyLevel(String levelValue){
		this.levelValue = levelValue;
	}
}
