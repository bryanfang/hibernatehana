package com.jpatest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"I312473.com.ns::table.MyTestBryan1\"")
public class Test {

	@Id
	@Column(name="ID")
	@GeneratedValue
	private Long id;
	
	@Column(name="test")
	private String test;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
}
