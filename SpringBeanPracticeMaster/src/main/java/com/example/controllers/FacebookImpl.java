package com.example.controllers;

import com.example.vo.IPRange;

public class FacebookImpl {
	private IPRange ipRange;
	private DatabaseRepoImpl dbr;
	
	public FacebookImpl(IPRange ipRange, DatabaseRepoImpl dbr) {
		this.ipRange = ipRange;
		this.dbr = dbr;
	}
}
