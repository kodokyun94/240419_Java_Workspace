package ex_240423;

public class Starcraft_BattleNet_Asia {

	public static void main(String[] args) {
		
		System.out.println("스타크래프트로 자바의 기본객체 순서 및 게터세터");
		//작업순서1, 객체 생성
		Zerg zerg1 = new Zerg();
		//작업순서2, 드론 만들기
		zerg1.setDrone("9드론 생산함");
		//작업순서3, 미네랄, 가스 채집
		zerg1.MakeMoney();
		//작업순서4, 정찰 보내기
		zerg1.patrolDrone();
		//작업순서5, 전략 선택
		String kdkZergstrategy = "고도균씨는 오늘도 주말 새벽 아침부터 저그에 온힘을 다하고 있다.";
		
		System.out.println("오늘도 고도균씨는 새벽에 몰래 게임하는 방법만 연구하는중");		
	}

}
