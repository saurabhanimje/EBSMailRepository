package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MailDetails;
import com.example.demo.service.MailService;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/mail")
public class MailController 
{
	@Autowired MailService mService;

	@PostMapping("/send_SimpleMail")
	public ResponseEntity<String> onsendSimpleMail(@RequestBody MailDetails mDetails)
	{
		mService.onsendMail(mDetails);
		return new ResponseEntity<String>("Mail Sended", HttpStatus.OK);
	}
	
	
}
