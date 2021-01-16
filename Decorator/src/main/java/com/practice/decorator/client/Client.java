package com.practice.decorator.client;

import com.practice.decorator.BasicCost;
import com.practice.decorator.Cost;
import com.practice.decorator.taxes.GSTTax;
import com.practice.decorator.taxes.SGSTTax;
import com.practice.decorator.taxes.ServiceTax;

public class Client {

	public static void main(String s[]) {
		Cost cost = new BasicCost(new GSTTax(new SGSTTax(new ServiceTax(600), 400), 200), 100.0);
		cost.calculateCost();
		System.out.println(cost.getCost());
		
		Cost cost1 = new BasicCost(new SGSTTax(new ServiceTax(600), 400), 100);
		cost1.calculateCost();
		System.out.println(cost1.getCost());
	}

}
