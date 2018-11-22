package com.cg.dao;

import com.cg.dto.Client;

public interface IForumDAO {
	public Client searchquery(int queryid);
	public void updatequery(Client clt);
	public Client fetch(int queryid);
}
