package com.practice.observor;

import java.util.HashMap;
import java.util.Map;

import com.practice.observor.sharedservices.Observable;
import com.practice.observor.sharedservices.Observer;

public final class ANIObservable implements Observable {

	Map<Integer, Observer> observers;

	private static Observable observable;
	
	private static int id = 1;

	private ANIObservable() {
		super();
		this.observers = new HashMap<Integer, Observer>();
	}

	public static Observable getANIObserver() {
		if (observable == null) {
			synchronized (ANIObservable.class) {
				if (observable == null) {
					observable = new ANIObservable();
				}
			}
		}
		return observable;
	}

	@Override
	public void addObserver(Observer observer) {
		observers.put(id++, observer);
	}

	@Override
	public void removeObserver(int observerId) {
		observers.remove(id);
	}

	@Override
	public void notifyObservers(String message) {
		observers.forEach((k, v) -> {
			v.notify(message);
		});
	}

}
