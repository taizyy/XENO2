package Xeno;

import java.util.Collections;
import java.util.List;

import Xeno.cards.Aristocrat;
import Xeno.cards.Boy;
import Xeno.cards.Card;
import Xeno.cards.Emperor;
import Xeno.cards.Girl;
import Xeno.cards.Hero;
import Xeno.cards.Ryuk;
import Xeno.cards.Soldier;
import Xeno.cards.Spirit;
import Xeno.cards.Teller;
import Xeno.cards.Wise;

public class Method {

	//デッキに数字を格納
	public static void createDeck(List<Card> deck) {

		deck.add(new Boy());
		deck.add(new Boy());
		deck.add(new Soldier());
		deck.add(new Soldier());
		deck.add(new Teller());
		deck.add(new Teller());
		deck.add(new Girl());
		deck.add(new Girl());
		deck.add(new Ryuk());
		deck.add(new Ryuk());
		deck.add(new Aristocrat());
		deck.add(new Aristocrat());
		deck.add(new Wise());
		deck.add(new Wise());
		deck.add(new Spirit());
		deck.add(new Spirit());
		deck.add(new Emperor());
		deck.add(new Hero());

	}

	//デッキをシャッフル
	public static void deckShuffle(List<Card> deck) {

		Collections.shuffle(deck);

	}

	//デッキの中身をを表示
	public static void showDeck(List<Card> deck) {
		for(int i= 0; i < deck.size();i++) {
			System.out.print(deck.get(i).cardNum + " ");
		}
		System.out.println();
	}

	//カードを引く
	public static Card draw(List<Card> deck) {
		Card hand =deck.get(0);
				deck.remove(0);
		Method.showDeck(deck);
		return hand;
	}
}
