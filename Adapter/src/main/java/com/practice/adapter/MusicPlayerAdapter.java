package com.practice.adapter;

public class MusicPlayerAdapter implements Player {
	
	private MusicPlayer player;
	
	public MusicPlayerAdapter(MusicPlayer player) {
		this.player = player;
	}

	@Override
	public void playSong() {
		this.player.playMusic();
	}

}
