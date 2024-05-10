package test;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("=== 숫자맞추기 게임을 시작합니다. ===");
		int randomNumber = random.nextInt(100)+1;
		System.out.println("컴퓨터가 숫자를 생각했습니다.");
		
		int attempts = 0;
		
		System.out.println("컴퓨터가 정한 수는 " + (randomNumber % 2 == 0 ? "짝수" : "홀수") + "입니다.");
		System.out.println("추측한 수를 입력하세요. ");
		int guess = scanner.nextInt();
		
		while (guess ==randomNumber) {
			System.out.println("추측한 수를 입력하세요. ");
			attempts++;
			
			if (guess == randomNumber) {
				System.out.println("축하합니다 " + attempts + "회만에 맞췄습니다.");
				break;
			} else if (guess < randomNumber) {
				System.out.println("더 큰거");
			} else {
				System.out.println("더 작은거");
			}
			
			scanner.close();
			
		}
		

	}

}
