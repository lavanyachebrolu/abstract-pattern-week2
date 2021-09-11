package com.lavanya.assignment2.product;

import com.lavanya.assignment2.BaseToppingFactory;

public class FruitCake extends BirthdayCake {
	BaseToppingFactory toppingFactory;
	
	public FruitCake(BaseToppingFactory toppingFacotry) {
		this.toppingFactory = toppingFacotry;
	}
	
	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for fruit cake..");
		toppingFactory.createFilling();
		toppingFactory.createFlavor();
	}

}
