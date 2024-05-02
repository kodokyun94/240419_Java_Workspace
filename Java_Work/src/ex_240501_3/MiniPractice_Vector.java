package ex_240501_3;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

import util.CollectionUtils;

public class MiniPractice_Vector {

	// 함수로 분리하기.
	public static void recommendFood(Scanner scanner, Vector<Person> vector) {
		while (true) {
			System.out.println("==================================================================");
			System.out.println("오늘 점심 메뉴 무엇을 먹을까요 프로젝트 벡터 버전");
			System.out.println("1. 메뉴 입력, 2. 메뉴 출력, 3. 검색하기, 4. 이름 삭제, 5. 메뉴 삭제, 6. 종료하기. ");
			System.out.println("==================================================================");

			// 순서2-2, 문자열로 날씨를 담을 변수 지정.
			String weather = scanner.next();

			if (weather.equals("6")) {
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
			} else if (weather.equals("1")) {
				System.out.println("이름 입력>>");
				String userName = scanner.next();
				System.out.println("메뉴 입력(예_콤마로 분리)라면,김밥>>");
				String foodList = scanner.next();

				StringTokenizer st = new StringTokenizer(foodList, ",");
				Vector<String> foodListVector = new Vector<String>();
				while (st.hasMoreTokens()) {
					String food = st.nextToken();
					foodListVector.add(food);
				}

				Person person = new Person(userName, foodListVector);
				vector.add(person);
				continue;

			} else if (weather.equals("2")) {
				System.out.println("메뉴 출력>>");
				for (int i = 0; i < vector.size(); i++) {
					Person person = vector.get(i);

					Vector<String> person_foodList = person.getFoodList();
					for (int j = 0; j < person_foodList.size(); j++) {
						System.out.println(person.getName() + "의 메뉴 리스트 : " + (j + 1) + "번 " + person_foodList.get(j));
					}

				}
				continue;
			} else if (weather.equals("3")) {
				System.out.println("검색하기" + "예)라면>>");
				String searchName = scanner.next();
				Vector<String> search_list = new Vector<String>();
				for (int i = 0; i < vector.size(); i++) {
					Person person = vector.get(i);
					Vector<String> person_foodList = person.getFoodList();

					for (int j = 0; j < person_foodList.size(); j++) {
						if (person_foodList.get(j).equals(searchName)) {
							search_list.add(person.getName() + "의 메뉴: " + person_foodList.get(j));
						}
					} // end for 안

				} // end for 밖

				if (!search_list.isEmpty()) {
					for (int i = 0; i < search_list.size(); i++) {
						System.out.println("검색된 메뉴 " + (i + 1) + " " + search_list.get(i));
					}
				} else {
					System.out.println("검색 메뉴가 없습니다.");
				}
				continue;
			} else if (weather.equals("4")) {
				System.out.println("삭제할 사용자 이름을 입력하세요:");
				String deleteName = scanner.next();

				for (int i = 0; i < vector.size(); i++) {
					if (vector.get(i).getName().equals(deleteName)) {
						vector.remove(i);
						System.out.println(deleteName + "님이 삭제 되었습니다.");
					}
				}

				continue;
			} else if (weather.equals("5")) {
				System.out.println("삭제할 이름을 입력하세요:");
				String deleteMemberMenu = scanner.next();
				System.out.println("삭제할 메뉴를 입력하세요:");
				String deleteMenu = scanner.next();

				for (int i = 0; i < vector.size(); i++) {
					Person person = vector.get(i);
					if (person.getName().equals(deleteMemberMenu)) {
						for (int j = 0; j < person.getFoodList().size(); j++) {
							if (person.getFoodList().get(j).equals(deleteMenu)) {
								System.out.println(deleteMenu + "이(가) 삭제되었습니다.");
								person.getFoodList().remove(j);
							}
						}
					}
				}
			}
			continue;
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Vector<Person> verStrings = new Vector<Person>();
		recommendFood(scanner, verStrings);

	}
}
