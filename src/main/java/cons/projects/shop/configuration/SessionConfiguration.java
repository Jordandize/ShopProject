package cons.projects.shop.configuration;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

import cons.projects.shop.data.Cart;

@Configuration
public class SessionConfiguration {

	@Bean
	@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
	public Cart cart() {
		Cart cart = new Cart();
		cart.setCartItems(new ArrayList<>());
	    return cart;
	}
	
}
