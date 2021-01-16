package com.practice.observor.client;

import com.practice.observor.ANIObservable;
import com.practice.observor.channels.AajTak;
import com.practice.observor.channels.IndiaTV;
import com.practice.observor.channels.Republic;
import com.practice.observor.sharedservices.Observable;

public class NewsAgency {

	public static void main(String[] args) {

		Observable ani = ANIObservable.getANIObserver();
		ani.addObserver(new AajTak());
		ani.addObserver(new Republic());
		ani.addObserver(new IndiaTV());
		
		int day = 0;
		
		while (day < 10) {
			ani.notifyObservers("Farmers are protesting " + day++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
