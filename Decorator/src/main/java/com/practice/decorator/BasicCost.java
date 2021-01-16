package com.practice.decorator;

public class BasicCost implements Cost {
	
	protected double cost;
	protected Cost costObj;
	
	public BasicCost(Cost costObj, double cost) {
		super();
		this.costObj = costObj;
		this.cost = cost;
	}
	
	public BasicCost(double cost) {
		super();
		this.cost = cost;
	}
	
	public BasicCost() {
		super();
	}

	@Override
	public Double calculateCost() {
		System.out.println("Cost in BasicCost class  " + this.cost);
		if (this.costObj != null) {
			this.cost = this.costObj.calculateCost() + this.cost;
			return this.cost;
		} 
		return this.cost;
	}

	@Override
	public Double getCost() {
		return this.cost;
	}
}
