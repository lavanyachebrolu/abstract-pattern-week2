package com.lavanya.assignment2;

import com.lavanya.assignment2.topping.ChocolateFlavor;
import com.lavanya.assignment2.topping.CustardFilling;
import com.lavanya.assignment2.topping.Filling;
import com.lavanya.assignment2.topping.Flavor;

public class FruitCakeToppingFactory extends BaseToppingFactory {

	@Override
	public Flavor createFlavor() {
		// TODO Auto-generated method stub
		return new ChocolateFlavor();
	}

	@Override
	public Filling createFilling() {
		// TODO Auto-generated method stub
		return new CustardFilling();
	}

}
