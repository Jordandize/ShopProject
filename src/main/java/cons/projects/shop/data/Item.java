package cons.projects.shop.data;

import javax.persistence.Id;

import java.util.Collection;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import cons.projects.shop.enums.Size;
import cons.projects.shop.enums.Color;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotEmpty
	private String name;

	@NotEmpty
	private String description;
	
	@NotNull
	@Min(0)
	private Integer price;
	
	@NotEmpty
	@Enumerated(EnumType.STRING)
	@ElementCollection(fetch = FetchType.LAZY)
	private Collection<Size> sizes;
	
	@NotEmpty
	@Enumerated(EnumType.STRING)
	@ElementCollection(fetch = FetchType.LAZY)
	private Collection<Color> colors;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Collection<Size> getSizes() {
		return sizes;
	}

	public void setSizes(Collection<Size> sizes) {
		this.sizes = sizes;
	}

	public Collection<Color> getColors() {
		return colors;
	}

	public void setColors(Collection<Color> colors) {
		this.colors = colors;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", price=");
		builder.append(price);
		builder.append(", sizes=");
		builder.append(sizes);
		builder.append(", colors=");
		builder.append(colors);
		builder.append("]");
		return builder.toString();
	}

}
