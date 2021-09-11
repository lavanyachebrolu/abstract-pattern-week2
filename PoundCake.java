package com.lavanya.assignment2.product;

import com.lavanya.assignment2.BaseToppingFactory;

public class PoundCake extends BirthdayCake {
	BaseToppingFactory toppingFactory;
	
	public PoundCake(BaseToppingFactory toppingFacotry) {
		this.toppingFactory = toppingFacotry;
	}
	
	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for pound cake..");
		toppingFactory.createFilling();
		toppingFactory.createFlavor();

	}

}
