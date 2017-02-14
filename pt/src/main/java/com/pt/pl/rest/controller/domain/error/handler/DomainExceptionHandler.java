package com.pt.pl.rest.controller.domain.error.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.pt.pl.rest.controller.domain.error.DomainDoesNotExistException;
import com.pt.pl.rest.global.error.RestError;
import static com.pt.pl.rest.global.error.RestErrorCode.*;

import static com.pt.pl.rest.global.error.RestErrorMessage.*;

@ControllerAdvice	
public class DomainExceptionHandler {

	private RestError restError;
	
	@ExceptionHandler(value=DomainDoesNotExistException.class)
	@ResponseBody
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public RestError handleDomainDoesNotExistException(Exception ex){
		restError = new RestError();
		restError.setRestErrorCode(NOT_FOUND);
		restError.setRestErrorCode(DOMAIN_NOT_FOUND);
		return restError;
	}
	
}
