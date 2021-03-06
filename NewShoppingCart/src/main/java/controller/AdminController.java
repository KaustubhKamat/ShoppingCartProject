package controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.DAO.CategoryDAO;
import com.niit.shoppingcart.DAO.ProductDAO;
import com.niit.shoppingcart.DAO.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;

@Controller
public class AdminController {
	
	public static Logger log= LoggerFactory.getLogger(AdminController.class);

	@Autowired
	public SupplierDAO supplierDAO;
	
	@Autowired
	public Supplier supplier;
	
	@Autowired
	public CategoryDAO categoryDAO;
	
	@Autowired
	public Category category;
	
	@Autowired
	public ProductDAO productDAO;
	
	@Autowired
	public Product product;
	
	@Autowired
	public HttpSession session;
	
	@RequestMapping("/ManageSupplier")
	public ModelAndView showSuppliers()
	{
		ModelAndView mv= new ModelAndView("Home");
		mv.addObject("supplier", supplier);
		mv.addObject("adminhasclickedManageSuppliers", true);
		session.setAttribute("adminhasclickedManageSuppliers", true);
		mv.addObject("supplierList", supplierDAO.list());
		return mv;
	}
	
	@RequestMapping("/ManageCategory")
	public ModelAndView showCategories()
	{
		ModelAndView mv=new ModelAndView("Home");
		mv.addObject("category", category);
		mv.addObject("adminHasClickedManageCategories", true);
		session.setAttribute("adminHasClickedManageCategories", true);
		mv.addObject("categoryList", categoryDAO.list());		
		return mv;
		
	}
	
	@RequestMapping("/ManageProduct")
	public ModelAndView showProducts()
	{
		ModelAndView mv=new ModelAndView("Home");
		mv.addObject("Product", product);
		mv.addObject("adminHasClickedManageProducts", true);
		session.setAttribute("adminHasClickedManageProducts", true);
		mv.addObject("productList", productDAO.list());
		return mv;
	}

	
	

}
