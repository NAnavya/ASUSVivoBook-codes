package com.example.kafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkademo.service.ProducerService;

@RestController
@RequestMapping("/rest/api")
public class RestControllerForKafkaMsg {
	
	@Autowired ProducerService producer;
	
	//Here It is the consumer tolisten from producer
	@GetMapping("/producerMsg")
	public void getMessageFromClient(@RequestParam("message") String msg) {
		producer.sendMsgToTopic(msg);
	}
	
	@GetMapping("/producerMsg1/{msg1}")
	public void getMessage1(@RequestParam("msg1") String msg1) {
		producer.sendMsgToTopic1(msg1);
	}

}
