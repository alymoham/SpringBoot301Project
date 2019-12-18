package com.eatza.order.feinclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.eatza.order.model.Feedback;

@FeignClient("feedback-service")
@RequestMapping("user")
public interface FienClients {
	
	@PostMapping("feedback")
	public ResponseEntity<Void> addFeedback(@RequestBody Feedback feedback);

}
