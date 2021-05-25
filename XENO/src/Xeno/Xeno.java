package Xeno;

import java.util.LinkedList;
import java.util.List;

import Xeno.cards.Card;

public class Xeno {


	public static boolean BoyFlag = false;	//1:少年の効果フラッグ
	public static boolean GirlFlag = false;	//4:乙女の効果フラッグ
	public static boolean WiseFlag = false;	//7:賢者の効果フラッグ

	//プレイヤーの手札
	public static Card player1Hand;
	public static Card player2Hand;

	//捨てられたカード
	public static List<Card> playedCard = new LinkedList<>();

	//デッキ
	public static List<Card> deck = new LinkedList<>();

	//ターンチェンジフラグ
	public static boolean changeTurn = true;

	public static void main(String[] args) {

 		//プレイヤーネーム
		String player1 = "taiji",player2 = "okuda";
		//転生札
		Card Reincarnation;

		Method.createDeck(Xeno.deck);
		Method.deckShuffle(Xeno.deck);
		Method.showDeck(Xeno.deck);

		Reincarnation = Method.draw(Xeno.deck);
		Xeno.player1Hand = Method.draw(Xeno.deck);
		Xeno.player2Hand = Method.draw(Xeno.deck);

		System.out.println(Xeno.player1Hand.cardNum + " " + Xeno.player2Hand.cardNum + " ");

		//ゲームスタート
		PlayerTurnMethod.startGame();


		//ゲーム終了
		System.out.println("game set");
		PlayerTurnMethod.judgement();

		Xeno.BoyFlag = false;
		Xeno.changeTurn = false;






	}

}
