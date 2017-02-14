package com.pt.sl.domains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pt.dl.domains.domainDaoImpl;
import com.pt.sl.domain.Domain;

@Service("domainServiceImpl")
public class DomainServiceImpl implements DomainService {

	@Autowired
	@Qualifier("domainDaoImpl")
	DomainDao domainDaoImpl;
	
	public Domain getDomain() {
		
		return domainDaoImpl.getDomain();
	}

}
