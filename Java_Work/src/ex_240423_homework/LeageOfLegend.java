package ex_240423_homework;

public class LeageOfLegend {
		private String  Top;
		private String Jungle;
		private String Mid;
		
		
		public String getTop() {
			return Top;
		}
		public void setTop(String top) {
			Top = top;
		}
		public String getJungle() {
			return Jungle;
		}
		public void setJungle(String jungle) {
			Jungle = jungle;
		}
		public String getMid() {
			return Mid;
		}
		public void setMid(String mid) {
			Mid = mid;
		}
		public String getBottom() {
			return Bottom;
		}
		public void setBottom(String bottom) {
			Bottom = bottom;
		}
		private String Bottom;

		//함수 만들기
		public void ChoiseLine() {
			System.out.println("탑 정글 미드 바텀 어느라인을 갈 지 선택해야 하는데 난 바텀갈랭");
		}
		
		public void MakeMoney() {
			System.out.println("돈을 벌기 위해선 씨에스 또는 중립몬스터를 잡아서 돈을 버는데, 제일 좋은 방법은 상대를 죽이는 것이다. 씨에스 냐미");
		}
		
		
		public void HowWin() {
			System.out.println("상대방의 넥서스를 파괴하면 승리!");
		}
	
}