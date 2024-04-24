package ex_240424;

import java.util.Scanner;

public class TodayLunch {

	public static void main(String[] args) {
		System.out.println("오늘 점심 메뉴 무엇을 먹을까요 프로젝트");
		Scanner scanner = new Scanner(System.in);

		System.out.println("날씨가 어떤가요?(1비 2흐림 3맑음 4바람 5추천)");
		
		//if문 사용
//		int weather = scanner.nextInt();
//		if (weather == 1) {
//			System.out.println("오늘은 비가오니 삼선우동 추천드려요");
//		}
//
//		else if (weather == 2) {
//			System.out.println("오늘은 흐림이니 밀면 추천드려요");
//		}
//
//		else if (weather == 3) {
//			System.out.println("오늘은 맑음이니 된장찌개 추천드려요");
//		}
//		
//		else if(weather==4) {
//			System.out.println("오늘은 바람이 많이 부니 돼지국밥 추천드려요");
//		}
//		
//		else if(weather==5) {
//			System.out.println("저는 도시락 싸와서 먹는걸 좋아해요");
//		}
//		
//		else {
//			System.out.println("숫자는 1~5로 입력 해 주세요");
//		}
		
//		scanner.close();
		
		//switch문 사용
		int month = scanner.nextInt();
		
		switch (month) {
		case 1:
			System.out.println("오늘은 비가오니 삼선우동 추천드려요");
			break;

		case 2:
			System.out.println("오늘은 흐림이니 밀면 추천드려요");
			break;

		case 3:
			System.out.println("오늘은 맑음이니 된장찌개 추천드려요");
			break;

		case 4:
			System.out.println("오늘은 바람이 많이 부니 돼지국밥 추천드려요");
			break;

		case 5:
			System.out.println("exit을 입력하면 종료합니다.");
			while (true) {
				System.out.println(">>");
				String text = scanner.nextLine();
				if(text.equals("exit"))
					break;
			}
			System.out.println("종료합니다...");
			scanner.close();
			break;
		default:
			System.out.println("숫자는 1~5로 입력 해 주세요");

		}

	}
}