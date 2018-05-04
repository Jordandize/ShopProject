package cons.projects.shop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cons.projects.shop.data.Cart;
import cons.projects.shop.data.CartItem;
import cons.projects.shop.data.CartOrder;
import cons.projects.shop.service.CartItemService;
import cons.projects.shop.service.CartService;
import cons.projects.shop.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private CartItemService cartItemService;
	
	@Autowired
	private Cart cart;

	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public ModelAndView order() {
		ModelAndView mv;
		if(cart.getCartItems().isEmpty()) {
			mv = new ModelAndView("redirect:/cart");
		} else {
			mv = new ModelAndView("order");
			CartOrder order = new CartOrder();
			mv.addObject("order", order);
		}
		return mv;
	}
	
	@RequestMapping(value = "/order/confirm", method = RequestMethod.POST)
	public ModelAndView confirm(@ModelAttribute("order") @Valid CartOrder order, BindingResult results, Errors errors) {
		ModelAndView mv;
		if(cart.getCartItems().isEmpty()) {
			mv = new ModelAndView("redirect:/cart");
		} else {
			if(results.hasErrors()) {
				System.out.println(errors);
				mv = new ModelAndView("redirect:/order");
			} else {
				mv = new ModelAndView("status");
				mv.addObject("status", "Order is successfully confirmed!");
				saveOrder(order);
				cleanCart();
			}
		}
		return mv;
	}
	
	private void saveOrder(CartOrder order) {
		Cart savedCart = new Cart();
		savedCart.setCartItems(cart.getCartItems());
		for(CartItem cartItem: savedCart.getCartItems())
			cartItemService.addCartItem(cartItem);
		cartService.addCart(savedCart);
		order.setCart(savedCart);
		orderService.addOrder(order);
	}
	
	private void cleanCart() {
		cart.getCartItems().clear();
	}
	
}
