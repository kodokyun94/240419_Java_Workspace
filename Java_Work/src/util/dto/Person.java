package util.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Person {
	private String name;
	private String contact;
	private String registerDate;
	
	public Person(String name, String contact, String registerDate) {
		super();
		this.name = name;
		this.contact = contact;
		this.registerDate = registerDate;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", contact=" + contact + ", registerDate=" + registerDate + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	/*
	 * public Person(String name, String contact, LocalDateTime registerDate) {
	 * this.name = name; this.contact = contact; this.registerDate = registerDate; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public String getContact() { return contact; }
	 * 
	 * public LocalDateTime getRegisterDate() { return registerDate; }
	 * 
	 * @Override public String toString() { LocalDateTime now = LocalDateTime.now();
	 * DateTimeFormatter dateTimeFormatter =
	 * DateTimeFormatter.ofPattern("yyyy/M/d a:h:m"); String nowString =
	 * now.format(dateTimeFormatter); return nowString;
	 * 
	 * 
	 * }
	 */
}
