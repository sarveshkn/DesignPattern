package com.practice.decorator.taxes;

import com.practice.decorator.BasicCost;
import com.practice.decorator.Cost;

public class GSTTax extends BasicCost {

	public GSTTax(Cost costObj, double cost) {
		super(costObj, cost);
	}
	
	public GSTTax(double cost) {
		super(cost);
	}
	
	public GSTTax() {
	}

	@Override
	public Double calculateCost() {
		System.out.println("Cost in GSTTax class  " + this.cost + " tax is " + .09 * this.cost);
		if (this.costObj != null) {
			this.cost = this.costObj.calculateCost() + .09 * this.cost;
			return cost;
		} 
		return .09 * this.cost;
		
	}

}
