package com.lavanya.assignment2;

public class FactoryProducer {
	public static BaseCakeFactory getFactory(String type) {
		BaseCakeFactory cakeFactory;
		
		switch (type.toLowerCase())
        {
            case "fruit":
                cakeFactory = new FruitCakeFactory();
                break;
                
            case "pound":
                cakeFactory = new PoundCakeFactory();
                break;
            
            default: throw new IllegalArgumentException("No such birthday cake.");
        }
		
		return cakeFactory;
	}
}
