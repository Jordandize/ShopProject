package cons.projects.shop.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cons.projects.shop.data.Cart;
import cons.projects.shop.data.CartItem;

@Controller
public class CartController {
	
	@Autowired
	private Cart cart;
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public ModelAndView cart() {
		ModelAndView mv = new ModelAndView("cart");
		mv.addObject("cartItems", cart.getCartItems());
		mv.addObject("total", cart.getTotal());
		return mv;
	}
	
	@RequestMapping(value = "/cart", method = RequestMethod.POST)
	public ModelAndView cartAddItem(@ModelAttribute("cartItem") @Valid CartItem cartItem, BindingResult results, Errors errors) {
		ModelAndView mv = new ModelAndView("redirect:/item/" + cartItem.getItem().getId());
		if(!results.hasErrors()) {
			cart.getCartItems().add(cartItem);
		}
		return mv;
	}
	
	@RequestMapping(value = "/cart/{cartItemIndex}", method = RequestMethod.GET)
	public ModelAndView cartDelete(@PathVariable("cartItemIndex") int cartItemIndex) {
		ModelAndView mv = new ModelAndView("redirect:/cart");
		try {
		cart.getCartItems().remove(cartItemIndex);
		} catch (Exception ignore) { }
		return mv;
	}

}
