package com.evoke.myntra.service;

import java.util.List;

import com.evoke.myntra.dto.PriceDto;

public interface PriceService {

	public PriceDto create(PriceDto item);

	public List<PriceDto> getAll();

	public PriceDto update(PriceDto PriceDto);

	public Boolean delete(Long id);

	public PriceDto getById(Long id);

}
