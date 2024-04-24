package ex_240424;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		//스캐너 사용하기.
		//순서1. scanner 클래스 사용
		//클래스 객체 생성 방법 : A a =new A();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가입할 이메일을 작성 해 주세요.");
		String userEmail = scanner.next();
		System.out.println("가입할 메일은 : " + userEmail);

		
		//자원 반납. -> scanner라는 객체를 생성자 호출해서 초기화 했음
		//메모리를 사용했으니, 반납함.
		scanner.close();
		
		
		
	}

}
