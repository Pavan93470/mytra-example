package com.evoke.myntra.service;

import java.util.List;

import com.evoke.myntra.dto.DiscountDto;

public interface DiscountService {
	public DiscountDto create(DiscountDto discont);

	public List<DiscountDto> getAll();

	public DiscountDto update(DiscountDto DiscountDto);

	public Boolean delete(Long id);

	public DiscountDto getById(Long id);

}
