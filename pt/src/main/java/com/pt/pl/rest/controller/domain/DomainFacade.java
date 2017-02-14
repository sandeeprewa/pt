package com.pt.pl.rest.controller.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.pt.sl.domain.Domain;
import com.pt.sl.domain.Subject;
import com.pt.sl.domains.DomainService;

@Component
public class DomainFacade {

	@Autowired
	@Qualifier("domainServiceImpl")
	DomainService domainSerivceImpl;
	
	
	public Domain getAllDomain(){
		return domainSerivceImpl.getDomain();
	}


	public Subject getAllSubject(String domainName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
