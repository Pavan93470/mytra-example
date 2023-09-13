package com.evoke.myntra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.evoke.myntra.entity.OrderTrackingEntity;

@Repository
public interface OrderTrackingRepository extends JpaRepository<OrderTrackingEntity, Long> {

}
