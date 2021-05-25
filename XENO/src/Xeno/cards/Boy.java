package Xeno.cards;


public class Boy extends Card{



	public Boy() {
		super(1, "少年");
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void explain() {
		System.out.println(this.cardNum + ":" + cardName + "です" );

	}

	@Override
	public void cardEffect() {
		// TODO 自動生成されたメソッド・スタブ
		if(!Xeno.Xeno.BoyFlag) {
			System.out.println("一枚目の少年が捨てられました" + Xeno.Xeno.BoyFlag);
		}
		System.out.println((Xeno.Xeno.BoyFlag = true));
	}

}
