package Xeno.cards;

public class Soldier extends Card{

	public Soldier() {
		super(2, "兵士");
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void explain() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.cardNum + ":" + cardName + "です" );
	}

	@Override
	public void cardEffect() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
