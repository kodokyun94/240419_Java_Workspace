package test;

import java.util.HashMap;
import java.util.Scanner;

public class Drink {
    public static void main(String[] args) {
        HashMap<String, Integer> beveragePrices = new HashMap<>();
        beveragePrices.put("밀키스", 700);
        beveragePrices.put("코카콜라", 800);
        beveragePrices.put("펩시", 1000);
        beveragePrices.put("칠성사이다", 1200);

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("밀키스, 코카콜라, 펩시, 칠성사이다 있습니다.");
        
        while (true) {
            System.out.print("선택 >> (그만으로 종료): ");
            String beverageName = scanner.nextLine();

            if (beverageName.equals("그만")) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }

            Integer price = beveragePrices.get(beverageName);
            if (price != null) {
                System.out.println(beverageName + "는  " + price + "원 입니다.");
            } else {
                System.out.println("해당 음료수의 가격을 찾을 수 없습니다.");
            }
        }

        scanner.close();
    }
}
