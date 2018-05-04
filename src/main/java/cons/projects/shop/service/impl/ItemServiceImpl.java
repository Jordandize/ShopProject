package cons.projects.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cons.projects.shop.dao.ItemDao;
import cons.projects.shop.data.Item;
import cons.projects.shop.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemDao itemDao;
	
	@Override
	public Item addItem(Item item) {
		return itemDao.saveAndFlush(item);
	}

	@Override
	public Item editItem(Item item) {
		return itemDao.saveAndFlush(item);
	}

	@Override
	public void deleteItem(Item item) {
		itemDao.delete(item);
	}

	@Override
	public Item getById(Long id) {
		return itemDao.findById(id).get();
	}

	@Override
	public List<Item> getAll() {
		return itemDao.findAll();
	}

	public ItemDao getItemDao() {
		return itemDao;
	}

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	
}
