package com.lavanya.assignment2;

import com.lavanya.assignment2.topping.Filling;
import com.lavanya.assignment2.topping.Flavor;

public abstract class BaseToppingFactory {
	public abstract Flavor createFlavor();
	public abstract Filling createFilling();
}
