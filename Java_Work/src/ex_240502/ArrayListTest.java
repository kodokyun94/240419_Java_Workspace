package ex_240502;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import util.ArrayListUtils;
import util.LocalDateTimeMake;
import util.dto.LunchFood;

public class ArrayListTest {

	public static void main(String[] args) {
		 
		String nowTime = LocalDateTimeMake.now();
		// 점심 메뉴 모델 DTO(데이더 전달용) 클래스
		// VO(데이터베이스와 연관 된 클래스)
		LunchFood lunchFood = new LunchFood("김치찌개", 9000, nowTime, nowTime, "서면");
		LunchFood lunchFood2 = new LunchFood("밀면", 9000, nowTime, nowTime, "가야밀면");
		LunchFood lunchFood3 = new LunchFood("초밥", 9000, nowTime, nowTime, "문범초밥");
		
		ArrayList<LunchFood> lunchFoodlist = new ArrayList<LunchFood>();
		lunchFoodlist.add(lunchFood);
		lunchFoodlist.add(lunchFood2);
		lunchFoodlist.add(lunchFood3);
		
		ArrayListUtils.showArrayList(lunchFoodlist);
		
		
	}

}
