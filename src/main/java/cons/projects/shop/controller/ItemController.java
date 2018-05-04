package cons.projects.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cons.projects.shop.data.CartItem;
import cons.projects.shop.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = { "/item", "/index", "/" }, method = RequestMethod.GET)
	public ModelAndView store() {
		ModelAndView mv = new ModelAndView("store");
		mv.addObject("items", itemService.getAll());
		return mv;
	}
	
	@RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
	public ModelAndView item(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView("item");
		mv.addObject("cartItem", new CartItem());
		mv.addObject("item", itemService.getById(id));
		return mv;
	}
	
}
