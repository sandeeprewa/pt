package com.pt.dl.domains;

import org.springframework.stereotype.Repository;

import com.pt.sl.domain.Domain;

@Repository("domainDaoImpl")
public class DomainDaoImpl implements DomainDao {

	public Domain getDomain() {
		//talk to db and return Domain
		return null;
	}

}
