package com.practice.observor.channels;

import com.practice.observor.sharedservices.Observer;

public class IndiaTV implements Observer {

	@Override
	public void notify(String message) {
		System.out.println("BREAKING NEWS WHICH WILL BREAK YOU INDIATV " + message);
	}

}
