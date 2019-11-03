package rps.beans;

import java.util.Random;

public class Game {
	private String player1;
	private String comp;
	private String winner;
	
	public Game() {
		super();
	}
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayer();
		this.determineWinner();
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getComputerPlayer() {
		return comp;
	}

	public void setComputerPlayer(String comp) {
		this.comp = comp;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	@Override
	public String toString() {
		return "Game [player1=" + player1 + ", comp=" + comp + ", winner=" + winner + "]";
	}
	
	private void setComputerPlayer() {
		Random num = new Random();
		int result = num.nextInt(3) + 1;
		String player;
		if (result == 1) {
			player = "rock";
		} else if (result == 2) {
			player = "paper";
		} else {
			player = "scissors";
		}
		this.setComputerPlayer(player);

	}
	
	public void determineWinner() {
		String winner = "Computer";
		
		if (player1.equals("rock") && comp.equals("scissors")) {
			winner = "Player";
		} else if (player1.equals("scissors") && comp.equals("paper")) {
			winner = "Player";
		} else if (player1.equals("paper") && comp.equals("rock")) {
			winner = "Player";
		}

		if (player1.equalsIgnoreCase(comp)) {
			winner = "It is a tie!";
		}
		this.setWinner(winner);

	}
}