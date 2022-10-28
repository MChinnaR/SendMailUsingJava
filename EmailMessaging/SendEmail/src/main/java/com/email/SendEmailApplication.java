package com.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.email.mailsender.Email;

@SpringBootApplication
public class SendEmailApplication {

	@Autowired
	private Email email;

	public static void main(String[] args) {
		SpringApplication.run(SendEmailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendingEmail() {
		email.sendEMail("chinnareddy13318@gmail.com", "My First Testing Mail", "<h1>MONDEM CHINNA REDDY</H1>");
	}

}
