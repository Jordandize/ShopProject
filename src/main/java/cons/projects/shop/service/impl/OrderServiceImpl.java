package cons.projects.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cons.projects.shop.dao.OrderDao;
import cons.projects.shop.data.CartOrder;
import cons.projects.shop.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDao orderDao;

	@Override
	public CartOrder addOrder(CartOrder order) {
		return orderDao.saveAndFlush(order);
	}

	@Override
	public CartOrder editOrder(CartOrder order) {
		return orderDao.saveAndFlush(order);
	}

	@Override
	public void deleteOrder(CartOrder order) {
		orderDao.delete(order);
	}

	@Override
	public CartOrder getById(Long id) {
		return orderDao.findById(id).get();
	}

	@Override
	public List<CartOrder> getAll() {
		return orderDao.findAll();
	}

}
