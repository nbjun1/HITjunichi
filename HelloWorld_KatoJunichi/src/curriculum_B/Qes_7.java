package curriculum_B;

import java.util.Scanner;

public class Qes_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("生徒の人数を入力してください（2以上）：");
		int students = scanner.nextInt();

		int[][] scores = new int[students][4];
		String[] subjects = {"英語", "数学", "理科", "社会"};

		// 入力された生徒数分、テスト結果の入力をループする
		for (int i = 0; i < students; i++) {
			// 生徒数一人あたり点数入力が４回ループする
			for (int j = 0; j < 4; j++) {
				System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください：");
				// 「i」番目の生徒の「j」科目の点数を入力
				scores[i][j] = scanner.nextInt();
			}
			System.out.println();
		}

		// 生徒ごとの平均点を出力、生徒数分ループ
		for (int i = 0; i < students; i++) {
			int studentTotal = 0;
			for (int j = 0; j < 4; j++) {
				studentTotal += scores[i][j];
			}
			// 小数点第二位まで表示するためdoubleを使用
			double studentAverage = (double) studentTotal / 4;
			System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), studentAverage);
		}
		System.out.println();		

		// 科目ごとの平均点を出力
		for (int j = 0; j < 4; j++) {
			int subjectTotal = 0;
			for (int i = 0; i < students; i++) {
				subjectTotal += scores[i][j];
			}
			double subjectAverage = (double) subjectTotal / students;
			System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], subjectAverage);
		}

		// 全体の平均点を出力
		int totalSum = 0;
		for (int i = 0; i < students; i++) {
			for (int j = 0; j < 4; j++) {
				totalSum += scores[i][j];
			}
		}
		double totalAverage = (double) totalSum / (students * 4);
		System.out.printf("全体の平均点は%.2f点です。", totalAverage);
		System.out.println();

		scanner.close();
	}
}
