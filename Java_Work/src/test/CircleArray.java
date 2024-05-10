package test;

import java.util.Scanner;

class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}

public class CircleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle[] circles = new Circle[4]; // Circle 객체 배열 생성

        // 사용자로부터 4개의 반지름 입력받아 배열에 저장
        for (int i = 0; i < circles.length; i++) {
            System.out.print((i + 1) + " 반지름 >> ");
            int radius = scanner.nextInt();
            circles[i] = new Circle(radius);
        }

        // 원 면적의 합 계산
        double totalArea = 0;
        for (Circle circle : circles) {
            totalArea += circle.getArea();
        }

        // 결과 출력
        System.out.println("저장하였습니다...");
        System.out.println("원의 면적 전체 합은 " + totalArea);

        scanner.close();
    }
}
