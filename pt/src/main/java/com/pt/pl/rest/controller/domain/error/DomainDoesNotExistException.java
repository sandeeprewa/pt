package com.pt.pl.rest.controller.domain.error;

public class DomainDoesNotExistException extends RuntimeException {
	DomainDoesNotExistException(String msg){
		super(msg);
	}
}
