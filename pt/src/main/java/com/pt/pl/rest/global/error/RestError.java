package com.pt.pl.rest.global.error;

public class RestError {
		
	String restErrorCode;
	String restErrorReason;
	
	public RestError(String restErrorCode, String restErrorReason) {
		this.restErrorCode = restErrorCode;
		this.restErrorReason = restErrorReason;
	}
	
	public RestError(){
	}
	
	public String getRestErrorCode() {
		return restErrorCode;
	}
	public void setRestErrorCode(String restErrorCode) {
		this.restErrorCode = restErrorCode;
	}
	public String getRestErrorReason() {
		return restErrorReason;
	}
	public void setRestErrorReason(String restErrorReason) {
		this.restErrorReason = restErrorReason;
	}
	
}
