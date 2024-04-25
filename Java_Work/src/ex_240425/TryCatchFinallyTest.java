package ex_240425;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력 해 주세요.");
		int sum = 0, n=0;
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
			try {
				n = scanner.nextInt();
//			} catch (InputMismatchException e) {
				//InputMismatchException의 부모인 Exception만으로도 처리 가능
			} catch (Exception e) {
				System.out.println("정수가 아닙니다. 다시 입력 해 주세요");
				scanner.next();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.println("합 : " + sum);
		scanner.close();

	}

}
