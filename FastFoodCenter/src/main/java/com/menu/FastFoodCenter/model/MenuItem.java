package com.menu.FastFoodCenter.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Menus")
public class MenuItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dishId;

	private String dishType;

	private String dishName;

	private Integer unitPrice;

	private String dishDesc;

	public MenuItem() {
		// TODO Auto-generated constructor stub
	}

	public MenuItem(Integer dishId, String dishType, String dishName, Integer unitPrice, String dishDesc) {
		super();
		this.dishId = dishId;
		this.dishType = dishType;
		this.dishName = dishName;
		this.unitPrice = unitPrice;
		this.dishDesc = dishDesc;
	}

	public Integer getDishId() {
		return dishId;
	}

	public void setDishId(Integer dishId) {
		this.dishId = dishId;
	}

	public String getDishType() {
		return dishType;
	}

	public void setDishType(String dishType) {
		this.dishType = dishType;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDishDesc() {
		return dishDesc;
	}

	public void setDishDesc(String dishDesc) {
		this.dishDesc = dishDesc;
	}

}
