package test;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SmallestPopulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> nations = new HashMap<>();

        System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");

        // 5개의 나라 이름과 인구를 입력받아 HashMap에 저장
        for (int i = 0; i < 5; i++) {
            System.out.print("나라 이름, 인구 >> ");
            String name = scanner.next();
            int population = scanner.nextInt();
            nations.put(name, population);
        }

        // 가장 인구가 적은 나라 검색하여 출력
        String smallestNation = null;
        int smallestPopulation = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : nations.entrySet()) {
            if (entry.getValue() < smallestPopulation) {
                smallestNation = entry.getKey();
                smallestPopulation = entry.getValue();
            }
        }

        System.out.println("제일 인구가 적은 나라는 (" + smallestNation + ", " + smallestPopulation + ")");
        
        scanner.close();
    }
}
