package main;

import java.util.Scanner;

import logic.Animal;

public class Main {

	public static void main(String[] args) {
		System.out.println("コンソールに文字を入力してください");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // 学名の対応表を作る（簡易的にif文で対応）
        String[] animals = input.split(",");

        for (String a : animals) {
            String[] parts = a.split(":");
            String name = parts[0];
            double height = Double.parseDouble(parts[1]);
            int speed = Integer.parseInt(parts[2]);

            String scientificName = "";

            switch (name) {
                case "ライオン":
                    scientificName = "パンテラ レオ";
                    break;
                case "ゾウ":
                    scientificName = "ロキソドンタ・サイクロティス";
                    break;
                case "パンダ":
                    scientificName = "アイルロポダ・メラノレウカ";
                    break;
                case "チンパンジー":
                    scientificName = "パン・トゥログロディテス";
                    break;
                case "シマウマ":
                    scientificName = "チャップマンシマウマ";
                    break;
                case "インコ":
                    scientificName = "不明";
                    break;
            }

            Animal animal = new Animal(name, height, speed, scientificName);

            System.out.println();
            System.out.println("動物名：" + animal.getName());
            System.out.println("体長：" + animal.getHeight() + "m");
            System.out.println("速度：" + animal.getSpeed() + "km/h");
            System.out.println("学名：" + animal.getScientificName());
        }

	}

}
