package Xeno;

import java.util.Scanner;

import Xeno.cards.Card;

public class PlayerTurnMethod {


	//プレイヤーターンを開始し、デッキが0になるまでプレイヤーターンを呼び出すメソッド
	public static void startGame() {
		while(Xeno.deck.size() > 0 ) {

			if(Xeno.changeTurn) {
				Xeno.changeTurn = PlayerTurnMethod.playerTurn(Xeno.player1Hand,Xeno.player2Hand);
			}
			else {
				Xeno.changeTurn = PlayerTurnMethod.playerTurn(Xeno.player2Hand,Xeno.player1Hand);
			}
		}
	}

	//プレイヤーのターン１ターン
	public static boolean playerTurn(Card player1Hand,Card player2Hand) {

		Card secondHand;

		secondHand = Method.draw(Xeno.deck);

		int player;
		if(Xeno.changeTurn)player = 1;
		else player = 2;

		Scanner sc = new Scanner(System.in);

		int num;

		do {
			System.out.println("Select player" + player + " hand 1 ->" + player1Hand.cardNum + ":" + player1Hand.cardName + " 2 ->" + secondHand.cardNum + ":" + secondHand.cardName );
			num = sc.nextInt();
		}while(num != 1 && num != 2);

		if(num == 1) {

			System.out.print("player" + player + " hand ->");
			player1Hand.explain();
			player1Hand.cardEffect();
			Xeno.playedCard.add(player1Hand);
			player1Hand =secondHand;


		}else {
			System.out.print("player" + player + " hand ->");
			secondHand.explain();
			secondHand.cardEffect();
			Xeno.playedCard.add(secondHand);
		}


		return !Xeno.changeTurn;



	}

	//勝敗を判定するメソッド
	public static void judgement() {

		if(Xeno.player1Hand.cardNum > Xeno.player2Hand.cardNum) {
			System.out.println("player1 Win!");
		}else if(Xeno.player1Hand.cardNum < Xeno.player2Hand.cardNum) {
			System.out.println("player2 Win!");
		}else {
			System.out.println("draw!");
		}
	}

	public static void WinPlayer(int num) {
		System.out.println("player" + num + "Win!");
	}


}
