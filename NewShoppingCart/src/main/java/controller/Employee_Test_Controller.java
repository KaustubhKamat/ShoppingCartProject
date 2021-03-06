package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.DAO.Employee_TestDAO;
import com.niit.shoppingcart.model.Employee_Test;

public class Employee_Test_Controller {
	
	 @Autowired
	 public Employee_TestDAO employee_TestDAO;
	 
	 public Employee_Test employee_test;

	 @RequestMapping("/Test_form")
	 public ModelAndView getForm(@ModelAttribute Employee_Test employee_Test) {
	ModelAndView mv=new ModelAndView("Home");
	mv.addObject("ClickedEmployee", true);
	  return mv;
	 }

	 @RequestMapping("register")
	 public ModelAndView registerUser(@ModelAttribute Employee_Test employee_Test) {
	  employee_TestDAO.save(employee_test);
	  return new ModelAndView("redirect:list");
	 }

	 @RequestMapping("list")
	 public ModelAndView getList() {
	  List<Employee_Test> employeeList = employee_TestDAO.list();
	  return new ModelAndView("list", "employeeList", employeeList);
	 }

	 @RequestMapping("delete")
	 public ModelAndView deleteUser(@RequestParam int id) {
	  employee_TestDAO.delete(employee_test);
	  return new ModelAndView("redirect:list");
	 }

	 @RequestMapping("edit")
	 public ModelAndView editUser(@RequestParam String id,
	   @ModelAttribute Employee_Test employee_Test) {
	  String employeeObject = employee_Test.getId();
	  return new ModelAndView("edit", "employeeObject", employeeObject);
	 }

	 @RequestMapping("update")
	 public ModelAndView updateUser(@ModelAttribute Employee_TestDAO employee_TestDAO) {
	  employee_TestDAO.update(employee_test);
	  return new ModelAndView("redirect:list");
	 }

	}



