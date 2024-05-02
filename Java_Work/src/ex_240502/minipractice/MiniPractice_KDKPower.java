package ex_240502.minipractice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import util.LocalDateTimeMake;
import util.dto.Person;

public class MiniPractice_KDKPower {

	
	public static HashMap<String, Person> contactMap = new HashMap<String, Person>();

	public static void recommendContact(Scanner scanner, HashMap<String, util.dto.Person> verStrings) {
		while (true) {
			System.out.println("========== 연락처 프로그램 ==========");
			System.out.println("연락처 프로젝트 해쉬맵 버전");
			System.out.println("1. 이름,연락처 입력, 2. 연락처 출력, 3. 연락처 검색, 4. 이름,연락처 삭제, 5. 랜덤 뽑기, 6. 종료하기. ");
			System.out.println("====================================");

			
			String kdk = scanner.next();

			if (kdk.equals("6")) {
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
			} else if (kdk.equals("1")) {
				System.out.print("이름 입력: ");
				String name = scanner.next();
				System.out.print("연락처 입력: ");
				String contact = scanner.next();
				String time = LocalDateTimeMake.now();

				Person person = new Person(name, contact, time);
				System.out.println("연락처가 등록되었습니다.");
				contactMap.put(name, person);

				continue;

			} else if (kdk.equals("2")) {
			    System.out.println("메뉴 출력>>");
			    if (contactMap.isEmpty()) {
			        System.out.println("등록된 연락처가 없습니다.");
			        return; 
			    }

			    System.out.println("연락처 목록");
			    Set<String> keys = contactMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
				Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
				while (it.hasNext()) {
				String keys2 = it.next(); // 키
				System.out.println(contactMap.get(keys2));
				}
				
			    continue;
			

			} else if (kdk.equals("3")) {
				System.out.print("검색할 이름 입력: ");
				String name = scanner.next();
				Person person = contactMap.get(name);
				if (person != null) {
					System.out.println("           검색 결과           ");
					System.out.println(person);
					System.out.println("                             ");
				} else {
					System.out.println("해당하는 이름의 연락처를 찾을 수 없습니다.");
				}
				continue;
			}

			else if (kdk.equals("4")) {
				System.out.print("삭제할 이름 입력: ");
				String name = scanner.next();
				if (contactMap.containsKey(name)) {
					contactMap.remove(name);
					System.out.println(name + "님의 연락처가 삭제되었습니다.");
				} else {
					System.out.println("해당하는 이름의 연락처를 찾을 수 없습니다.");
				}
				continue;
			} 
			else if (kdk.equals("5")) {
				if (contactMap.isEmpty()) {
					System.out.println("등록된 연락처가 없습니다.");
					return;
				}

				int randomIndex = (int) (Math.random() * contactMap.size());
				String randomName = (String) contactMap.keySet().toArray()[randomIndex];
				System.out.println("랜덤으로 선택된 멤버: " + randomName);
			}

		}
	}

	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, util.dto.Person> verStrings = new HashMap<String, util.dto.Person>();
		recommendContact(scanner, contactMap);
	}
}