package curriculum_A;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Qes1_13 {

	public static void main(String[] args) {

		// 1
		
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String st;
		boolean bo;
		
		// 2
		
		b = 0;
		s = 0;
		i = 0;
		l = 0L;
		f = 0.0f; //fをつけることでfloat型であることを表す
		d = 0.0;
		c = '\u0000';
		st = null; //初期値
		bo = false;
		
		// 3
		
		b = 10;
		s = 100;
		i = 1000;
		l = 10000L;
		f = 9.5f;
		d = 10.5;
		c = 'a';
		st = "ハロー";
		bo = true;
		
		// 4
		
		System.out.println(b + s + i + l);
		System.out.println(b + b);
		System.out.println(c + " " + st + " " + bo);
		System.out.println(b + s + i + l + f + d);
		System.out.println(b * s * i * l );
		System.out.println(d / s);
		System.out.println(b - s);
		
		// 5
		
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		
		// 6
		
		String name = "山田太郎";
		int age = 18;
		float height = 170.5f;
		float weight = 62.2f;
		String like = "寿司";
		
		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + age + "歳です」");
		System.out.println("「身長は" + height + "cmです」");
		System.out.println("「体重は" + weight + "kgです」");
		System.out.println("「好きな食べ物は" + like + "です」");
		
		// 7
		
		float heightM = height / 100;
		float bmi = weight / heightM / heightM;
		BigDecimal beforeBmi = new BigDecimal(bmi);
		BigDecimal afterBmi = beforeBmi.setScale(1, RoundingMode.HALF_UP);
		System.out.println("BMIは" + afterBmi + "です");
		
		// 8
		
		name = "鈴木一郎";
		age = 24;
		height = 168.5f;
		weight = 64.2f;
		like = "オムライス";
		heightM = height / 100;
		bmi = weight / heightM / heightM;
	    beforeBmi = new BigDecimal(bmi);
		afterBmi = beforeBmi.setScale(1, RoundingMode.HALF_UP);
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + like + "です");
		System.out.println("BMIは" + afterBmi + "です");
		
		// 9
		
		int age2 = age + 24;
		float height2 = height + 168.5f;
		float weight2 = weight + 64.2f;
		float heightM2 = height2 / 100;
		float bmi2 = weight2 / heightM2 / heightM2;
	    beforeBmi = new BigDecimal(bmi2);
		afterBmi = beforeBmi.setScale(2, RoundingMode.HALF_UP);
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age2 + "歳です");
		System.out.println("身長は" + height2 + "cmです");
		System.out.println("体重は" + weight2 + "kgです");
		System.out.println("好きな食べ物は" + like + "です");
		System.out.println("BMIは" + afterBmi + "です");
		
		// 10
		
		boolean checkAge = (age > 25);
		System.out.println(checkAge);
		
		// 11
		
		String stAge = String.valueOf(age);
		String stHeight = String.valueOf(height);
		String stWeight = String.valueOf(weight);
		
		System.out.println(stAge + stHeight + stWeight);
		
		// 12
		
		int intAge = Integer.parseInt(stAge);
		int intHeight = Integer.parseInt(stHeight.substring(0, stHeight.indexOf('.')));
		// substring(0, stHeight.indexOf('.') : 小数点以下を切り捨て
		
		System.out.println(intAge);
		System.out.println(intHeight);
		
		// 13
		
		System.out.println(intAge >= 25 || intHeight >= 160);
		
	}

}
