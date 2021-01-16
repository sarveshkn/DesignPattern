package com.practice.decorator.taxes;

import com.practice.decorator.BasicCost;
import com.practice.decorator.Cost;

public class SGSTTax extends BasicCost {

	public SGSTTax(Cost costObj, double cost) {
		super(costObj, cost);
	}
	
	public SGSTTax(double cost) {
		super(cost);
	}
	
	public SGSTTax() {
	}

	@Override
	public Double calculateCost() {
		System.out.println("Cost in SGST class  " + this.cost + " tax is " + .05 * this.cost);
		if (this.costObj != null) {
			this.cost = this.costObj.calculateCost() + .05* this.cost;
			return cost;
		} 
		return .05 * this.cost;
	}

}
