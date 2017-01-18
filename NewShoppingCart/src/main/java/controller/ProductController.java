package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.DAO.CategoryDAO;
import com.niit.shoppingcart.DAO.ProductDAO;
import com.niit.shoppingcart.DAO.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;

@Controller
@ComponentScan("com.niit.shoppingcart")
public class ProductController {
	
	public static Logger log = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	public ProductDAO productDAO;
	
	@Autowired
	public Product product;
	
	@Autowired
	public SupplierDAO supplierDAO;
	
	@Autowired 
	public Supplier supplier;
	
	@Autowired
	public CategoryDAO categoryDAO;
			
	@Autowired
	public Category category;

	
		@RequestMapping("/AddProduct")
		public ModelAndView showAddProductPage() {
			ModelAndView mv = new ModelAndView("Home");
			log.debug("The method add product is started");
			mv.addObject("supplier", supplier);
			mv.addObject("category", category);
			mv.addObject("supplierList", supplierDAO.list());
			mv.addObject("categoryList", categoryDAO.list());
			mv.addObject("product", product);
			mv.addObject("productList", productDAO.list());
			mv.addObject("AdminHasClickedAddProduct", "true");
			log.debug("The method add product is executed");
			return mv;
		}

		public ModelAndView listOfProducts() {
			ModelAndView mv = new ModelAndView("/Home");
			mv.addObject("product", product);
			mv.addObject("productList", productDAO.list());
			mv.addObject("AdminHasClickedProducts", "true");
			return mv;
		}

		@RequestMapping("/AddProduct_add")
		public String processAddProduct(@ModelAttribute("product") Product product, Model model) throws Exception
		
		{
			productDAO.save(product); 
			category=categoryDAO.getName(product.getCategory().getName());
			if (productDAO.save(product) == true) {
				model.addAttribute("SuccessMessage", "You have successfully Added the Product");
			} else {
				model.addAttribute("ErrorMessage", "The Product is not added. Please try again");
			}
			model.addAttribute("category", category);
			model.addAttribute("categoryList", categoryDAO.list());
			model.addAttribute("product",product);
			model.addAttribute("productList", productDAO.list());
		
			return "/Home";

		}

		public String processDeleteCategory(@PathVariable("id") String id, Model model) {
			boolean b = categoryDAO.delete(category);

			if (b != true) {
				model.addAttribute("SuccessDeleteCategory", "CategoryIsSuccesfullyDeleted");
			} else {
				model.addAttribute("ErrorDeleteCategory", "CategoryIsNotCreated");
			}

			return "forward:/AddCategory";

		}

		/*
		 * @RequestMapping("AddCategory/edit") public ModelAndView
		 * editUser(@RequestParam String id,
		 * 
		 * @ModelAttribute ) { String employeeObject = employee_Test.getId(); return
		 * new ModelAndView("edit", "employeeObject", employeeObject); }
		 */
	}

	
	
