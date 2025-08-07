package curriculum_B;

public class Qes_5 {

	public static void main(String[] args) {

		// 5
		int [][] multiplicationTable = new int [9][20];
		
		for (int i = 0; i < multiplicationTable.length; i++) {
			for (int j =0; j < multiplicationTable[i].length; j++) {
				multiplicationTable[i][j] = (i+1) * (j+1); 
				
				if (j == 19) {
					System.out.printf("%03d * %03d = %03d ", (j+1), (i+1), multiplicationTable[i][j]);
				} else {
					System.out.printf("%03d * %03d = %03d || ", (j+1), (i+1), multiplicationTable[i][j]);
				}
			} 
		System.out.println();
		}

	}

}
