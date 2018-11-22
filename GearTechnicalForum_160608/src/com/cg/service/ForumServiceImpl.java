package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.IForumDAO;
import com.cg.dto.Client;


@Service("forumservice")
@Transactional
public class ForumServiceImpl implements IForumService {
	
	@Autowired
	IForumDAO forumdao;

	@Override
	public Client searchquery(Integer queryid) {
		return forumdao.searchquery(queryid);
		
	}
	
	

	@Override
	public void updatequery(Client clt) {
		forumdao.updatequery(clt);
		
	}

	@Override
	public Client fetch(Integer queryid) {
		// TODO Auto-generated method stub
		return forumdao.fetch(queryid);
	}

}
