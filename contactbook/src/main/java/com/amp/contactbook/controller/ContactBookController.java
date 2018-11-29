package com.amp.contactbook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amp.contactbook.domain.ContactBookResponse;

@RestController
public class ContactBookController {

	@RequestMapping("/hello")  
    public String hello(){  
        return"Hello!";  
    }
	
	public ContactBookResponse
}
