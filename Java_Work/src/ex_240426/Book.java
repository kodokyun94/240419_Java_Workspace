package ex_240426;

public class Book {
	private String bookName;
	private String bookAutheor;
	private int bookprice;
	
	//getters,setters
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAutheor() {
		return bookAutheor;
	}
	public void setBookAutheor(String bookAutheor) {
		this.bookAutheor = bookAutheor;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	
	//생성자
	public Book() {}
	
	
	public Book(String bookName, String bookAutheor, int bookprice) {
		super();
		this.bookName = bookName;
		this.bookAutheor = bookAutheor;
		this.bookprice = bookprice;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + this.getBookName() );
		System.out.println("저자 : " + this.getBookAutheor());
		System.out.println("가격 : " + this.getBookprice());
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
