package com.sns.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.iotdata.model.PublishRequest;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.SubscribeRequest;

@RestController
public class SnsController {
	@Autowired
	private AmazonSNSClient amazonSNSClient;
	
	private String TOPIC_ARN ="";
	
	@GetMapping("/subscribe/{email}")
	public String subscribe(@PathVariable("email") String email) {
		SubscribeRequest subscribeRequest = new SubscribeRequest(TOPIC_ARN, "email", email);
		amazonSNSClient.subscribe(subscribeRequest);
		return "Success";
	}
}
