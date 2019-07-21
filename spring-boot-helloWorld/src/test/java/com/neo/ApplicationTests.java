package com.neo;

import com.neo.controller.HelloWorldController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * 单元测试 todo
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	private MockMvc mvc;

	@Before
	public void setUp()throws Exception{
		mvc=MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
	}

//	public  void getHello() throws{
////		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
////				.andExpect();
//	}
	@Test
	public void contextLoads() {
		System.out.println("hello word");
	}

}
