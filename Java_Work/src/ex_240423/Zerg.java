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
	
}
