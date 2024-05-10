package test;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("콤마로 분리된 어절을 입력하세요 (exit로 종료): ");
            String input = scanner.nextLine();

            // "exit"이 입력되면 프로그램 종료
            if (input.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }

            // 입력된 문자열을 콤마로 분리하여 어절 개수를 출력
            String[] words = input.split(",");
            System.out.println("어절 개수는 " + words.length);
        }

        scanner.close();
    }
}
