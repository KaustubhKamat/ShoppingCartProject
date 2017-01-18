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
		log.debug("The method showAddSupplierPage is executed");
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("supplier",supplier);
		mv.addObject("supplierListGet", supplierDAO.list());
		mv.addObject("AdminHasClickedAddSupplier", "true");
		log.debug("The method showAddSupplierPage is finished");
		return mv;
	}
	

	public ModelAndView listOfSuppliers() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("supplier", supplier);
		mv.addObject("supplierList",supplierDAO.list());
		mv.addObject("AdminHasClickedSupplier", "true");
		return mv;
	}

	
	//This method was for HTML forms
	/*@RequestMapping(value ="/validate_supplier", method = RequestMethod.POST)
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
	}*/
	
	@RequestMapping(value="/AddSupplier_add")
	public String processAddCategory(@ModelAttribute("supplier") Supplier supplier, Model model) throws Exception
	
	{
		supplierDAO.save(supplier);
		model.addAttribute("supplier", supplier);
		model.addAttribute("supplierList", supplierDAO.list());
		
		if (supplierDAO.save(supplier)== true) {
			model.addAttribute("SuccessMessage", "You have successfully created the Supplier");
		} else {
			model.addAttribute("ErrorMessage", "The Supplier is not created. Please try again");
		}

		return "/Home";

	}
	
	@RequestMapping("/AddSupplier/delete")
	public String processDeleteCategory(@RequestParam("sid") String id, Model model) {
		log.debug("The method process delete supplier is started");
		boolean b = supplierDAO.delete(supplier);

		if (b != true) {
			model.addAttribute("SuccessDeleteSupplier", "SupplierIsSuccesfullyDeleted");
		} else {
			model.addAttribute("ErrorDeleteSupplier", "SupplierIsNotCreated");
		}

		return "forward:/AddSupplier";

	}
	
	
	@RequestMapping("/AddSupplier/edit")
	public String processEditCategory(@RequestParam("sid")String id, Model model)
	{
		log.debug("The process Edit Category method is started");
		supplier=supplierDAO.get(id);
		model.addAttribute("supplier", supplier);
		log.debug("The process Edit Category method is finished");
		return "forward:/AddSupplier";
	}
	
}


	

