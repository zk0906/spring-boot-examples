package com.neo.rabbit.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NeoSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	/**
	 * 一个发送者，N个接受者,经过测试会均匀的将消息发送到N个接收者中
	 * @param i
	 */
	public void send(int i) {
		String context = "spirng boot neo queue"+" ****** "+i;
		System.out.println("Sender1 : " + context);
		this.rabbitTemplate.convertAndSend("neo", context);
	}

}
