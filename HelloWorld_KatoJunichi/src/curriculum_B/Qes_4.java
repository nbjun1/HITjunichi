package curriculum_B;

public class Qes_4 {

	public static void main(String[] args) {
		// 4
		//九九のコンソール出力
		// int[][]:整数型を格納する二次元配列
		int [][] multiplicationTable = new int[9][9];
		
		// 配列は0からなのでiの初期値は0にしておく
		for (int i = 0; i < multiplicationTable.length; i++) {
			// 配列内でループさせる為記号は大なりを使う
			for (int j = 0; j < multiplicationTable[i].length; j++) {
				multiplicationTable[i][j] = (i+1) * (j+1);
				// %02d;常に二桁の整数で出力される、
				// ""内が出力される部分で""以降の部分が左からそれぞれ%02dに当てはまる
				// printf()はフォーマットを指定できるメソッド
				
				if (j == 8) {
					System.out.printf("%02d * %02d = %02d ", (i+1), (j+1), multiplicationTable[i][j]);
				} else {
					System.out.printf("%02d * %02d = %02d || ", (i+1), (j+1), multiplicationTable[i][j]);
				}
			
			}
			System.out.println();
		}

	}

}
