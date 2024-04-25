package ex_240424;

import java.util.Random;
import java.util.Scanner;

public class todayLunchYourPick {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] foodMenu = new String[5];
		System.out.println("먹고싶은 메뉴 5가지를 입력 해 주세요.");
		for (int i = 0; i < foodMenu.length; i++) {
			foodMenu[i] = scanner.next();
		}
		
		Random random = new Random();
		int randomNumber=random.nextInt(5);
		System.out.println("랜덤한 숫자 : " + randomNumber);
		
		System.out.println("오늘의 추천 메뉴 : " + foodMenu[randomNumber]);
		
		System.out.println("오늘 먹고 싶은 점심 메뉴 리스트");
		for (int i = 0; i < foodMenu.length; i++) {
			System.out.print(foodMenu[i] + " ");
		}
		scanner.close();
	}

	//자바에서 랜덤으로 숫자를 출력 해 주는 클래스랄 하나 가져와서
	//배열의 갯수가 5개, 인덱스, 0,1,2,3,4
	//0~4 까지 중 에서, 하나의 정수를 랜덤하게 선택 후,
	//랜덤하게
	
	
	
	
	
	
}
