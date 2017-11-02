package com.kash.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Test")
public class Test {
	
	@Id
	@Column(name = "TESTNO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer testNo;

	@Column(name = "TESTMESSAGE")
	protected String testMessage;

	public Integer getTestNo() {
		return testNo;
	}

	public void setTestNo(Integer testNo) {
		this.testNo = testNo;
	}

	public String getTestMessage() {
		return testMessage;
	}

	public void setTestMessage(String testMessage) {
		this.testMessage = testMessage;
	}
	
	
	
}
