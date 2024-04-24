package ex_240423_2;

import ex_240423.Hello;
import ex_240423.KoreanFood;
import ex_240423.Zerg;

public class TestHello {

	public static void main(String[] args) {
	//패키지 명 : ex_240423
	//클래스 명 : Hello
	//사용 할 메서드 : sum, 리턴, 파라미터 있다.
	//다른 패키지의 클래스 사용하려면 : import 사용
		int result;
		result = Hello.sum(10, 20);
		System.out.println("result : " + result);

		//앞시간에 만들었던 점심메뉴, 스타 불러와서 사용하기
		//인스턴스, 객체를 사용해서 이용함.
		
		KoreanFood forkSoupFood = new KoreanFood("섞어국밥", 9500, "밀양돼지국밥_서면점");
		
		//기본 생성자로 만들어서, 각각 하나씩 따로 
		Zerg zerg1 = new Zerg();
		zerg1.setDrone("드론9마리");
		zerg1.setZergling("6저글링");
		zerg1.selectStrategy("3해처리 뮤탈 기본 운영");
		zerg1.setHydra("4마리");
		System.out.println("zerg1 객체를 바로 출력 : " + zerg1);
		
		
		
	}

}
