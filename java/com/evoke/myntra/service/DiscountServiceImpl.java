package com.evoke.myntra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evoke.myntra.dto.DiscountDto;
import com.evoke.myntra.repository.DiscountRepository;

@Service
public class DiscountServiceImpl implements DiscountService {
	@Autowired
	private DiscountRepository discountRepository;

	@Override
	public DiscountDto create(DiscountDto discont) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DiscountDto> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiscountDto update(DiscountDto DiscountDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiscountDto getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
