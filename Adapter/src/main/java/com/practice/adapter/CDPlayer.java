package com.practice.adapter;

public class CDPlayer implements Player {

	@Override
	public void playSong() {
		System.out.println("Song getting played from CD Player");
	}

}
