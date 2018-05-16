package com.linyus.order.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.linyus.domain.order.OrderDO;

/**
 * create by eason on 2018年5月16日
 */
public interface OrderService {

	void save(OrderDO order);

	void update(OrderDO order);

	void delete(OrderDO order);

	OrderDO findOne(OrderDO order);

	List<OrderDO> findAll(OrderDO order);

	Page<OrderDO> findPage(int page, int size);
}
