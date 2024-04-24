package ex_240423;

import java.security.PublicKey;

public class KoreanFood {
	// 설계도면으로 사용할 예정.
	// 객체 -> 수납도구 -> 멤버, 함수를 가지고 있다.
	// 멤버와 메서드를 가지고 있다.
	private String foodName;
	private int foodPrice;
	private String foodPlace;
	
	//전역사용, 상수 -> 전역 상수
	private static final String projectName ="오늘 점심 메뉴 선정 프로젝트";
	
	// getter/setter 라는 것을 추가하기.
	// 반자동(코드 스니펫으로 자동 만들기)
	// 우클릭 -> source -> generate getters and setters
	// 멤버를 선택하는 창 나옴. -> 모두 선택

	public String getfoodName() {
		return foodName;
	}

	public void setfoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public String getFoodPlace() {
		return foodPlace;
	}

	public void setFoodPlace(String foodPlace) {
		this.foodPlace = foodPlace;
	}

	// 방법2, lombok 라이브러리 : 메모리상에 게터 세터 스트링 데이트 등 옵션을 만들어 놓음.

	// 생성자 만들기. 클래스는 설계도면으로 사용할 예정,
	// 매개변수가 3개인 생성자 만들기
	// 반자동생성
	// 우클릭->소스->generate constructor field 클릭
	public KoreanFood(String foodName, int foodPrice, String foodPlace) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodPlace = foodPlace;
	}
	
	//static 전역 메서드 만들기, 인스턴스 안만들고, 해당 클래스명으로 바로 접근이 가능하다
	public static String showStaticMember() {
		return projectName;
		
		//전부 출력하는 함수 만들기. 인스턴스 메서드 방법으로
		
	}

}
