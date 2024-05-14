package com.sys.bio.back.repositories.order;

import com.sys.bio.back.models.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByPickUpDateBetween(Date startDate, Date endDate);

    int countByEnabledFalse();
}
