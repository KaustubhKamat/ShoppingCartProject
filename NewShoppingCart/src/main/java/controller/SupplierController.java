package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.DAO.CategoryDAO;
import com.niit.shoppingcart.DAO.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Supplier;

@Controller
@ComponentScan("com.niit.shoppingcart")
public class SupplierController {

	public static Logger log= LoggerFactory.getLogger(SupplierController.class);
	
	@Autowired
	public SupplierDAO supplierDAO;
	
	@Autowired
	public Supplier supplier;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("/AddSupplier")
	public ModelAndView showAddSupplierPage() {
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("supplierList", supplierDAO.list());
		mv.addObject("AdminHasClickedAddSupplier", "true");
		return mv;
	}
	
	@RequestMapping("/DeleteSupplier")
	public ModelAndView showDeleteSupplierPage() {
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("supplierList", supplierDAO.list());
		mv.addObject("AdminHasClickedDeleteSupplier", "true");
		return mv;
	}
	
	@RequestMapping("/UpdateSupplier")
	public ModelAndView showUpdateSupplierPage() {
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("supplierList", supplierDAO.list());
		mv.addObject("AdminHasClickedUpdateSupplier", "true");
		return mv;
	}

	public ModelAndView listOfSuppliers() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("supplier", supplier);
		mv.addObject("supplierList", supplierDAO.list());
		mv.addObject("AdminHasClickedSupplier", "true");
		return mv;
	}

	@RequestMapping(value ="/validate_supplier", method = RequestMethod.POST)
	public ModelAndView processAddSupplier(@RequestParam(value="supplier_id")String id , @RequestParam(value="supplier_name")
	String name, @RequestParam(value="supplier_address")String address) 
	
	{
		ModelAndView mv = new ModelAndView("Home");
		
		supplier.setId(id);
		supplier.setName(name);
		supplier.setAddress(address);
		
		if (supplierDAO.save(supplier)) {
			mv.addObject("SuccessSaveMessage", "SuccessfullyAddedTheSupplier");
		} else {
			mv.addObject("ErrorSaveMessage", "SupplierNotAdded");
		}
		return mv;
	}
	@RequestMapping(value="DeleteSupplier", method=RequestMethod.POST)
	public ModelAndView processDeleteSupplier(@ModelAttribute("command")Supplier supplier,
	   BindingResult result) 
	{
	  supplierDAO.delete((supplier));
	  Map<String, Object> model = new HashMap<String, Object>();
	  model.put("supplier", null);
	  model.put("supplier", supplierDAO.list());
	  return new ModelAndView("DeleteSupplier", model);
	 }

}


	

