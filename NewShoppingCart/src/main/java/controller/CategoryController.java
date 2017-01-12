package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.DAO.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class CategoryController {

	public static Logger log = LoggerFactory.getLogger(CategoryController.class);

	@Autowired
	public CategoryDAO categoryDAO;

	@Autowired
	public Category category;

	public ModelAndView listOfCategories() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("category", category);
		mv.addObject("categoryList", categoryDAO.list());
		mv.addObject("AdminHasClickedCategories", "true");
		return mv;
	}

	@RequestMapping("/AddCategory")
	public ModelAndView addCategory() {
		ModelAndView mv = new ModelAndView("AddCategory");
		if (categoryDAO.save(category) == true) {
			mv.addObject("SuccessSaveMessage", "SuccessfullyCreatedTheCategory");
		} else {
			mv.addObject("ErrorSaveMessage", "CategoryNotSaved");
		}
		return mv;
	}

	public ModelAndView updateCategory() {
		ModelAndView mv = new ModelAndView("UpdateCategory");
		if (categoryDAO.update(category) == true) {
			mv.addObject("SuccessUpdateMessage", "SuccessfullyUpdatedTheCategory");
		} else {
			mv.addObject("ErrorUpdateMessage", "CategoryNotUpdated");
		}
		return mv;
	}

	@RequestMapping(value="validate_category", method = RequestMethod.POST)
	public ModelAndView deleteCategory(@RequestParam(value="category_id")String id) {
		ModelAndView mv = new ModelAndView("DeleteCategory");
		boolean flag=categoryDAO.delete(category);

		if (flag != true) {
			mv.addObject("SuccessDeleteMessage", "SuccessfullyDeletedTheCategory");
		} else {
			mv.addObject("ErrorDeleteMessage", "CategoryNotDeleted");
		}
		return mv;
	}
   
    
     
}

