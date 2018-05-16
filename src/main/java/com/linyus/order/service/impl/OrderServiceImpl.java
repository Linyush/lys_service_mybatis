package com.linyus.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.linyus.domain.order.OrderDO;
import com.linyus.order.dao.OrderDao;
import com.linyus.order.service.OrderService;

/**
 * create by eason on 2018年5月16日
 */
@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDao orderDao;

	@Override
	public void save(OrderDO order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(OrderDO order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(OrderDO order) {
		// TODO Auto-generated method stub

	}

	@Override
	public OrderDO findOne(OrderDO order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDO> findAll(OrderDO order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<OrderDO> findPage(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

}
