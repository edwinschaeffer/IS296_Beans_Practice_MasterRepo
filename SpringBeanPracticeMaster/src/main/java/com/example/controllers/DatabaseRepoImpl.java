package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.vo.IPRange;

// @Component, @Service, @Controller, @Repository are the same

public class DatabaseRepoImpl {
	
    private IPRange ipr;
    
    @Autowired
    private void setIPRange(@Qualifier("myIPR") IPRange ipr) {
    	System.out.println(ipr.getLowerIPRange());
    	this.ipr = ipr;
    }
    
}
