package com.practice.adapter;

public class Client {

	public static void main(String[] args) {
		Player cdPlayer = new CDPlayer();
		cdPlayer.playSong();
		
		Player musicPlayer = new MusicPlayerAdapter(new MusicPlayer());
		musicPlayer.playSong();
	}

}
