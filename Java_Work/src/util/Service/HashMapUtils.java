package util.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import util.RandomSelectNumber;
import util.dto.Person;

public class HashMapUtils {
	// 출력
	public static void showElem(HashMap<String, Person> hashMap) {
		Set<String> keys = hashMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
		Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
		while (it.hasNext()) {
			String key = it.next(); // 키
			Person value = (Person) hashMap.get(key); // 값
			System.out.println("(이름: " + value.getName() + ", 연락처 : " + value.getContact() + ", 등록일 : "
					+ value.getRegisterDate() + ")");
		}

	} // 출력 닫기

	// 검색
	public static HashMap<String, Person> findElem(HashMap<String, Person> hashMap, String searchName) {

		Set<String> keys = hashMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
		Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
		HashMap<String, Person> searchMap = new HashMap<String, Person>();
		while (it.hasNext()) {
			String key = it.next(); // 키
			if (key.equals(searchName)) {
				Person person = hashMap.get(searchName);
				searchMap.put(searchName, person);
			}

		}
		return searchMap;

	}// 검색 닫기

	// 삭제
	public static void deleteElem(HashMap<String, Person> hashMap, String searchName) {
		hashMap.remove(searchName);
//		Set<String> keys = hashMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
//		Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
//
//		while (it.hasNext()) {
//			String key = it.next(); // 키
//			if (key.equals(searchName)) {
//				System.out.println(searchName + "님 삭제 완료");
//				hashMap.remove(searchName);
//			}
//		}
	}// 삭제 닫기

	// 랜덤
	public static String randomElem(HashMap<String, Person> hashMap) {
		int memberSize = hashMap.size();
		int randomNumber = RandomSelectNumber.selectInt(memberSize);

		ArrayList<String> memberArrayList = new ArrayList<String>();

		Set<String> keys = hashMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
		Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴

		while (it.hasNext()) {
			String key = it.next(); // 키
			memberArrayList.add(key);
		}
		String randomPickedMemberName = memberArrayList.get(randomNumber);
		return randomPickedMemberName;
	}// 랜덤 닫기

	// value 역순 정렬
	public static HashMap<String, Person> sortReverseElem(HashMap<String, Person> hashMap) {
		List<Map.Entry<String, Person>> list = new LinkedList<Map.Entry<String, Person>>(hashMap.entrySet());

		Collections.sort(list, comp);

		HashMap<String, Person> temp = new LinkedHashMap<String, Person>();

		for (Map.Entry<String, Person> entry : list) {
			temp.put(entry.getKey(), entry.getValue());

		}
		return temp;
	}// value 역순 정렬

	// 역순 기능 정렬 도구
	static Comparator<Map.Entry<String, Person>> comp = new Comparator<Map.Entry<String, Person>>() {

		@Override
		public int compare(Entry<String, Person> o1, Entry<String, Person> o2) {
			String date1 = o1.getValue().getRegisterDate();
//			System.out.println("date1 : " + date1);
			String date1_trim = date1.replaceAll("[\\s-:]", "");
//			System.out.println("date1_trim : " + date1_trim);
			
			Long l1 = Long.parseLong(date1_trim);
			
			
			
			String date2 = o2.getValue().getRegisterDate();
//			System.out.println("date2 : " + date2);
			String date2_trim = date2.replaceAll("[\\s-:]", "");
//			System.out.println("date2_trim : " + date2_trim);
			Long l2 = Long.parseLong(date2_trim);
			
//			System.out.println("l1 - l2 : " + (l1-l2));
//			System.out.println("l1.compareTo(l2) : " + l1.compareTo(l2));
			int resultInt = (int)(l1 - l2);
			return -resultInt;
		}
		// 역순 기능 정렬 도구
	};

} // 클래스 닫는 기호
