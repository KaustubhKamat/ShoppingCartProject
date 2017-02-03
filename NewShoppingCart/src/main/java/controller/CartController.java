package controller;

import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.DAO.CartDAO;
import com.niit.shoppingcart.DAO.ProductDAO;
import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.Product;

@Controller
public class CartController {

	Logger log=LoggerFactory.getLogger(CartController.class);
	
	@Autowired
	public ProductDAO productDAO;
	
	@Autowired
	public Product product;
	
	@Autowired
	public CartDAO cartDAO;
	
	@Autowired
	public Cart cart;
	
	@Autowired
	public HttpSession httpSession;


	
	@RequestMapping(value="/Cart", method=RequestMethod.POST)
	public ModelAndView showMyCart(HttpSession httpSession)
	{
		log.debug("CartController-> Starting the method showMyCart ");
		ModelAndView mv=new ModelAndView("Home");
		String user_Id=(String) httpSession.getAttribute("emailid");
		mv.addObject("cart", cart);
		mv.addObject("cartList", cartDAO.list(user_Id));
		mv.addObject("getTotalAmount",cartDAO.getTotalAmount(user_Id));
		log.debug("CartController-> Ending the method showMyCart");
		return mv;
		
	}
	
	public String AddtoCart(@RequestParam("pid")String id, HttpSession session, Model model){
		log.debug("CartController-> Starting the method AddToCart");
		String userloggedin=(String) session.getAttribute("emailid");
		
		if (userloggedin==null)
		{
			log.debug("CartController-Ending the method AddtoCart");
			return "redirect:/Login";
		}
		System.out.println(id);
		Product product=productDAO.get(id);
		String emailid= (String) session.getAttribute("emailid");
		cart.setUser_Id(userloggedin);
		cart.setStatus("valid");
		cart.setQuantity("1");
		cart.setId(cartDAO.getMaxId());
	
		
		return null;
		
	}
}