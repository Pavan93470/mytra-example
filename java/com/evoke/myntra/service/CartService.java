package com.evoke.myntra.service;

import java.util.List;


import com.evoke.myntra.dto.CartDto;

public interface CartService {
	public CartDto create(CartDto cartDto);

	public List<CartDto> getAll();

	public CartDto update(CartDto cartDto);

	public Boolean delete(Long id);

	public  CartDto getById(Long id);

}
