package test;

import java.util.Scanner;

public class PhoneManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("인원수 >> ");
		int count = scanner.nextInt();
		scanner.nextLine(); // 개행 문자 제거

		Phone[] phones = new Phone[count]; // 입력된 인원 수만큼 Phone 객체 배열 생성

		// 정보 입력 받기
		for (int i = 0; i < count; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소 >> ");
			String input = scanner.nextLine();
			String[] inputArray = input.split(" "); // 공백을 기준으로 분리

			phones[i] = new Phone(inputArray[0], inputArray[1], inputArray[2]);
		}

		System.out.println("저장되었습니다...");

		// 검색 기능 구현
		while (true) {
			System.out.print("검색할 이름 >> ");
			String searchName = scanner.nextLine();

			if (searchName.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}

			boolean found = false;
			for (Phone phone : phones) {
				if (phone.getName().equals(searchName)) {
					System.out.println(
							phone.getName() + "의 번호와 주소는 " + phone.getTel() + ", " + phone.getAddress() + " 입니다.");
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println(searchName + "은(는) 없습니다.");
			}
		}

		scanner.close();
	}
}