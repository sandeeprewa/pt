package com.pt.sl.domain;

public enum ConfidenceLevel {
		
	HIGH("high"),
	MODERATE("moderate"),
	LOW("low");
	
	private final String lavelValue;
	
	private ConfidenceLevel(String lavelValue){
		this.lavelValue = lavelValue;
	}
}
