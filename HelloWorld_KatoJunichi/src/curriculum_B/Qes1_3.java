package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

	
	public static void main(String[] args) {
		
		// 1
		
		Scanner scanner = new Scanner(System.in); //Scannerで初期化
		
		while (true) { //無効な入力の場合繰り返し入力する
		    System.out.print("");
		    String name = scanner.nextLine(); // 文字列の入力の受け取り(scanner.nextでは空入力を受け取ってしまう)
		
		    if (name == null || name.isEmpty()) { // null.isEmpty()だけでは空欄で登録出来てしまう
			    System.out.println("名前を入力してください");
		    } else if (name.length() > 10) { // name.length() で文字数の読み取り
			    System.out.println("名前を10文字以内にしてください");
				
	        // 2
			    
		    } else if (!name.matches("^[a-zA-Z0-9]+$")) { 
		    // !は(ではない)という意味matches("^[a-zA-Z0-9])で入力された文を判定する
		    // +で同じ文字や連続する数字を入力できるようにする
		    	
			    System.out.println("半角英数字のみで名前を入力してください");
			
		    } else {
			    System.out.println("ユーザー名" + name + "を登録しました");
			    break; // while文なので入力条件を満たしたときにループを終了する
		    }
		}
		
		// 3
		

		scanner.close(); //Scannerオブジェクトを終了する
	
	}

}
