package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.DAO.CategoryDAO;
import com.niit.shoppingcart.DAO.ProductDAO;
import com.niit.shoppingcart.DAO.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcart.util.FileUtil;

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

	public String path = "webapp/resources/Images";

	@RequestMapping("/AddProduct")
	public ModelAndView showAddProductPage() {
		ModelAndView mv = new ModelAndView("Home");
		log.debug("The method add product is started");
		mv.addObject("supplier", supplier);
		mv.addObject("category", category);
		mv.addObject("supplierList", supplierDAO.list());
		mv.addObject("categoryList", categoryDAO.list());
		mv.addObject("product", new Product());
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
		public String processAddProduct(@ModelAttribute("product") Product product, @RequestParam("image")
			MultipartFile file,	Model model) throws Exception
		
		{
			log.debug("The method processaddproduct is started ");
			category=categoryDAO.getName(product.getCategory().getName());
			supplier=supplierDAO.getName(product.getSupplier().getName());
			
			product.setCategory(category);
			product.setSupplier(supplier);
			
			product.setCategory_id(category.getid());
			product.setSupplier_id(supplier.getId());
			productDAO.save(product);
			
            FileUtil.imageUpload(path, file, product.getId()+ ".jpg");
            log.debug("The method processAddProduct has been exceuted");
            model.addAttribute("product",new Product());
            model.addAttribute("productList",this.productDAO.list());
		
			return "/Home";

		}

	@RequestMapping("/AddProduct/delete")
	public String processDeleteProduct(@RequestParam("pid")String id, ModelMap model )throws Exception
	{
		log.debug("The method processDeleteProduct has been started");
		
		try{
			productDAO.delete(product);
			model.addAttribute("SuccessDeleteProduct", "ProductIsSuccesfullyDeleted");
		}
		catch(Exception e){
			model.addAttribute("ErrorDeleteProduct", "Product is not deleted");
		}
		return "forward:/AddProduct";
		
	}
	
	@RequestMapping("/AddProduct/edit")
	public String processEditProduct(@RequestParam("pid")String id, Model model)
	{
		log.debug("The method processEditProduct is started");
		product=productDAO.get(id);
		model.addAttribute("ThisProductIsSelected", product);
		log.debug("The method processEditCategory is execueted");
		return "forward:/AddProduct";
		
	}


}

		
		