package com.pt.dl.domains;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pt.dl.utility.SimpleHibernateTemplate;
import com.pt.sl.domain.Domain;

@Repository("domainDaoImpl")
public class DomainDaoImpl implements DomainDao {

	SimpleHibernateTemplate<Domain> simpleHibernateTemplate;
	
	@Autowired
	public DomainDaoImpl(SessionFactory sessionFactory) {
		simpleHibernateTemplate = new SimpleHibernateTemplate<Domain>(sessionFactory);
	}

	@Transactional
	public Domain getDomain() {
		//fetching from db
	Criteria domainCriteria = simpleHibernateTemplate.createCriteria(Domain.class);
	domainCriteria.list();
		return (Domain) domainCriteria.list().get(0);
	}

}
