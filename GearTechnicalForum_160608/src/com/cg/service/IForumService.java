package com.cg.service;

import com.cg.dto.Client;



public interface IForumService {
	
	public Client searchquery(Integer queryid);
	public void updatequery(Client clt);
	public Client fetch(Integer queryid);

}
