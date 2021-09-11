package com.lavanya.assignment2;

import com.lavanya.assignment2.product.BirthdayCake;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCakeFactory cakeFactory = new FactoryProducer().getFactory("fruit");
		
		BirthdayCake cake = cakeFactory.createCake("fruit");
		
		cakeFactory = new FactoryProducer().getFactory("pound");
		cake = cakeFactory.createCake("pound");

	}

}
