package main;

import logic.Animal;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal();
		
		a.setName("ライオン");
		a.setHeight(2.1);
		a.setSpeed(80);
		
		System.out.println("動物名：" + a.getName());
		System.out.println("体長：" + a.getHeight() + "m");
		System.out.println("速度：" + a.getSpeed() + "km/h");

	}

}
