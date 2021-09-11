package com.lavanya.assignment2;

import com.lavanya.assignment2.product.BirthdayCake;
import com.lavanya.assignment2.product.FruitCake;
import com.lavanya.assignment2.product.PoundCake;

public class FruitCakeFactory extends BaseCakeFactory {

	@Override
	public BirthdayCake createCake(String type) {
		BirthdayCake cake;
		BaseToppingFactory toppingFactory = new FruitCakeToppingFactory();
		
		switch (type.toLowerCase())
		{
	        case "fruit":
	            cake = new FruitCake(toppingFactory);
	            break;
	        case "pound":
	            cake = new PoundCake(toppingFactory);
	            break;
	        default: throw new IllegalArgumentException("No such cake.");
	    };
	    
	    cake.addIngredients();
	    cake.bakeCake();
	    
	    return cake;
	}

}
