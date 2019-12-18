package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Feedback;
import com.example.service.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;

	@PostMapping(value="/enterFeedback")
	public ResponseEntity<String> enterFeedback(@RequestBody Feedback feedback)
	{		
		boolean status = feedbackService.saveFeedback(feedback);
		if(status)
			return ResponseEntity.status(HttpStatus.OK).body("Data Saved Successfully");
		else
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Data Could not be saved successfully");
	}
}