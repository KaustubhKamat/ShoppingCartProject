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

import com.niit.shoppingcart.DAO.SupplierDAO;
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
	
	public ModelAndView listOfSuppliers() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("supplier", supplier);
		mv.addObject("supplierList", supplierDAO.list());
		mv.addObject("AdminHasClickedSupplier", "true");
		return mv;
	}

	@RequestMapping("/AddSupplier")
	public ModelAndView addSupplier() {
		ModelAndView mv = new ModelAndView("AddSupplier");
		if (supplierDAO.save(supplier)) {
			mv.addObject("SuccessSaveMessage", "SuccessfullyAddedTheSupplier");
		} else {
			mv.addObject("ErrorSaveMessage", "SupplierNotAdded");
		}
		return mv;
	}

	public ModelAndView updateSupplier() {
		ModelAndView mv = new ModelAndView("UpdateSupplier");
		if (supplierDAO.update(supplier) == true) {
			mv.addObject("SuccessUpdateMessage", "SuccessfullyUpdatedTheSupplier");
		} else {
			mv.addObject("ErrorUpdateMessage", "SupplierNotUpdated");
		}
		return mv;
	}

	@RequestMapping(value="validate_supplier", method = RequestMethod.POST)
	public ModelAndView deleteSupplier(@RequestParam(value="supplier_id")String id) {
		ModelAndView mv = new ModelAndView("DeleteSupplier");
		boolean flag=supplierDAO.delete(supplier);

		if (flag != true) {
			mv.addObject("SuccessDeleteMessage", "SuccessfullyDeletedTheSupplier");
		} else {
			mv.addObject("ErrorDeleteMessage", "SupplierNotDeleted");
		}
		return mv;
	}
   
    
     
}


	

