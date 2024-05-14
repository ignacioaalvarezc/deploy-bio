package com.sys.bio.back.repositories.order;

import com.sys.bio.back.models.order.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {

}
