package com.cg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="query_master")

public class Client {
	@Id
	@Column(name="query_id")
	@NotNull(message="Enter query ID")
	private Integer queryid;
	
	@Column(name="technology")
	@NotEmpty(message="Enter technology Name")
	private String technology;
	
	@Column(name="query_raised_by")
	@NotEmpty(message="Enter queryraisedby  Name")
	private String queryraisedby;
	
	@Column(name="query")
	@NotEmpty(message="Enter query")
	private String query;
	

	@Column(name="solutions")
	@NotEmpty(message="Enter solution")
	private String solutions;
	
	
	@Column(name="solution_given_by")
	@NotEmpty(message="Enter solution given by  Name")
	private String solutionsgivenby;
	
	public Integer getQueryid() {
		return queryid;
	}
	public void setQueryid(Integer queryid) {
		this.queryid = queryid;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getQueryraisedby() {
		return queryraisedby;
	}
	public void setQueryraisedby(String queryraisedby) {
		this.queryraisedby = queryraisedby;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getSolutions() {
		return solutions;
	}
	public void setSolutions(String solutions) {
		this.solutions = solutions;
	}
	public String getSolutionsgivenby() {
		return solutionsgivenby;
	}
	public void setSolutionsgivenby(String solutionsgivenby) {
		this.solutionsgivenby = solutionsgivenby;
	}
	@Override
	public String toString() {
		return "Client [queryid=" + queryid + ", technology=" + technology
				+ ", queryraisedby=" + queryraisedby + ", query=" + query
				+ ", solutions=" + solutions + ", solutionsgivenby="
				+ solutionsgivenby + "]";
	}
	public Client(Integer queryid, String technology, String queryraisedby,
			String query, String solutions, String solutionsgivenby) {
		super();
		this.queryid = queryid;
		this.technology = technology;
		this.queryraisedby = queryraisedby;
		this.query = query;
		this.solutions = solutions;
		this.solutionsgivenby = solutionsgivenby;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
