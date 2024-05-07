package ex_240502_mini_teacher;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

import util.HashMapUtils;
import util.LocalDateTimeMake;
import util.dto.Person;

public class Contact_MiniProject_HashMap {

	// 함수로 분리하기.
	public static void recommendFood(Scanner scanner, HashMap<String, Person> hashMap) {
		while (true) {
			System.out.println("=================================");
			System.out.println("연락처 프로그램 만들기.HashMap 버전");
			System.out.println("1. 입력, 2. 출력(최신날짜순 정렬), 3. 검색 , 4. 삭제, 5. 랜덤 멤버 뽑기, 6. 종료하기. ");
			System.out.println("=================================");

		
			String weather = scanner.next();

			if (weather.equals("6")) {
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
			} else if (weather.equals("1")) {
				System.out.println("이름 입력>>");
				String userName = scanner.next();
				System.out.println("연락처입력(예:01012345678)>>");
				String contact = scanner.next();
				String regDate = LocalDateTimeMake.now();

				Person person = new Person(userName, contact, regDate);
				hashMap.put(userName, person);

			} else if (weather.equals("2")) {
				System.out.println("연락처 출력>>");
				//역순 정렬,
				HashMap<String, Person> hashMap2 = HashMapUtils.sortReverseElem(hashMap);
				//출력 기능 , 함수분리
				HashMapUtils.showElem(hashMap2);

			} else if (weather.equals("3")) {
				System.out.println("검색하기 예:이상용>>");
				String searchName = scanner.next();
				HashMap<String, Person> search_list = new HashMap<String, Person>();
				//검색 기능 , 함수분리
				search_list = HashMapUtils.findElem(hashMap, searchName);

				if (!search_list.isEmpty()) {
					System.out.println("검색된 사용자 : ");
					
					HashMapUtils.showElem(search_list);
				} else {
					System.out.println("사용자가 없습니다.");
				}

			} else if (weather.equals("4")) {
				System.out.println("이름으로 삭제하기 예)이상용>>");
				String deleteName = scanner.next();
				//삭제 기능 , 함수분리
				HashMapUtils.deleteElem(hashMap, deleteName);
				
			} else if (weather.equals("5")) {
				System.out.println("랜덤 멤버 뽑기>>");
				String randomPickedMember = HashMapUtils.randomElem(hashMap);
				System.out.println("======랜덤 멤버 출력 3초전 =====");
				TimerThread th = new TimerThread(hashMap, randomPickedMember);
				th.start();
//				System.out.println("이름 : "+hashMap.get(randomPickedMember).getName());
//				System.out.println("연락처 : "+hashMap.get(randomPickedMember).getContact());
//				System.out.println("등록일 : "+hashMap.get(randomPickedMember).getRegDate());
			}
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, Person> hashMapContact = new HashMap<String, Person>();
		recommendFood(scanner, hashMapContact);

	}

}
