package com.example.kafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
	
	
	//KafkaTemplate<Name of the topic , Value>
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMsgToTopic(String message) {
		//Send a message with routing information in message headers. The message payloadmay be converted before sending.
		kafkaTemplate.send("name_Of_Topic",message); // here we set the name of the topic and message for kafkatemplate
	}

	public void sendMsgToTopic1(String msg1) {
		// TODO Auto-generated method stub
		kafkaTemplate.send("topic1", msg1);
		
	}

}


//Whenever we sent a message from the producer through a template to a topic it has to be serialised  means that string has converted into type of bytes
//Thats why we mentioned in application.yml that both the key and value are serialised in template.  Producer ---> String ---> Bytes --->to topic ---> consumer
//             serialization
//      String    ------->    Bytes