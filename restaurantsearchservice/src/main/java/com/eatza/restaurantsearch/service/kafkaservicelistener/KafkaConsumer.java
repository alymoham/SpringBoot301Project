package com.eatza.restaurantsearch.service.kafkaservicelistener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics="restaurant_order_notification12",groupId="group_id")
	public void consume(String message)
	{
		System.out.println(message);
	}
}