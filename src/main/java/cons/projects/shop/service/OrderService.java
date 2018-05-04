package cons.projects.shop.service;

import java.util.List;

import cons.projects.shop.data.CartOrder;

public interface OrderService {
	
	public CartOrder addOrder(CartOrder order);
	
	public CartOrder editOrder(CartOrder order);
	
	public void deleteOrder(CartOrder order);
	
	public CartOrder getById(Long id);
	
	public List<CartOrder> getAll();

}
