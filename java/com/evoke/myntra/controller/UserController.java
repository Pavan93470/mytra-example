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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evoke.myntra.dto.UserAddressDto;
import com.evoke.myntra.dto.UserCartDto;
import com.evoke.myntra.dto.UserDto;
import com.evoke.myntra.service.AddressService;
import com.evoke.myntra.service.UserService;

@RestController
@RequestMapping("/api")

public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService UserService;
	@Autowired
	AddressService addressService;

	@PostMapping("/users")
	public ResponseEntity<String> save(@RequestBody UserDto person) {
		log.info("creating item {}", person);
		UserService.create(person);
		return new ResponseEntity<String>("user created successfully", HttpStatus.CREATED);

	}

	@PutMapping("/users")
	public ResponseEntity<UserDto> assignCartToPerson(@RequestBody UserCartDto userCartDto) {
		UserDto userDto = UserService.assignCartToPerson(userCartDto.getCartid(), userCartDto.getUserid());

		return new ResponseEntity<UserDto>(userDto, HttpStatus.CREATED);

	}

	@PutMapping("/assign-address")
	public ResponseEntity<UserDto> assignAddresstoUser(@RequestBody UserAddressDto UserAddressDto) {
		UserDto useraddressDto = UserService.assignAddressToUser(UserAddressDto.getAddressId(),
				UserAddressDto.getUserid());
		return new ResponseEntity<UserDto>(useraddressDto, HttpStatus.CREATED);

	}

	@GetMapping("/users")
	public ResponseEntity<List<UserDto>> getItems(UserDto user) {
		List<UserDto> users = UserService.getAll();
		return new ResponseEntity<List<UserDto>>(users, HttpStatus.OK);
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<UserDto> getById(@PathVariable("id") Long id) {
		UserDto users = UserService.getById(id);
		return new ResponseEntity<UserDto>(users, HttpStatus.OK);
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
		UserService.delete(id);
		return new ResponseEntity<String>("Item Deleted Successfully", HttpStatus.OK);
	}

}
