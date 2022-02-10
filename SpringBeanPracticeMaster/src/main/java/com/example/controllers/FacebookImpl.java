package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.vo.IPRange;

@Component
public class FacebookImpl {
	private IPRange ipRange;
	private DatabaseRepoImpl dbr;
	
	@Autowired
	public FacebookImpl(@Qualifier("getIPRLocal") IPRange ipRange, DatabaseRepoImpl dbr) {
		System.out.println(ipRange.getLowerIPRange());
		this.ipRange = ipRange;
		this.dbr = dbr;
	}
	
	public FacebookImpl() {}
}
