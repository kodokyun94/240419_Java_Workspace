package ex_240425;

public class ArrayRefMethodTest {

	public static String[] makeStringArray() {
		String[] tempStringArray = new String[3];
		for (int i = 0; i < tempStringArray.length; i++) {
			tempStringArray[i] = "먹고 싶은 점심 메뉴 " + i;
		}
		return tempStringArray;
	}

	public static void main(String[] args) {
		String[] lunchMenuKdk;
		lunchMenuKdk = makeStringArray();
		for (int i = 0; i < lunchMenuKdk.length; i++) {
			System.out.println("기본값 출력 : " + lunchMenuKdk[i]);
		}
		int lunchMenuKdkMemoryAddress = System.identityHashCode(lunchMenuKdk);
		System.out.println("lunchMenuKdk 의 메모리 위치 주소값 : " + lunchMenuKdkMemoryAddress);
		
		//lunchMenuKdk2
		String[] lunchMenuKdk2;
		lunchMenuKdk2 = makeStringArray();
		for (int i = 0; i < lunchMenuKdk2.length; i++) {
			System.out.println("기본값 출력 : " + lunchMenuKdk[i]);
		}
		int lunchMenuKdk2MemoryAddress = System.identityHashCode(lunchMenuKdk2);
		System.out.println("lunchMenuKdk2 의 메모리 위치 주소값 : " + lunchMenuKdk2MemoryAddress);

	}

}
