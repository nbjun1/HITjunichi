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
		BigDecimal beforebmi = new BigDecimal(bmi);
		BigDecimal afterbmi = beforebmi.setScale(1, RoundingMode.HALF_UP);
		System.out.println("BMIは" + afterbmi + "です");
		
		// 8
		name = "鈴木一郎";
		age = 24;
		height = 168.5f;
		weight = 64.2f;
		like = "オムライス";
		heightM = height / 100;
		bmi = weight / heightM / heightM;
	    beforebmi = new BigDecimal(bmi);
		afterbmi = beforebmi.setScale(1, RoundingMode.HALF_UP);
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + like + "です");
		System.out.println("BMIは" + afterbmi + "です");
		
		// 9

	}

}
