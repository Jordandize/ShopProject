package cons.projects.shop.data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import cons.projects.shop.enums.Color;
import cons.projects.shop.enums.Size;

@Entity
public class CartItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Min(1)
	private Integer amount;
	
	@NotNull
	private Size size;
	
	@NotNull
	private Color color;
	
	@NotNull
	@OneToOne(fetch = FetchType.LAZY)
	private Item item;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CartItem [id=");
		builder.append(id);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", size=");
		builder.append(size);
		builder.append(", color=");
		builder.append(color);
		builder.append(", item=");
		builder.append(item);
		builder.append("]");
		return builder.toString();
	}

}
