package net.manhnt.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.manhnt.shoppingbackend.dao.CategoryDAO;
import net.manhnt.shoppingbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", "true");
		
		//passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		
		return mv;
	}
	
	@RequestMapping(value = {"/about"})
	public ModelAndView about() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout", "true");
		return mv;
		
	}
	
	@RequestMapping(value = {"/contact"})
	public ModelAndView contact() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact", "true");
		return mv;
		
	}
	
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		mv.addObject("userClickAllProducts", "true");
		
		//passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		
		return mv;
	}
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable int id) {
		
		ModelAndView mv = new ModelAndView("page");
		
		//categoryDAO to get a single category
		Category category = null;
		
		category = categoryDAO.get(id);
		
		mv.addObject("title", category.getName());
		
		//passing the list of category
		mv.addObject("categories", categoryDAO.list());
		
		//passing the single category object
		mv.addObject("category", category);
		
		
		mv.addObject("userClickCategoryProducts", "true");
		
		return mv;
	}


}
