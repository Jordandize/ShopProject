package cons.projects.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cons.projects.shop.dao.CartItemDao;
import cons.projects.shop.data.CartItem;
import cons.projects.shop.service.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	private CartItemDao cartItemDao;
	
	@Override
	public CartItem addCartItem(CartItem cartItem) {
		return cartItemDao.saveAndFlush(cartItem);
	}

	@Override
	public CartItem editCartItem(CartItem cartItem) {
		return cartItemDao.saveAndFlush(cartItem);
	}

	@Override
	public void deleteCartItem(CartItem cartItem) {
		cartItemDao.delete(cartItem);
	}

	@Override
	public CartItem getById(Long id) {
		return cartItemDao.findById(id).get();
	}

	@Override
	public List<CartItem> getAll() {
		return cartItemDao.findAll();
	}

}
