package Xeno.cards;

public abstract class Card {

	public int cardNum;
	public String cardName;



	public Card(int cardNum, String cardName) {
		super();
		this.cardNum = cardNum;
		this.cardName = cardName;
	}

	//カードの効果の説明
	public abstract void explain();

	//カードの効果発動
	public abstract void cardEffect();

//	public int getCardNum() {
//		return cardNum;
//	}
//
//	public static String getCardName() {
//		return cardName;
//	}

}
