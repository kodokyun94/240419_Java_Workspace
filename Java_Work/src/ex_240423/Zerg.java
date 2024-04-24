package ex_240423;

public class Zerg {
	private String drone;
	private String zergling;
	private String hydra;
	
	//게터세터 덕에 멤버의 값에 접근, 설정 가능해짐
	public String getDrone() {
		return drone;
	}
	public void setDrone(String drone) {
		this.drone = drone;
	}
	public String getZergling() {
		return zergling;
	}
	public void setZergling(String zergling) {
		this.zergling = zergling;
	}
	public String getHydra() {
		return hydra;
	}
	public void setHydra(String hydra) {
		this.hydra = hydra;
	}
	
	//드론 일하기 메서드 만들기.
	public void MakeMoney() {
		System.out.println("드론으로 미네랄, 가스 채집하기");
	}
	
	//정찰을 보내보자.
	public void patrolDrone() {
		System.out.println("드론으로 스타팅 포인트로 정찰 보내기 *중요");
		
	}
	
	//전략을 선택.
	public void selectStrategy(String strategy) {
		System.out.println("내가 선택한 전략 : " + strategy);
	}
	
	//매개변수 3개짜리 생성자
	public Zerg(String drone, String zergling, String hydra) {
		super();
		this.drone = drone;
		this.zergling = zergling;
		this.hydra = hydra;
	}
	
	//매개변수가 없는 생성자 : 디폴트 생성자
	//시스템이 알아서 만들어줌
	//하지만 내가 따로 매개변수가 있는 생성자를 만들면, 기본 생성자를 안 만들어줌
	public Zerg() {
		// TODO Auto-generated constructor stub
	}
	
	
}
