package com.websystique.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.websystique.springboot.model.Customer;
import com.websystique.springboot.service.MTService;

@RestController
@RequestMapping("/api")
public class MTController {
	
	public static final Logger logger = LoggerFactory.getLogger(MTController.class);
	
	@Autowired
	private MTService mtService;

	
	@RequestMapping(value = "/customer/", method = RequestMethod.POST)
	public String createUser(@RequestBody Customer customer, UriComponentsBuilder ucBuilder) {
		logger.info("::: Creating customer : {}", customer);
		
		Long custid = mtService.customerVerifyReq(customer);
		if(custid>0){
			return "success";
		}else{
			return "failure";
		}

		/*if (userService.isUserExist(user)) {
			logger.error("Unable to create. A User with name {} already exist", user.getName());
			return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " + 
			user.getName() + " already exist."),HttpStatus.CONFLICT);
		}
		userService.saveUser(user);*/

		/*HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/customer/{id}").buildAndExpand(custid).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);*/
	}
	
}
