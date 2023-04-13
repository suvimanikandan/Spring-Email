package com.swethacodes.SpringEmailDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailDemoApplication {

	@Autowired
	public EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailDemoApplication.class, args);


	}

	@EventListener(ApplicationReadyEvent.class)

	public void sendEmail() {
		senderService.sendEmail("suvi.swedha22@gmail.com" ,"This is the Subject","this is the body");

	}
}
