package com.practice.observor.sharedservices;

/**
 * Observable interface 
 * @author skaushik
 *
 */
public interface Observable {
	
	void addObserver(Observer observer); 
	
	void removeObserver(int observerId); 
	
	void notifyObservers(String message);
}
