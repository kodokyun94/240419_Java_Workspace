package ex_240424;

import java.util.Scanner;

public class todayLunchYourPick {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] foodMenu = new String[5];
		System.out.println("먹고싶은 메뉴 5가지를 입력 해 주세요.");
		for (int i = 0; i < foodMenu.length; i++) {
			foodMenu[i] = scanner.next();
		}
		System.out.println("오늘 먹고 싶은 점심 메뉴 리스트");
		for (int i = 0; i < foodMenu.length; i++) {
			System.out.print(foodMenu[i] + " ");
		}
		scanner.close();
	}

}
