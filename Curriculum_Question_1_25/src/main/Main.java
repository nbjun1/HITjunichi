package main;

import java.util.Scanner;

import logic.Status;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 入力した文字列をnameに代入
		String name = scanner.nextLine();
		
		// nameをサブクラス(status)に渡してインスタンス生成、super()の処理によりCharacterのステータスに数値をセット
		Status status = new Status(name);
		
		// StatusクラスのopenStatusメソッドを呼び出し、コンソールに出力
		status.openStatus();
		
		scanner.close();

	}

}
