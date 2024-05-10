package test;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("컴퓨터가 임의의 수를 정했습니다. 1에서 100 사이의 수 중에서 맞춰보세요.");

		int randomNumber = random.nextInt(100) + 1; // 1부터 100까지의 임의의 수 생성
		boolean guessedCorrectly = false;
		int attempts = 0;

		// 짝수인지 홀수인지 힌트 제공
		System.out.println("컴퓨터가 정한 수는 " + (randomNumber % 2 == 0 ? "짝수" : "홀수") + "입니다.");

		while (!guessedCorrectly) {
			System.out.print("추측한 수를 입력하세요: ");
			int guess = scanner.nextInt();
			attempts++;

			if (guess == randomNumber) {
				guessedCorrectly = true;
				System.out.println("축하합니다! " + attempts + "회만에 맞췄습니다.");
			} else if (guess < randomNumber) {
				System.out.println("더 큰 수입니다.");
			} else {
				System.out.println("더 작은 수입니다.");
			}
		}

		scanner.close();
	}
}
