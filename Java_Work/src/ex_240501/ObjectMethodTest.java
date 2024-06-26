package ex_240501;

class Person {// 암묵적으로 Object 클래스 상속
	private String name, email;

	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}
	
	
	public boolean equals(Person person) {
		if (person.getName() == this.name && person.getEmail() == this.email) {
			return true;
		}else {
			return false;
		}

	}

}

public class ObjectMethodTest {

	public static void main(String[] args) {
		Person p1 = new Person("고도균", "hwasungnj@naver.com");
		Person p2 = new Person("고도균", "hwasungnj@naver.com");
		String result = p1.toString();
		boolean p1_p2_eqauls_result = p1.equals(p2);

		System.out.println("Person 이용 : " + result);
		System.out.println("person equals 이용 : " + p1_p2_eqauls_result);
	}

}
