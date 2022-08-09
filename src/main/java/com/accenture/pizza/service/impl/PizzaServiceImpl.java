package com.accenture.pizza.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.pizza.bean.PizzaBean;
import com.accenture.pizza.convertor.Convertor;
import com.accenture.pizza.dao.PizzaDao;
import com.accenture.pizza.entity.PizzaEntity;
import com.accenture.pizza.service.PizzaService;

@Service
public class PizzaServiceImpl implements PizzaService{
	@Autowired
	PizzaDao pizzaDao;
	
	@Override
	public void add(PizzaBean pizzaBean) {
		PizzaEntity pizzaEntity = Convertor.toPizzaEntity(pizzaBean);
		pizzaDao.save(pizzaEntity);
	}

	@Override
	public List<PizzaEntity> findall() {
		// TODO Auto-generated method stub
		return pizzaDao.findAll();
	}

	@Override
	public Map<String, String> findallAndGivePizzaIdAndName() {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		List<PizzaEntity> pizzaList = findall();
		
		for(PizzaEntity p : pizzaList) {
			map.put(Integer.toString(p.getPizzaId()), p.getPizzaName());
		}
		
		return map;
	}

	@Override
	public Integer getPriceByPizzaId(Integer id) {
		// TODO Auto-generated method stub
		PizzaEntity pizza = pizzaDao.findById(id).orElse(null);
		if(null == pizza) {
			return null;
		}
		return pizza.getPrice();
	}
}
