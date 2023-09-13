package com.evoke.myntra.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evoke.myntra.dto.OrderTracking;
import com.evoke.myntra.entity.OrderTrackingEntity;
import com.evoke.myntra.repository.OrderTrackingRepository;

@Service
public class OrderTrackingServiceImpl implements OrderTrackingService {
	@Autowired
	private OrderTrackingRepository orderTrackingRepository;
	ModelMapper mapper = new ModelMapper();

	@Override
	public OrderTracking create(OrderTracking OrderTracking) {
		OrderTrackingEntity orderTrackingEntity = mapper.map(OrderTracking, OrderTrackingEntity.class);
		OrderTrackingEntity order = orderTrackingRepository.save(orderTrackingEntity);
		OrderTracking OrderTrackingDto = mapper.map(order, OrderTracking.class);
		return OrderTrackingDto;
	}

}
