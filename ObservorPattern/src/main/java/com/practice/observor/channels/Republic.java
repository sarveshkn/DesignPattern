package com.practice.observor.channels;

import com.practice.observor.sharedservices.Observer;

public class Republic implements Observer {

	@Override
	public void notify(String message) {
		System.out.println("ARNAB GOSUAMI REPORTING DIRECTLY " + message);
	}

}
