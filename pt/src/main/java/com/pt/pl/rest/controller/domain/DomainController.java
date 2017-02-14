package com.pt.pl.rest.controller.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pt.sl.domain.Domain;
import com.pt.sl.domain.Subject;

@Controller
public class DomainController {
	
	@Autowired
	DomainFacade domainFacade;
	
	@RequestMapping(value="/domain/")
	public Domain getListOfDomain(){
		return domainFacade.getAllDomain();
	}
	
	@RequestMapping(value="/domain/{domainName}")
	public Subject getListOfSubject(@PathVariable("domainName") String domainName){
		return domainFacade.getAllSubject(domainName);
	}
	
}
