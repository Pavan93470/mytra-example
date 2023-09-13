package com.evoke.myntra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evoke.myntra.dto.OrderInputDto;
import com.evoke.myntra.dto.OrderResponseDto;
import com.evoke.myntra.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderManagementController {
	@Autowired
	private OrderService orderService;

	private static final Logger log = LoggerFactory.getLogger(OrderManagementController.class);

	@PostMapping("/order")
	public ResponseEntity<OrderResponseDto> create(@RequestBody OrderInputDto orderInputDto) {
		log.info("creating  {}", orderInputDto);

		orderService.create(orderInputDto);
		return new ResponseEntity<OrderResponseDto>(HttpStatus.CREATED);

	}
}