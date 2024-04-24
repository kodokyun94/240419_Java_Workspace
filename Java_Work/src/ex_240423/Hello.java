package ex_240423;

public class Hello {
	public static int sum(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
	//함수 안에 있기 때문에 지역변수
	//종료 하는 시점에 없어짐.
	int i=20;
	
	int result =sum(100, 200);
	System.out.println("result의 값 출력 해보기 : " + result);
	}

}
