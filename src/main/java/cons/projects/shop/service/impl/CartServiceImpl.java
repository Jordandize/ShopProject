package cons.projects.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cons.projects.shop.dao.CartDao;
import cons.projects.shop.data.Cart;
import cons.projects.shop.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartDao;
	
	@Override
	public Cart addCart(Cart cart) {
		return cartDao.saveAndFlush(cart);
	}

	@Override
	public Cart editCart(Cart cart) {
		return cartDao.saveAndFlush(cart);
	}

	@Override
	public void deleteCart(Cart cart) {
		cartDao.delete(cart);
	}

	@Override
	public Cart getById(Long id) {
		return cartDao.findById(id).get();
	}

	@Override
	public List<Cart> getAll() {
		return cartDao.findAll();
	}

}
