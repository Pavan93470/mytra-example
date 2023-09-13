package com.evoke.myntra.service;

import org.springframework.stereotype.Service;

import com.evoke.myntra.dto.OrderInputDto;
import com.evoke.myntra.dto.OrderResponseDto;

@Service
public interface OrderService {
	public OrderResponseDto create(OrderInputDto orderInputDto);

}
