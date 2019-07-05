package com.ibank.card.offers.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//done with eclipse
@RestController
@RequestMapping("/cle")

public class CCLEController {
	
	@RequestMapping(value="/healthCheck", method=RequestMethod.GET,produces="text/html")
	
	public String healthCheck(){
		return "CCLE Service is working fine....";
	}

}
