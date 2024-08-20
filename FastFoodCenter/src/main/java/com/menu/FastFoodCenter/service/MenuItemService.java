package com.menu.FastFoodCenter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menu.FastFoodCenter.exception.MenuException;
import com.menu.FastFoodCenter.model.MenuItem;
import com.menu.FastFoodCenter.repository.MenuItemRepository;

@Service
public class MenuItemService {
	
	@Autowired
	private MenuItemRepository menuItemRepository;
	
	public MenuItem addMenu(MenuItem menu) throws MenuException{
		return menuItemRepository.save(menu);
	}
	
	public List<MenuItem> getMenus(String dishType){
		return menuItemRepository.findByDishType(dishType);
	}
	
	public MenuItem getMenuById(int id) throws MenuException{
		Optional<MenuItem> menu=menuItemRepository.findById(id);
		
		if(menu.isPresent()) {
			return menu.get();
		}
		else {
			throw new MenuException("Dish not found");
		}
	}

}
