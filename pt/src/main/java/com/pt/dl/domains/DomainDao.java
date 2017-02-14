package com.pt.dl.domains;

import org.springframework.stereotype.Repository;

import com.pt.sl.domain.Domain;

@Repository
public interface DomainDao {
	
	Domain getDomain();
}
