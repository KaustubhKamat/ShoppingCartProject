package controller;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.DAO.UserDAO;
import com.niit.shoppingcart.DAOImpl.UserDAOImpl;
import com.niit.shoppingcart.model.User1;

@Controller
@ComponentScan("com.niit.shoppingcart")
public class HomeController {

	@Autowired
	UserDAO userDAO;

	@Autowired
	User1 user;

	@RequestMapping("/")
	public String Home() {
		return "Home";
	}

	/*@RequestMapping("/login")
	public ModelAndView showLoginPage() {
		ModelAndView mv = new ModelAndView("Login");
		mv.addObject("Message", "Welcome to Login Page");
		return mv;

	}*/

	@RequestMapping("/Register")
	public ModelAndView showRegistrationPage() {
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("UserHasClickedRegister", true);
		return mv;
	}

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

	@RequestMapping("/Home")
	public ModelAndView showHomePage() {
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("carousaltobedisplayed", true);
		return mv;
	}

	@RequestMapping("/AboutUs")
	public ModelAndView showAboutUsPage() {
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("UserhasclickedAboutUs", true);
		return mv;
	}
	@RequestMapping("/HatchBack")
	public ModelAndView showHatchBackPage() {
		ModelAndView mv = new ModelAndView("HatchBack");
		return mv;
	}

}
