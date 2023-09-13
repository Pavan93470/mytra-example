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

import com.evoke.myntra.dto.PriceDto;
import com.evoke.myntra.service.PriceService;

@RestController
@RequestMapping("/api")
public class PriceController {
	private static final Logger log = LoggerFactory.getLogger(PriceController.class);

	@Autowired
	private PriceService itemPriceService;

	@PostMapping("/items-price")
	public ResponseEntity<String> saveItems(@RequestBody PriceDto item) {
		log.info("creating item {}", item);

		itemPriceService.create(item);
		return new ResponseEntity<String>("price assigned  successfully", HttpStatus.CREATED);

	}

	@GetMapping("/items-price")
	public ResponseEntity<List<PriceDto>> getItems(PriceDto item) {
		List<PriceDto> items = itemPriceService.getAll();
		return new ResponseEntity<List<PriceDto>>(items, HttpStatus.OK);
	}

	@GetMapping("/items-price/{id}")
	public ResponseEntity<PriceDto> getById(@PathVariable("id") Long id) {
		PriceDto item = itemPriceService.getById(id);
		return new ResponseEntity<PriceDto>(item, HttpStatus.OK);
	}

	@DeleteMapping("/items-price/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
		itemPriceService.delete(id);
		return new ResponseEntity<String>("Item Deleted Successfully", HttpStatus.OK);
	}
//
//	@PutMapping("/items-price/{id}")
//	public ResponseEntity<String> update(double price, double discountPercentage, @PathVariable long id) {
//		itemPriceService.getPriceAfterDiscount(price, discountPercentage, id);
//		return new ResponseEntity<String>("price updated Successfully", HttpStatus.OK);
//	}
}
