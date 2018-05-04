package cons.projects.shop.service;

import java.util.List;

import cons.projects.shop.data.Item;

public interface ItemService {
	
	public Item addItem(Item item);
	
	public Item editItem(Item item);
	
	public void deleteItem(Item item);
	
	public Item getById(Long id);
	
	public List<Item> getAll();

}
