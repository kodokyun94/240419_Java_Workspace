package ex_240501;

public class WrapperTest {

	public static void main(String[] args) {
		//기본형 -> 참조형 타입 변환(박싱)
		//참조형 -> 기본형 캐스팅 등을 지원
		//int
		Integer integer = Integer.valueOf(31);
		
		//bitCount(int i) (기본 -> 참조)
		int bitCountResult =integer.bitCount(31);
		System.out.println("bitCountResult : " + bitCountResult);
		
		//intValue() (참조 -> 기본)
		int refTointResult=integer.intValue();
		System.out.println("refTointResult : " + refTointResult);
		
		//int parseInt(String str)
		int stringTointResult = integer.parseInt("12345");
		System.out.println("stringTointResult : " + stringTointResult);
		
		//int parseInt(String str, int radix)
		int intToBinaryResult=integer.parseInt("31", 8);
		System.out.println("intToBinaryResult : " + intToBinaryResult);
		
				

	}

}
