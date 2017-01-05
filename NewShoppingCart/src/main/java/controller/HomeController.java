package controller;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.DAO.UserDAO;
import com.niit.shoppingcart.DAOImpl.UserDAOImpl;

@Controller
public class HomeController {

	@Autowired
	
	@RequestMapping("")
	public String Home() {
		return "Home";
	}

	@RequestMapping("/login")
	public ModelAndView showLoginPage() {
		ModelAndView mv = new ModelAndView("Login");
		mv.addObject("Message", "");
		return mv;

	}

	@RequestMapping("/Register")
	public ModelAndView showRegistrationPage() {
		ModelAndView mv = new ModelAndView("Registration");
		mv.addObject("Message", "You have clicked the Registration Link");
		return mv;
	}

	@RequestMapping("/validate")
	public ModelAndView validate(@RequestParam("id") String id, @RequestParam("Password") String pwd) {
		System.out.println("In Validate method");
		System.out.println("Id is-" + id);
		System.out.println("Password is-" + pwd);
		ModelAndView mv = new ModelAndView("Home");

		/*UserDAO userDAO = new UserDAOImpl();
		if (userDAO.isValidCredentials(id, pwd) == true) {

			mv.addObject("SuccessMessage", "You Logged in successfully");
		} else {
			mv.addObject("ErrorMessage", "No Details Found. Please Register to continue");
		}*/
		return mv;
	}


	@RequestMapping("/Category")
	public ModelAndView showCategoryPage() {
		ModelAndView mv = new ModelAndView("Category");
		return mv;
	}

	@RequestMapping("/Home")
	public ModelAndView showHomePage() {
		ModelAndView mv = new ModelAndView("Home");
		return mv;
	}

}
