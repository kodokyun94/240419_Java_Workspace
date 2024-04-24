package ex_240424;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요.");
		int sum=0;

		for (int i = 0; i <5; i++) {
			int n = scanner.nextInt();
//			if(n<=0) { //음수는 제외
//				continue;
//			}
			if(n % 2 ==0) {//홀수만 더하는 조건
				continue;
			}
			else {
				sum+=n;
			}
		}
		System.out.println("sum : " + sum);
	}

}
