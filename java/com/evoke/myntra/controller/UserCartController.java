package com.evoke.myntra.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evoke.myntra.dto.CartDto;
import com.evoke.myntra.dto.UserDto;
import com.evoke.myntra.service.CartService;

@RestController
@RequestMapping("/api")
public class UserCartController {
	private static final Logger log = LoggerFactory.getLogger(UserCartController.class);

	@Autowired
	private CartService cartService;

	@PostMapping("/cart")
	public ResponseEntity<CartDto> saveItems(@RequestBody CartDto cartDto) {
		log.info("items created successfully{}", cartDto);
		CartDto newCartDto = cartService.create(cartDto);

		return new ResponseEntity<CartDto>(newCartDto, HttpStatus.CREATED);
	}

	@GetMapping("/cart")
	public ResponseEntity<List<CartDto>> getItems(CartDto cart) {
		List<CartDto> cartDto = cartService.getAll();
		return new ResponseEntity<List<CartDto>>(cartDto, HttpStatus.OK);
	}

	@GetMapping("/cart/{id}")
	public ResponseEntity<UserDto> getById(@PathVariable("id") Long id) {
		CartDto users = cartService.getById(id);
		return new ResponseEntity<UserDto>(HttpStatus.OK);
	}

	@DeleteMapping("/cart/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
		cartService.delete(id);
		return new ResponseEntity<String>("Item Deleted Successfully", HttpStatus.OK);
	}

}
