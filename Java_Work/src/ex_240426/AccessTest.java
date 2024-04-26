package ex_240426;

import ex_240426.ProtectedTest.A;

class Sample{
	public int a;
	private int b=100;
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	int c;
	
	//전역
	static int tvChannel=3;
	static void channelUp() {
		tvChannel++;
	}
	private static void channelDown() {
		tvChannel--;
	}
	
}


public class AccessTest {

	public static void main(String[] args) {
		Sample sample = new Sample();
//		sample.b = 3;
		int result = sample.getB();
		System.out.println("result : " + result);
		
		sample.a = 200;
		System.out.println("a : " + sample.a);
		
		//세명이 공용거실에서 쉬는 중
		Sample lsy = new Sample();
		Sample krk = new Sample();
		Sample hsj = new Sample();
		System.out.println("이상용씨가 티비를 " + lsy.tvChannel + "번 채널 시청중");
		System.out.println("강루키씨가 UFC를 보고싶어 채널 1올렸음");
		Sample.channelUp();
		System.out.println("이상용, 강루키, 홍사자 같은채널 " + lsy.tvChannel + "번 채널 시청중");
	}

}
