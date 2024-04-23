//패키지는 내부, 외부 사용 폴더개념으로 보면 됨, 여기에 필요한 클래스들을 담아둔다.
package ex_240423;

import java.util.Iterator;

//클래스 , 1) 메인 메서드 가지고 있어서 실행하는 클래스 역할
//		  2) 설계도로 사용하는 경우도 있다. -> 인스턴스를 생성하는 용도로 사용
//		  3) 보라색으로 색상 구분이 되는데 예약어, 시스템에서 미리 예약되어서 이름으로 사용X
public class TestClass1 {

	//public : 접근 지정자, 어느곳에서든 다 볼 수 있다. 다 접근 가능
	//default, protected, private : 상속, 특정조건에서 보이고, 접근이 가능함.
	
	//static : 전역으로 사용함, 메인 실행하면 해당 클래스들을 로드(불러옴)
	// 시스템의 전역공간(메모리)에 미리 올라와 있다.
	
	//<>인스턴스 -> 클래스 생성자를 호출해서 객체를 만든다.
	
	//void : 공허한, 비어있는, 리턴이 없다.
	//main : 매서드 이름(함수 이름)
	//String[] args : 파라미터(받는 변수 , 매개변수)
	//String : 문자열 타입
	//args : 변수명(참조형 타입 : 객체)
	public static void main(String[] args) {
		//메인 ㅔ서드로 시작해서 메인을 끝난다.*
		System.out.println("메인 시작입니다.");
		for(int i = 0; i<10; i++) {
			System.out.println("for 문 안에서 실행해보기 i 조회 :" + i);
			System.out.println("for 문 종료");
			System.out.println();
		}

	}

}
