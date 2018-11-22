package com.cg.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.dto.Client;

import com.cg.service.IForumService;





@Controller
public class ForumController {
	
	@Autowired
	IForumService forumservice;
	

	@RequestMapping(value="searchqueryid")
	public String searchData() {
		System.out.println("in controller return serchq()");
		return "searchquery";

	}
	@RequestMapping(value="querysearch")
	public ModelAndView dataSearch(@ModelAttribute("yy") Client clt,Map<String,Object> model) {
	
		Client traineeRes = forumservice.fetch(clt.getQueryid());
		int id = clt.getQueryid();
		if(traineeRes==null || traineeRes.getQueryid()==0)
		{
			return new ModelAndView("failure","queryid",id);
		}
		else{
		Client querySearch=forumservice.fetch(clt.getQueryid());
		querySearch.setQueryid(clt.getQueryid());
		
		
		List<String> soln=new ArrayList<>();
		soln.add("Uma");
		soln.add("Rahul");
		soln.add("Kavita");
		soln.add("Hema");
		model.put("sol",soln);
		model.put("querySearch", querySearch);
		return new ModelAndView("showsearch","temp",querySearch);
		}
	}
	@RequestMapping(value="update")
	public ModelAndView updateData(@ModelAttribute("yy") Client clt) {
		System.out.println("in controller return update()");
		int id = clt.getQueryid();
		forumservice.updatequery(clt);
		return new ModelAndView("UpdateSuccess","queryid",id);

	}
	}

	
