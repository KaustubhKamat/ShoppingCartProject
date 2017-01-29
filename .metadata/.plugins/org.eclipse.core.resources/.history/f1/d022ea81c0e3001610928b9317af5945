package controller;

import javax.servlet.http.HttpSession;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.DAO.CategoryDAO;
import com.niit.shoppingcart.DAO.ProductDAO;
import com.niit.shoppingcart.DAO.UserDAO;
import com.niit.shoppingcart.DAOImpl.UserDAOImpl;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.User1;

import sun.print.resources.serviceui;

@Controller
@ComponentScan("com.niit.shoppingcart")
public class HomeController {

	Logger log=LoggerFactory.getLogger(HomeController.class);
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	Category category;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	Product product;
	
	
	@Autowired
	User1 user;
	
	@Autowired
	public HttpSession session;

	/*@RequestMapping("/")
	public String Home() {
    		
		
		return "Home";
	}*/

	/*@RequestMapping("/login")
	public ModelAndView showLoginPage() {
		ModelAndView mv = new ModelAndView("Login");
		mv.addObject("Message", "Welcome to Login Page");
		return mv;

	}*/

	@RequestMapping("/Register")
	public ModelAndView showRegistrationPage() {
		log.debug("The method showRegistrationPage is started");
		
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("UserHasClickedRegister", true);
		log.debug("The method showRegistrationPage is executed");
		return mv;
	}

	//This method is moved in user controller
	/*@RequestMapping("/validate")
	public ModelAndView validate(@RequestParam("Emailid") String Emailid, @RequestParam("password") String password) {
		System.out.println("In Validate method");
		System.out.println("Id is-" + password);
		System.out.println("Password is-" + password);
		ModelAndView mv = new ModelAndView("Home");

		
		  if (userDAO.validate(Emailid, password)!=null)
{
	mv.addObject("successMsg","You logged in successfully");
}
		  else
		  {
			  mv.addObject("ErrorMsg","Invalid crdenetials");
		  }	 
		return mv;
	}*/

	/*@RequestMapping("/Category")
	public ModelAndView showCategoryPage() {
		ModelAndView mv = new ModelAndView("Category");
		return mv;
	}*/

	@RequestMapping("/")
	public ModelAndView Home() {
		log.debug("The Home Method is started");
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("carousaltobedisplayed", true);
		log.debug("The method Home is executed");
		return mv;
	}
	
	@RequestMapping("/Home")
	public ModelAndView showHomePage() {
		log.debug("The method showHomePage is started");
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("carousaltobedisplayed", true);
		session.setAttribute("categoryList",categoryDAO.list() );
		session.setAttribute("category", category);
		session.setAttribute("productList", productDAO.list());
		session.setAttribute("category.product", productDAO.list());
		log.debug("The method showHomePage is executed");
		return mv;
	}
	
	

	@RequestMapping("/AboutUs")
	public ModelAndView showAboutUsPage() {
		log.debug("The method showAboutUsPage is started");
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("UserhasclickedAboutUs", true);
		log.debug("The method showAboutUsPage is executed");
		return mv;
	}
	
	
	@RequestMapping("/HatchBack")
	public ModelAndView showHatchBackPage() {
		ModelAndView mv = new ModelAndView("HatchBack");
		return mv;
	}

	
	
}
