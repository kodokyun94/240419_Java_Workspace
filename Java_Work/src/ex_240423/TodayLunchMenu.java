package ex_240423;

public class TodayLunchMenu {

	//자바는 메인에서 시작해서, 메인으로 끝난다. 실행 하는 클래스 역할
	public static void main(String[] args) {
		System.out.println("메인 시작");
		
		//A a = new A()
		//A : 클래스명 ex)KoreanFood
		//a : 참조형 변수 ex)bibimbab
		//new : 예약어
		//A() : 생성자
		//객체 만들어보기(인스턴스화 하기)
		KoreanFood bibimbab = new KoreanFood("비빔밥", 9000, "본죽비빔밥");
		KoreanFood bulgogi = new KoreanFood("불고기", 7500, "태산");
		KoreanFood dolsot = new KoreanFood("돌솥비빔밥", 8000, "우정비빔밥");
		
		
		//객체 -> 수납도구 -> 멤버와 함수
		//출력해보기
		System.out.println("오늘 점심 메뉴 :" + bibimbab.getfoodName());
		System.out.println("오늘 점심 메뉴 가격 :" + bibimbab.getFoodPrice() +"원");
		System.out.println("오늘 점심 메뉴 먹는 장소 :" + bibimbab.getFoodPlace());
		
		//전역 상수 및 전역 메서드 사용해보기. 클래스명 : KoreanFood
		//사용방법 : 클래스명.멤버 또는 클래스명.함수
		String test = KoreanFood.showStaticMember();
		System.out.println("test 변수에 담긴 내용 출력" + test);
		
		//Hello.java 파일 안에 있는 전역 함수 사용해보기
		Hello.sum(1000, 2000);
		int result =Hello.sum(1000, 2000);
		System.out.println("Hello의 클래스 안에 함수 실행 결과 : " + result);
	}

}
