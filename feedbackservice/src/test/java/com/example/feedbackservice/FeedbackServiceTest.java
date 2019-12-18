package com.example.feedbackservice;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.entity.Feedback;
import com.example.repository.FeedbackRepository;
import com.example.service.FeedbackService;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class FeedbackServiceTest {
	
	@MockBean
	FeedbackRepository feedbackRepository;
	
	@InjectMocks
	FeedbackService feedbackService;
	
	@Before
	public void init_mocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void saveFeedbackSuccessTest()
	{
		Feedback feedback = new Feedback();
		when(feedbackRepository.save(any(Feedback.class))).thenReturn(feedback);		
		assertEquals(true, feedbackService.saveFeedback(feedback));
	}
	
	@Test
	public void saveFeedbackFailureTest()
	{
		Feedback feedback = new Feedback();
		when(feedbackRepository.save(any(Feedback.class))).thenReturn(null);		
		assertEquals(false, feedbackService.saveFeedback(feedback));
	}
	
	@Test
	public void FeedbackEntityTest()
	{
		Feedback feedback = new Feedback();
		int feedback_id=100;
		String category = "Menu";
		String description = "Good Options";
		
		feedback.setFeedbackId(feedback_id);
		feedback.setCategory(category);
		feedback.setDescription(description);
		
		assertEquals(feedback_id,feedback.getFeedbackId());
		assertEquals(category,feedback.getCategory());
		assertEquals(description,feedback.getDescription());
	}
	
}
