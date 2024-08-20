package com.menu.FastFoodCenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menu.FastFoodCenter.exception.MenuException;
import com.menu.FastFoodCenter.model.MenuItem;
import com.menu.FastFoodCenter.repository.MenuItemRepository;
import com.menu.FastFoodCenter.service.MenuItemService;

@RestController
@RequestMapping("/menu")
public class MenuItemController {
	
	@Autowired
	private MenuItemService menuItemService;
	
	@GetMapping("/dish/{dishId}")
	public MenuItem getMenuById(@PathVariable int dishId) throws MenuException{
		return menuItemService.getMenuById(dishId);
	}
	
	@GetMapping("/search/{dishType}")
	public List<MenuItem> getMenus(@PathVariable String dishType){
		return menuItemService.getMenus(dishType);
	}
	
	@PostMapping("/dish")
	public MenuItem addMenu(@RequestBody MenuItem menu) throws MenuException{
		return menuItemService.addMenu(menu);
	}
	

}
