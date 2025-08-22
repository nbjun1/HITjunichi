package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes_6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);	

		// 入力された商品名が配列内の商品名と一致するか読点区切りでチェック
		String[] inputItems = scanner.next().split("、");
		scanner.close();
				
		for (String inputItem : inputItems) {
			Random random = new Random();

			int stock = random.nextInt(12);

			String message;

// switch文内でdefaultを先に書くと必ず実行される、後に書くとcaseに当て嵌まらなかった場合に実行される
			switch (inputItem) {
			
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
			case "テレビ":
			case "ディスプレイ":

				message = (inputItem == "テレビ")
						? "の残り台数は" + stock + "台です"
						: "の残り台数は" + (11 - stock) + "台です";
				break;
				
			default:
				message = "は指定商品ではありません";
				break;
			}

			System.out.println(inputItem + message);
			System.out.println();

		}
	}
}
