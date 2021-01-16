package com.practice.observor.channels;

import com.practice.observor.sharedservices.Observer;

public class AajTak implements Observer {

	@Override
	public void notify(String message) {
		System.out.println("BREAKING NEWS!!!! AAJTAK " + message);
	}

}
