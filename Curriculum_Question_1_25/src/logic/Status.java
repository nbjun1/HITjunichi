package logic;

import java.util.Random;

public class Status extends Character {
	public Status(String name) {
		super(
			name,
			new Random().nextInt(2000) + 1, // hp
			new Random().nextInt(2000) + 1, // mp
			new Random().nextInt(1000) + 1, // attack
			new Random().nextInt(500) + 1, // speed
			new Random().nextInt(1000) + 1  // defense
		);
	}
	
	public void openStatus() {
		System.out.println("こんにちは「　" + getName() + "　」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + getHp());
		System.out.println("MP：" + getMp());
		System.out.println("攻撃力：" + getAttack());
		System.out.println("素早さ：" + getSpeed());
		System.out.println("防御力：" + getDefense());
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
	}

}
