package com.trabajo.email.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

//este archivo va a contener los datos basicos para conectarse a la cuenta de gmail

@Configuration
public class emailConfiguration {
	@Bean
	public JavaMailSender javaMailSender() {
		JavaMailSenderImpl mailSender=new JavaMailSenderImpl();
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587);
		mailSender.setUsername("dc8987835@gmail.com");
		mailSender.setPassword("rdcv regs uyme xbsa");
		
		Properties properties=mailSender.getJavaMailProperties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		return mailSender;

		
	}
}