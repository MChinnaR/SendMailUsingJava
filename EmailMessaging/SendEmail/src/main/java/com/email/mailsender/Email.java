package com.email.mailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class Email {
//	Before using this we have to enable the setting in mail 
//	open gmail --> security --> Below 2 step verification App Password 
	// select others--> create password copy password past in application.proprties

	@Autowired
	private JavaMailSender mailSender;

	public static final String MAILID = "chinna.mondem@gmail.com";

	public void sendEMail(String toMail, String subject, String body) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(MAILID);
		message.setTo(toMail);
		message.setSubject(subject);
		message.setText(body);
		try {
			mailSender.send(message);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("mail not send success");
		}
		System.out.println("mail send success");

	}

}
