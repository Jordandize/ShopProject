package cons.projects.shop.service;

import java.util.List;

import cons.projects.shop.data.Cart;

public interface CartService {
	
	public Cart addCart(Cart cart);
	
	public Cart editCart(Cart cart);
	
	public void deleteCart(Cart cart);
	
	public Cart getById(Long id);
	
	public List<Cart> getAll();

}
