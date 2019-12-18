package com.example.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.example.entity.Feedback;
import com.example.service.FeedbackService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(FeedbackController.class)
public class FeedbackControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	FeedbackService feedbackService;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Test
	public void enterFeedbackSuccessResponseTest() throws Exception
	{
		Feedback feedback = new Feedback();
		
		when(feedbackService.saveFeedback(any(Feedback.class))).thenReturn(true);
		RequestBuilder request = MockMvcRequestBuilders.post(
				"/enterFeedback")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString((feedback)));
		mockMvc.perform(request)
		.andExpect(status().is(200))
		.andReturn();
	}
	
	@Test
	public void enterFeedbackFailureResponseTest() throws Exception
	{
		Feedback feedback = new Feedback();
		
		when(feedbackService.saveFeedback(any(Feedback.class))).thenReturn(false);
		RequestBuilder request = MockMvcRequestBuilders.post(
				"/enterFeedback")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString((feedback)));
		mockMvc.perform(request)
		.andExpect(status().is(500))
		.andReturn();
	}
}
