package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.DAO.CategoryDAO;
import com.niit.shoppingcart.model.Category;

@Controller
@ComponentScan("com.niit.shoppingcart")
public class CategoryController {

	public static Logger log = LoggerFactory.getLogger(CategoryController.class);

	@Autowired
	public CategoryDAO categoryDAO;

	@Autowired
	public Category category;

	@RequestMapping("/AddCategory")
	public ModelAndView showAddCategoryPage() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("category", category);
		mv.addObject("categoryList", categoryDAO.list());
		mv.addObject("AdminHasClickedAddCategory", "true");
		return mv;
	}

	@RequestMapping("/DeleteCategory")
	public ModelAndView showDeleteCategoryPage() {
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("categoryList", categoryDAO.list());
		mv.addObject("AdminHasClickedDeleteCategory", "true");
		return mv;
	}


	public ModelAndView listOfCategories() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("category", category);
		mv.addObject("categoryList", categoryDAO.list());
		mv.addObject("AdminHasClickedCategories", "true");
		return mv;
	}

	/*
	 * @RequestMapping(value ="/add_category", method = RequestMethod.POST)
	 * public ModelAndView
	 * processAddCategory(@RequestParam(value="category_id")String id
	 * , @RequestParam(value="category_name") String
	 * name, @RequestParam(value="category_description")String description)
	 * 
	 * { ModelAndView mv = new ModelAndView("Home"); category.setid(id);
	 * category.setName(name); category.setDescription(description); if
	 * (categoryDAO.save(category) == true) { mv.addObject("SuccessSaveMessage",
	 * "SuccessfullyCreatedTheCategory"); } else {
	 * mv.addObject("ErrorSaveMessage", "CategoryNotSaved"); } return mv; }
	 */

	@RequestMapping("/AddCategory_add")
	public String processAddCategory(@ModelAttribute("category") Category category, Model model) throws Exception
	
	{
		
	//	categoryDAO.save(category); 
		if (categoryDAO.save(category) == true) {
			model.addAttribute("SuccessMessage", "You have successfully created the category");
		} else {
			model.addAttribute("ErrorMessage", "The Category is not created. Please try again");
		}
		model.addAttribute("category", category);
		model.addAttribute("categoryList", categoryDAO.list());

		return "/Home";

	}

	@RequestMapping("/AddCategory/delete")
	public String processDeleteCategory(@RequestParam("cid") String id, Model model) {
		boolean b = categoryDAO.delete(category);

		if (b != true) {
			model.addAttribute("SuccessDeleteCategory", "CategoryIsSuccesfullyDeleted");
		} else {
			model.addAttribute("ErrorDeleteCategory", "CategoryIsNotCreated");
		}

		return "forward:/AddCategory";

	}

	@RequestMapping("/AddCategory/edit")
	public String processEditCategory(@RequestParam("cid")String id, Model model)
	{
		log.debug("The processEditCategory method is started");
		category=categoryDAO.get(id);
		model.addAttribute("category", category);
		log.debug("The processEditCategory method is finished");
		return "forward:/AddCategory";
	}
	
}
