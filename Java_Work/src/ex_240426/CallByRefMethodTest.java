package ex_240426;

public class CallByRefMethodTest {

	public static void increase(int m) {
		//int m = n
		//지역변수
		m=m+1;
	}
	
	//int[]array = a 
	public static void increaseArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		//기본형
		int n = 10;
		increase(n);
		System.out.println("n : " + n);
		
		//참조형
		int[] a = {1,2,3,4,5};
		increaseArray(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a : [" + i + "] : " + a[i]);
		}
	}
	

}
