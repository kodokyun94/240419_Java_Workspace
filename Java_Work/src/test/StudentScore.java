package test;

public class StudentScore {
	    public static void main(String[] args) {
	        int[][] scores = {
	                {80, 60, 70},
	                {90, 95, 80},
	                {75, 80, 100},
	                {80, 70, 95},
	                {100, 65, 80}
	        };

	        System.out.println("학생번호 국어 영어 수학 총점 평균");
	        System.out.println("=============================================");

	        for (int i = 0; i < scores.length; i++) {
	            int total = 0;
	            double average = 0.0;

	            System.out.print((i + 1) + "번 학생: ");

	            for (int j = 0; j < scores[i].length; j++) {
	                System.out.print(scores[i][j] + " ");
	                total += scores[i][j];
	            }

	            average = (double) total / scores[i].length;
	            System.out.println(total + " " + average);
	        }
	    }
	}

