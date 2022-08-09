package com.accenture.pizza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.pizza.bean.BillRangeBean;
import com.accenture.pizza.bean.PizzaOrderBean;
import com.accenture.pizza.convertor.Convertor;
import com.accenture.pizza.dao.PizzaOrderDao;
import com.accenture.pizza.entity.PizzaOrderEntity;
import com.accenture.pizza.service.PizzaOrderService;
import com.accenture.pizza.service.PizzaService;

@Service
public class PizzaOrderServiceImpl implements PizzaOrderService{

	@Autowired
	PizzaService pizzaService;
	
	@Autowired
	PizzaOrderDao pizzaOrderDao;
	
	@Override
	public void add(PizzaOrderBean pizzaOrderBean) {
		// TODO Auto-generated method stub
		PizzaOrderEntity pizzaOrderEntity;
		Double totalPrice;
		totalPrice = (double) (pizzaService.getPriceByPizzaId(pizzaOrderBean.getPizzaId()) * pizzaOrderBean.getQuantity());
		pizzaOrderBean.setBill(totalPrice);
		pizzaOrderEntity = Convertor.toPizzaOrderEntity(pizzaOrderBean);
		System.out.println(pizzaOrderEntity);
		pizzaOrderDao.save(pizzaOrderEntity);
	}

	@Override
	public List<PizzaOrderEntity> findAll() {
		// TODO Auto-generated method stub
		return (List<PizzaOrderEntity>) pizzaOrderDao.findAll();
	}

	@Override
	public List<PizzaOrderEntity> findByBillBetween(BillRangeBean billRangeBean) {
		// TODO Auto-generated method stub
		return pizzaOrderDao.findByBillBetweenOrderByBill(Double.valueOf(billRangeBean.getFromPrice()), Double.valueOf(billRangeBean.getToPrice()));
	}

}
