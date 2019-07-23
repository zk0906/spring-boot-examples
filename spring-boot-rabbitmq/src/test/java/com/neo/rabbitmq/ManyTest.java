package com.neo.rabbitmq;

import com.neo.rabbit.many.NeoSender;
import com.neo.rabbit.many.NeoSender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {
	@Autowired
	private NeoSender neoSender;

	@Autowired
	private NeoSender2 neoSender2;

	/**
	 * 一对多发送，一个发送者，N个接受者,经过测试会均匀的将消息发送到N个接收者中
	 * @throws Exception
	 */
	@Test
	public void oneToMany() throws Exception {
		for (int i=0;i<100;i++){
			neoSender.send(i);
		}
	}

	/**
	 * 多对多发送  结论：和一对多一样，接收端仍然会均匀接收到消息
	 * @throws Exception
	 */
	@Test
	public void manyToMany() throws Exception {
		for (int i=0;i<100;i++){
			neoSender.send(i);
			neoSender2.send(i);
		}
	}

}
