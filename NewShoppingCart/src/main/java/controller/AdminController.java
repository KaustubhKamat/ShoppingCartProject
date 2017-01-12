package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@RequestMapping("/ManageSupplier")
	public ModelAndView showSuppliers()
	{
		ModelAndView mv= new ModelAndView("/ManageSupplier");
		mv.addObject("supplier", supplier);
		mv.addObject("adminhasclickedthecategories", true);
		mv.addObject("supplierList", supplierDAO.list());
		return mv;
	}
	
	@RequestMapping("/ManageCategory")
	public ModelAndView showCategories()
	{
		ModelAndView mv=new ModelAndView("/ManageCategory");
		mv.addObject("category", category);
		mv.addObject("adminhasclickedthecategories", true);
		mv.addObject("categoryList", categoryDAO.list());		
		return mv;
		
	}
	
	@RequestMapping("/ManageProduct")
	public ModelAndView showProducts()
	{
		ModelAndView mv=new ModelAndView("/ManageProduct");
		mv.addObject("Product", product);
		mv.addObject("adminhasclickedtheproducts", true);
		mv.addObject("productList", productDAO.list());
		return mv;
	}

	
	
}
