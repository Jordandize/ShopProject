package cons.projects.shop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cons.projects.shop.data.Item;
import cons.projects.shop.enums.Color;
import cons.projects.shop.enums.Size;
import cons.projects.shop.service.ItemService;

@RestController
public class Tester {

	@Autowired
	private ItemService itemService;
	
	@GetMapping(value = "/test")
	public String test() {
		setTestData();
		return "Success!";
	}
	
	private void setTestData() {
		setItemTestData();
	}
	
	private void setItemTestData() {
		for (Item item : testItems()) {
			itemService.addItem(item);
		}
	}
	
	public List<Item> testItems() {
		List<Item> items = new ArrayList<>();
		items.add(testItem1());
		items.add(testItem2());
		items.add(testItem3());
		items.add(testItem4());
		items.add(testItem5());
		return items;
	}
	
	private Item testItem1() {
		Collection<Size> sizes = new ArrayList<>();
		sizes.add(Size.S);
		sizes.add(Size.L);
		sizes.add(Size.XXL);
		
		Collection<Color> colors = new ArrayList<>();
		colors.add(Color.DARKORANGE);
		colors.add(Color.DARKTURQUOISE);
		colors.add(Color.BLACK);
		
		Item i1 = new Item();
		i1.setName("Creative hand band");
		i1.setDescription("Black and Yellow. Also Blue. For every style.");
		i1.setPrice(40);
		i1.setSizes(sizes);
		i1.setColors(colors);
		return i1;
	}
	
	private Item testItem2() {
		Collection<Size> sizes = new ArrayList<>();
		sizes.add(Size.L);
		sizes.add(Size.XXL);
		
		Collection<Color> colors = new ArrayList<>();
		colors.add(Color.DARKORANGE);
		colors.add(Color.BLACK);
		
		Item i1 = new Item();
		i1.setName("Stylish T-Shirt E-40");
		i1.setDescription("New Collection! Only Summer mood 4 you.");
		i1.setPrice(60);
		i1.setSizes(sizes);
		i1.setColors(colors);
		return i1;
	}
	
	private Item testItem3() {
		Collection<Size> sizes = new ArrayList<>();
		sizes.add(Size.XXL);
		
		Collection<Color> colors = new ArrayList<>();
		colors.add(Color.DARKORANGE);
		
		Item i1 = new Item();
		i1.setName("Original sneakers YYH");
		i1.setDescription("So now there a darkorange best sneakers. Limited edition.");
		i1.setPrice(100);
		i1.setSizes(sizes);
		i1.setColors(colors);
		return i1;
	}
	
	private Item testItem4() {
		Collection<Size> sizes = new ArrayList<>();
		sizes.add(Size.S);
		sizes.add(Size.L);
		
		Collection<Color> colors = new ArrayList<>();
		colors.add(Color.DARKTURQUOISE);
		colors.add(Color.BLACK);
		
		Item i1 = new Item();
		i1.setName("Branded Cap - Next Row");
		i1.setDescription("Special design, low cost, very nice.");
		i1.setPrice(45);
		i1.setSizes(sizes);
		i1.setColors(colors);
		return i1;
	}
	
	private Item testItem5() {
		Collection<Size> sizes = new ArrayList<>();
		sizes.add(Size.S);
		sizes.add(Size.L);
		sizes.add(Size.XL);
		
		Collection<Color> colors = new ArrayList<>();
		colors.add(Color.BLACK);
		
		Item i1 = new Item();
		i1.setName("Survival cargo pants");
		i1.setDescription("We do it! Now its available in our shop. Special model.");
		i1.setPrice(70);
		i1.setSizes(sizes);
		i1.setColors(colors);
		return i1;
	}
}
