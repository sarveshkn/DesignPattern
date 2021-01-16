package com.practice.decorator.taxes;

import com.practice.decorator.BasicCost;
import com.practice.decorator.Cost;

public class ServiceTax extends BasicCost {

	public ServiceTax(Cost costObj, double cost) {
		super(costObj, cost);
	}
	
	public ServiceTax(double cost) {
		super(cost);
	}
	
	public ServiceTax() {
	}

	@Override
	public Double calculateCost() {
		System.out.println("Cost in ServiceTax class  " + this.cost + " tax is " + .01 * this.cost);
		if (this.costObj != null) {
			this.cost = this.costObj.calculateCost() + .01 * this.cost;
			return cost;
		} 
		return .01 * this.cost;
	}

}
