package com.eatza.order.service.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.eatza.order.model.Feedback;

@Service
public class KafkaSender {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	String kafkaTopic = "restaurant_order_notification12";
	
	public void send(String message) {
	    
		kafkaTemplate.send(kafkaTopic, message);
	}
}