package test;

import java.util.HashMap;
import java.util.Scanner;

public class NewTongjang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> accounts = new HashMap<>();

        System.out.println("<< 통장 관리 프로그램입니다. >>");

        while (true) {
            System.out.print("이름과 금액 입력 (exit로 종료): ");
            String input = scanner.nextLine();

            // "exit"이 입력되면 프로그램 종료
            if (input.equals("exit")) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }

            // 입력된 문자열을 공백을 기준으로 이름과 금액으로 분리
            String[] tokens = input.split(" ");
            String name = tokens[0];
            int amount = Integer.parseInt(tokens[1]);

            // HashMap에 이름과 금액을 누적하여 저장
            if (accounts.containsKey(name)) {
                int currentBalance = accounts.get(name);
                accounts.put(name, currentBalance + amount);
            } else {
                accounts.put(name, amount);
            }

            // 현재까지의 모든 고객의 통장 잔액 출력
            System.out.print("(");
            for (String key : accounts.keySet()) {
                System.out.print(key + ">" + accounts.get(key) + "원");
            }
            System.out.println(")");
        }

        scanner.close();
    }
}
