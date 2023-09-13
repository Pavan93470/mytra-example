package com.evoke.myntra.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.evoke.myntra.dto.AddressDto;
import com.evoke.myntra.service.AddressService;

@Controller
@RequestMapping("/api")
public class AddressController {
	private static final Logger log = LoggerFactory.getLogger(AddressController.class);

	@Autowired
	private AddressService addressService;

	@PostMapping("/address")
	public ResponseEntity<AddressDto> create(@RequestBody AddressDto addressDto) {
		log.info("Address saved successfully{}", addressDto);
		AddressDto address = addressService.create(addressDto);

		return new ResponseEntity<AddressDto>(address, HttpStatus.CREATED);

	}

	@GetMapping("/address")
	public ResponseEntity<List<AddressDto>> getall() {
		log.info("Get address");
		List<AddressDto> address = addressService.getAll();
		return new ResponseEntity<List<AddressDto>>(address, HttpStatus.OK);

	}

	@GetMapping("/address/{id}")
	public ResponseEntity<AddressDto> getById(@PathVariable("id") Long id) {
		AddressDto address = addressService.getById(id);
		return new ResponseEntity<AddressDto>(address, HttpStatus.OK);
	}

	@DeleteMapping("/address/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
		addressService.delete(id);
		return new ResponseEntity<String>("Address Deleted Successfully", HttpStatus.OK);
	}

	@PutMapping("/address/{id}")
	public ResponseEntity<String> update(@RequestBody AddressDto address) {
		addressService.update(address);
		return new ResponseEntity<String>("Address updated Successfully", HttpStatus.OK);
	}

}
