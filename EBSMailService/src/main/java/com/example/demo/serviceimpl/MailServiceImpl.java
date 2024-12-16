package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.dto.MailDetails;
import com.example.demo.service.MailService;

@Service
public class MailServiceImpl implements MailService
{

	@Autowired private JavaMailSender jmSender;
	
	@Override
	public void onsendMail(MailDetails mDetails)
	{
		SimpleMailMessage mail=new SimpleMailMessage();
		mail.setFrom("nimjesaurabh1998@gmail.com");
		mail.setTo(mDetails.getToMail());
		mail.setSubject(mDetails.getSubject());
		mail.setText(mDetails.getMailContext());
		
		jmSender.send(mail);
	
		
	}

}
