package curriculum_New_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Curriculum_New_1_18 {

	public static void main(String[] args) {
		message("Hello JavaSE", 11);
		multiplication(4);
		int[] array = { 0, 1, 2, 3, 4, 5 };
		array(array);
		multiplication(3.24, 4.56);
		List<Integer> randomNumbers = random(5);
		double average = average(randomNumbers);
		half(average);
	}

	// Q1：引数に文字列型と整数型をいれてコンソールに
	//「Hello JavaSE 11」と出力するメソッドを作成してください。
	/**
	 * 文字列と整数をコンソールに出力するメソッド
	 * @param sMessage 文字列
	 * @param iMessage 整数
	 */
	private static void message(String sMessage, int iMessage) {
		System.out.println(sMessage + " " + iMessage + "\n");
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算し
	// コンソールに出力するメソッドを作成してください
	/**
	 * 整数を乗算するメソッド
	 * @param num 整数
	 */
	private static void multiplication(int num) {
		System.out.println(num * num + "\n");
	}

	// Q3：引数として整数の配列を渡すと、
	// 受け取った値を順番にコンソールに出力するメソッドを作成してください
	/**
	 * 値の配列をコンソールに出力するメソッド
	 * @param array 値の配列
	 */
	private static void array(int[] array) {
		System.out.println(Arrays.toString(array) + "\n");
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、
	// 引数同士を和算しコンソールに出力してください。
	/**
	 * 小数を和算して出力するメソッド
	 * @param dNum1 小数1
	 * @param dNum2 小数2
	 */
	private static void multiplication(double dNum1, double dNum2) {
		System.out.println(dNum1 + dNum2 + "\n");
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	/**
	 * 引数の整数分ランダムな1から100までの整数をランダム生成して格納し、出力するメソッド
	 * @param count 整数を生成する回数
	 * @return 戻り値(整数配列)
	 */
	private static List<Integer> random(int count) {
		Random random = new Random();
		List<Integer> numberList = new ArrayList<>();

		for (int i = 0; i < count; i++) {
			int rNumber = random.nextInt(100) + 1;
			numberList.add(rNumber);
		}
		System.out.println(numberList + "\n");
		return numberList;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、
	// 受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	/**
	 * 受け取った整数配列の平均値をコンソールに出力するメソッド
	 * @param numberList Q5で生成された整数配列
	 * @return 戻り値(平均値)
	 */
	private static double average(List<Integer> numberList) {
		double sum = 0;
		for (int number : numberList) {
			sum += number;
		}
		// .size()で配列内の要素数を参照
		double average = sum / numberList.size();

		System.out.println(average + "\n");
		return average;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、
	// 受け取った値が50以上ならばtrue
	// それ以外はfalseを返しコンソールに出力してください
	/**
	 * 受け取った値が50以上の場合trueがコンソールに出力されるメソッド
	 * @param average Q6で計算されたQ5の平均値
	 */
	private static void half(double average) {
		boolean overFifty = (average >= 50);
		System.out.println(overFifty + "\n");
	}
}
