package cons.projects.shop.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotEmpty
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "cart_fk")
	private List<CartItem> cartItems;
	
	public Integer getTotal() {
		int total = 0;
		for (CartItem cartItem : getCartItems()) {
			total += cartItem.getAmount() * cartItem.getItem().getPrice();
		}
		return total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cart [id=");
		builder.append(id);
		builder.append(", cartItems=");
		builder.append(cartItems);
		builder.append("]");
		return builder.toString();
	}
	
}
