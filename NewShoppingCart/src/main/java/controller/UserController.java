package controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.DAO.CategoryDAO;
import com.niit.shoppingcart.DAO.SupplierDAO;
import com.niit.shoppingcart.DAO.UserDAO;
import com.niit.shoppingcart.DAOImpl.UserDAOImpl;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcart.model.User1;

@Controller
@ComponentScan("com.niit.shoppingcart")
public class UserController {

	public static Logger log = LoggerFactory.getLogger("UserController.class");

	@Autowired
	UserDAO userDAO;

	@Autowired
	User1 user;

	@Autowired
	private CategoryDAO categoryDAO;

	@Autowired
	private Category category;

	@Autowired
	private SupplierDAO supplierDAO;

	@Autowired
	private Supplier supplier;
	

	@Autowired
	private HttpSession session;

	@RequestMapping(value="/validate", method=RequestMethod.GET)
	public ModelAndView validate(@RequestParam(value="id") String emailid, @RequestParam(value="Password")
	String password, HttpSession session)
	{
		log.debug("Starting the method validate");
	ModelAndView mv=new ModelAndView("/Home");
	user=userDAO.validate(emailid, password);
	
	if(user != null)
	{
		log.debug("Valid Credentials");
		user=userDAO.get(emailid);
		session.setAttribute("Logged In User", user.getName());
		session.setAttribute("Logged In EmailId", user.getEmailid());
		
		session.setAttribute("user", user);
	}
	
	else 
		{
		log.debug("Invalid Credentials" );
		mv.addObject("Invalid credentials", true );
		mv.addObject("ErrorMessage","Invalid Credentials");
		
		}

	return mv;
	}
}
