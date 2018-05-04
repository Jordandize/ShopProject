package cons.projects.shop.service;

import java.util.List;

import cons.projects.shop.data.CartItem;

public interface CartItemService {
	
	public CartItem addCartItem(CartItem cartItem);
	
	public CartItem editCartItem(CartItem cartItem);
	
	public void deleteCartItem(CartItem cartItem);
	
	public CartItem getById(Long id);
	
	public List<CartItem> getAll();

}
