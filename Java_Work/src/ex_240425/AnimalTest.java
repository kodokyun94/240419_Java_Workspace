package ex_240425;

public class AnimalTest {

	public static void main(String[] args) {
		// 고양이 만들기.
		Cat cat1 = new Cat();
		// 고양이 정보도 설정.
		cat1.setName("모찌");
		cat1.setAge(2);
		String[] catFoodList = { "츄르", "참치캔", "생선" };
		cat1.setFavoriteFood(catFoodList);
		cat1.setPlace("정섭씨 집에");
		// 고양이 정보 출력하기.
		String catInformation = cat1.toString();
		System.out.println("고양이 정보 : " + catInformation);
		// 고양이 기능 출력하기.
		cat1.moveAction("우다닥 다닌다.");
		cat1.speakSound("야옹~~~");
		System.out.println("고양이가 사는 곳 : " + cat1.getPlace());
		System.out.println("===============================");
	
		Pig pig1 = new Pig();
		pig1.setName("삼겹살");
		pig1.setAge(5);
		String[] Pigfoodlist = {"뭐든", "전부", "다", "잘먹음"};
		pig1.setFavoriteFood(Pigfoodlist);
		pig1.setPlace("우리집");
		String pigInformation = pig1.toString();
		System.out.println("돼지 정보 : " + pigInformation);
		pig1.moveAction("우르르르아르르르");
		pig1.speakSound("커거거컥겅");
		System.out.println("돼지가 사는곳 : " + pig1.getPlace());
		pig1.setTodayLunch("꿀꿀이죽");
		System.out.println("돼지가 먹은 점심 : " + pig1.getTodayLunch());
		System.out.println("===============================");
	
		
		Dinosaur din1 = new Dinosaur();
		din1.setName("악동뮤지션");
		din1.setAge(35547);
		String[] Dinosaurfoodlist = {"사람", "인간", "휴먼"};
		din1.setFavoriteFood(Dinosaurfoodlist);
		din1.setPlace("초원");
		String dinosaurInformation = din1.toString();
		
		System.out.println("공룡 정보 : " + dinosaurInformation);
		din1.moveAction("휘요오오오오옷");
		din1.speakSound("쿼아오오오오옷");
		System.out.println("공룡이 사는곳 : " + din1.getPlace());
		din1.setTodayDinner("승배");
		System.out.println("공룡이 먹은 저녁 : " + din1.getTodayDinner());
		
	}

}
