package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.dto.Client;



@Repository("forumdao")
public class ForumDAOImpl implements IForumDAO {
	
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public Client searchquery(int queryid) {
		
		return null;
	}
	public Client fetch(int queryid) {
		
		Client trainee = entitymanager.find(Client.class, queryid);
		return trainee;
	}
	@Override
	public void updatequery(Client clt) {
		Client result = entitymanager.merge(clt);
		entitymanager.flush();
	}

}
