package hh.swd20.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.swd20.bookstore.domain.Category;
import hh.swd20.bookstore.domain.CategoryRepository;

public class CategoryController {

	@Autowired
	private CategoryRepository crepository;

	@RequestMapping(value = "/categorylist", method = RequestMethod.GET)
	public String getCategories(Model model) {
		model.addAttribute("categories", crepository.findAll());
		return "categorylist";
	}

	// add new category
	@RequestMapping(value = "/addctg")
	public String addBook(Model model) {
		model.addAttribute("category", new Category());
		model.addAttribute("categories", crepository.findAll());
		return "addcategory";
	}

}
