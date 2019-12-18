
package com.eatza.orderingservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.eatza.order.OrderingserviceApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderingserviceApplication.class)
public class OrderingserviceApplicationTests {
	
	@Test
    public void loginTest()  {
		System.out.println("Hellooo");
    }
	
}
