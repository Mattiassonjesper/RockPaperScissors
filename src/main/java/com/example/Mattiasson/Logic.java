package com.example.Mattiasson;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Logic {
	

	static int player1 = 0;
	static int player2 = 0;
	static boolean Player1ready = false;
	static boolean Player2ready = false;
	
	static int stateRock = 1;
	static int statePaper = 2;
	static int stateScissors = 3;

	static int gameRound = 1;
	static int player1Score = 0;
	static int player2Score = 0;

	public static String Players(String player1, String player2) {

		if (player1.equals(player2)) {
			return ("Tie");

		} else if (player1.equals("rock")) {
			if (player2.equals("scissors")) {
				player1Score++;
				return ("Player1 win");
			} else {
				player2Score++;
				return ("Player2 win");
			}
		}
		if (player1.equals(player2)) {
			return ("Win");

		} else if (player1.equals("paper")) {
			if (player2.equals("rock")) {
				player1Score++;
				return ("Player1 win");
			} else {
				player2Score++;
				return ("Player2 win");
			}
		}
		else if (player1.equals("scissors")) {
			if (player2.equals("paper")) {
				player1Score++;
				return ("Player1 win");
			} else {
				player2Score++;
				return ("Player2 win");
			}
		}
		gameRound++;
		Player1ready = false;
		Player2ready = false;

		return ("Wrong input");
	}
}
