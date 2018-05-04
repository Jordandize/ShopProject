package cons.projects.shop.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cons.projects.shop.data.CartOrder;

public interface OrderDao extends JpaRepository<CartOrder, Long> {
	
	public Optional<CartOrder> findById(Long id);

}
