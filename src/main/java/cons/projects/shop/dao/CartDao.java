package cons.projects.shop.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cons.projects.shop.data.Cart;

public interface CartDao extends JpaRepository<Cart, Long> {
	
	public Optional<Cart> findById(Long id);

}
