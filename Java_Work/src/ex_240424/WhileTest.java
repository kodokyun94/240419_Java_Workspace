package ex_240424;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 0을 입력 시 계산 종료");
		
		int count =0;
		int n = 0;
		double sum=0;
		
		while ((n= scanner.nextInt()) !=0 ) {
			sum = sum + n;
			count++; //몇번 실행 되었는지 숫자 값 확인(상태변수)
		}
		System.out.println("총합 : " + sum);
		System.out.println("갯수 : " + count);
		System.out.println("평균 : " + sum/count);
	}
		
}
