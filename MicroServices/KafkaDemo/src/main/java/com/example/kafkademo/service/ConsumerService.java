package com.example.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
     //ABOUT GROUPID
	//Here the groupId is must for kafka make to be a faultTolerance and scalable
	//for Eg if we have 100's of consumers listening to the single topic and for scalability that messagetopic(Broker) is internally divided into multiple partitions.Each partition is a replica of some data inorder to reduce the load on data/from one single partition.
	//The task of GroupId is to group these consumers based on groupId so that the load can be balanced in these broker(topic) and bombard the first partition that multiple request can read so that 1st consumer can read from 1st partition and 2nd consumer from 2nd partition
	//so for same topic listener consumer we are grouping  with same groupId finally those partitions are equally balanced between all the consumers in a  particular group sothat we cannot bombard with a pull request from the consumer
	// observe the diagram 
	
	
	@KafkaListener(topics = "name_Of_Topic",groupId="first_group")  // This annotation says that this class/method are capable enough to be a KafkaListener  or a consumer to the kafka topic(message named as topic)
	public void listenToTopic(String receivedMessage) {
		System.out.println("The message received is"+receivedMessage);
	}
	
	@KafkaListener(topics="topic1",groupId="first_group")
	public void listener1(String msg1) {
		System.out.println("Message received  from Topic1:"+msg1);
	}
}
