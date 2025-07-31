package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	
	public static void main(String[] args) {
		
		// 1
		
		Scanner scanner = new Scanner(System.in); //Scannerで初期化
		String userName;
		
		while (true) { //無効な入力の場合繰り返し入力する
		    System.out.print("");
		    userName = scanner.nextLine(); // 文字列の入力の受け取り(scanner.nextでは空入力を受け取ってしまう)
		
		    if (userName == null || userName.isEmpty()) { // null.isEmpty()だけでは空欄で登録出来てしまう
			    System.out.println("名前を入力してください");
			    System.out.println();
		    } else if (userName.length() > 10) { // name.length() で文字数の読み取り
			    System.out.println("名前を10文字以内にしてください");
			    System.out.println();
				
	        // 2
			    
		    } else if (!userName.matches("^[a-zA-Z0-9]+$")) { 
		    // !は(ではない)という意味matches("^[a-zA-Z0-9])で入力された文を判定する
		    // +で同じ文字や連続する数字を入力できるようにする
		    	
			    System.out.println("半角英数字のみで名前を入力してください");
			    System.out.println();
			
		    } else {
			    System.out.println("ユーザー名「" + userName + "」を登録しました");
			    System.out.println();
				break; // while文内の条件を満たしたときにループを終了する

		    }
		    
		}
		
		// 3
		
		Random random = new Random();
		String[] hands = {"グー", "チョキ", "パー"}; //じゃんけんの手を配列(hands)として宣言左から0,1,2
		int playerHand;
		int cpuHand;
		int count = 0;
		boolean loopFlg = true;
		do {
			count++;
		    playerHand = random.nextInt(3); // 3未満の整数をランダム生成しplayerHandに代入
		    cpuHand = random.nextInt(3);
		    
		    System.out.println(userName + "の手は" + "｢" + hands[playerHand] + "｣");
		    System.out.println("相手の手は" + "｢" + hands[cpuHand] + "｣");
		    System.out.println();
		    
		    if (playerHand == cpuHand) { //引き分けの場合
		        System.out.println("DRAW あいこ もう一回");
		        System.out.println();
		    }
		    
		    else if (playerHand == 0 && cpuHand == 2) {
		    	System.out.println("なんで負けたか、明日までに考えといてください。\nそれやったら次も、俺が勝ちますよ");
		    	System.out.println();
		    }
		    else if (playerHand == 1 && cpuHand == 0) {
		    	System.out.println("負けは次につながるチャンスです！\nネバーギブアップ！");
		    	System.out.println();
		    }
		    else if (playerHand == 2 && cpuHand == 1) {
		    	System.out.println("たかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
		    	System.out.println();
		    }
		    else {
		    	loopFlg = false; //引き分け、cpuの勝利以外でfalseにフラグ切り替え
		    	System.out.println("やるやん。\n次は俺にリベンジさせて");
		    	System.out.println();
		    }
		    
		
		} while(loopFlg);  //booleanでループ管理ユーザー勝利した時にフラグがfalseになりループ終了
		
		System.out.println("勝つまでにかかった回数は" + count + "回です");
		scanner.close(); //Scannerオブジェクトを終了する
	
	}

}
