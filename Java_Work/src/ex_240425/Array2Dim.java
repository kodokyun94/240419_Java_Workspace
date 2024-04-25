package ex_240425;

public class Array2Dim {

	public static void main(String[] args) {
		// 2차원 배열 선언 및 값 출력
		// 정의
		// 방법 1
//		int[][] intArray = new int[3][2];

		// 방법 2
		int [][] intArray = { {1,2},
							  {3,4},
							  {5,6} };

		// 데이터 입력 (더미로) 방법 : 더미, 스캐너, 파일, DB
		intArray[0][0] = 1;
		intArray[0][1] = 2;
		intArray[1][0] = 3;
		intArray[1][1] = 4;
		intArray[2][0] = 5;
		intArray[2][1] = 6;

		// intArray.length : 3행
		for (int i = 0; i < intArray.length; i++) {
			// intArray[i].length : 2열
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print(i + "행, " + j + "열" + " 값 : " + intArray[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
