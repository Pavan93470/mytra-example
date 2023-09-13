package com.evoke.myntra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evoke.myntra.service.EmailService;

@RestController
@RequestMapping("/api")
public class MailController {
	@Autowired
	private EmailService mailService;

	@GetMapping("/mail")
	public ResponseEntity<String> sendMail() throws Exception {

		this.mailService.sendMail();
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("success", true);
		return new ResponseEntity<String>("Mail Sent successfully", HttpStatus.OK);

	}
}