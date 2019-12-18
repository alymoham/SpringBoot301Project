package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Feedback;
import com.example.repository.FeedbackRepository;

@Service
public class FeedbackService {
	
	@Autowired
	FeedbackRepository feedbackRepository;
	
	public boolean saveFeedback(Feedback feedback)
	{
		boolean saveStatus = true;		
		feedback = feedbackRepository.save(feedback);		
		if(feedback == null)
		{	
			saveStatus = false;
		}
		return saveStatus;
	}
}