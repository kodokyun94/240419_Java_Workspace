package ex_240430;


class Parent {
	public String parentName;
}

class Child extends Parent {
	public String childName;
}

public class SuperAccessTest {

	public static void main(String[] args) {
		// 업캐스팅 , 부모 타입 = 자식 타입
		// 자식 클래스 멤버에 접근이 가능하냐? No 
		Parent p1 = new Child();
		// 부모 멤버에 접근이 가능. 
//		p1.parentName;

		// 다운 캐스팅, 자식 타입 = (자식 타입) 부모 타입
		Child c1 = (Child)p1;
		// 자식 클래스 멤버 및 부모 클래스 멤버도 다 보임.
//		c1.childName;
	}

}





