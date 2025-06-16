package curriculum_A;

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
	}

}
