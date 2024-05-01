package ex_240501;

public class StringTest {

	public static void main(String[] args) {
		String java = "java";
		String bus = "bus";
		String energy = "energy";
		String butter = "butter";
		
		//비교
		int javaCompareBus=java.compareTo(bus);
		System.out.println("javaCompareBus : " + javaCompareBus);
		
		int busCompareJava=bus.compareTo(java);
		System.out.println("busCompareJava : " + busCompareJava);
		
		int busCompareBus=bus.compareTo(bus);
		System.out.println("busCompareBus : " + busCompareBus);

		int energyCompareBus=energy.compareTo(bus);
		System.out.println("energyCompareBus : " + energyCompareBus);
		
		int butterCompareBus=butter.compareTo(bus);
		System.out.println("butterCompareBus : " + butterCompareBus);
		
		//메모리 위치 주소값
		int resultBusAddr=System.identityHashCode(bus);
		System.out.println("resultBusAddr : " + resultBusAddr);
		
		int resultJavaAddr=System.identityHashCode(java);
		System.out.println("resultJavaAddr : " + resultJavaAddr);
		
		
	}

}
