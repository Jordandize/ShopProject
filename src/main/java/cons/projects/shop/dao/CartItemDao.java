package cons.projects.shop.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cons.projects.shop.data.CartItem;

public interface CartItemDao extends JpaRepository<CartItem, Long> {
	
	public Optional<CartItem> findById(Long id);

}
