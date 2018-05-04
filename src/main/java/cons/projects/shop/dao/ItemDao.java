package cons.projects.shop.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cons.projects.shop.data.Item;

public interface ItemDao extends JpaRepository<Item, Long> {
	
	public Optional<Item> findById(Long id);
	
}
