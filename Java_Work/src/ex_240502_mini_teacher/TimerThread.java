package ex_240502_mini_teacher;

import java.util.HashMap;

import util.dto.Person;

public class TimerThread extends Thread {
	private HashMap<String,Person> hashMap;
	private String randomPickedMember;
	
	public TimerThread(HashMap<String, Person> hashMap,String randomPickedMember) {
		super();
		this.hashMap = hashMap;
		this.randomPickedMember = randomPickedMember;
	}
	
	int n = 0;
	int b = 3;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (n < 3) {
			System.out.println(b);
			n++;
			b--;
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("이름 : "+hashMap.get(randomPickedMember).getName());
		System.out.println("연락처 : "+hashMap.get(randomPickedMember).getContact());
		System.out.println("등록일 : "+hashMap.get(randomPickedMember).getRegisterDate());
	}

}
