package com.example.player.model;

public class Player {
	private int playerno;
	private String playername;
	private String playerstate;
	public Player(int playerno, String playername, String playerstate) {
		super();
		this.playerno = playerno;
		this.playername = playername;
		this.playerstate = playerstate;
	}
	public Player() {
		super();
	}
	public int getPlayerno() {
		return playerno;
	}
	public void setPlayerno(int playerno) {
		this.playerno = playerno;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getPlayerstate() {
		return playerstate;
	}
	public void setPlayerstate(String playerstate) {
		this.playerstate = playerstate;
	}
	
}
