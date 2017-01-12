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
	
	/*@RequestMapping("/AddSupplier")
	public ModelAndView validate(@RequestParam(value="supplier_id")String id,HttpSession session)
	{
		log.debug("starting the method validate of supplier");
		ModelAndView mv=new ModelAndView("/AddSupplier");
		supplier=supplierDAO.validate(id);
		
		if(supplier != null)
		{
			supplier.getId();
			session.setAttribute("SuuplierIsRegisteredWithName", supplier.getName());
			session.setAttribute("SupplierisRegisteredWithAddress", supplier.getAddress());
		}
		
		return mv;*/

	public ModelAndView save()
	{
		log.debug("starting the method save");
		ModelAndView mv=new ModelAndView("AddSupplier");
		
		return null;
		
	}
	
	
	}

	

