package ex_240426;

public class BookTest extends Book {

	public static void main(String[] args) {
		//book 인스턴스 3개 만들어 주세요
		//book 3개를 받는 배열도 만들어 주세요
		//배열에 담아서, 반복문으로 출력
		Book bookArrey[] = new Book[3];
		
		bookArrey[0] = new Book("노인가바다", "LSY", 15000);
		bookArrey[1] = new Book("아부지는 말하셨지", "인생을즐겨라", 25000);
		bookArrey[2] = new Book("html의 모든것", "이상용", 38500);
		
		for (int i = 0; i < bookArrey.length; i++) {
			bookArrey[i].showInfo();
		}
		
		//지정해서 넣는 방법
//		Book book1 = new Book();
//		book1.setBookName("노인가바라");
//		book1.setBookAutheor("고도균");
//		book1.setBookprice(15000);
//		
//		Book book2 = new Book();
//		book2.setBookName("html의 정석");
//		book2.setBookAutheor("이상용");
//		book2.setBookprice(17000);
//		
//		Book book3 = new Book();
//		book3.setBookName("넌 내게서 맴돌아");
//		book3.setBookAutheor("milin");
//		book3.setBookprice(18000);
//		
//		Book[] Books = new Book[] {book1, book2, book3};
//		
//		for (int i = 0; i < Books.length; i++) {
//			System.out.println("이름 : " + Books[i].getBookName() );
//			System.out.println("저자 : " + Books[i].getBookAutheor());
//			System.out.println("가격 : " + Books[i].getBookprice());
//			System.out.println();
//
//		}
	}
}


