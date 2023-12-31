package ch07_while;

import java.util.Scanner;

public class Ex06_WhileEx {
    public static void main(String[] args) {
        /**정수를 입력하고 마지막에 0을 입력하세요:
         * 120
         * 입력한 숫자는 2개 입니다.
         * 평균은 1입니다.
         * 정수를 입력하고 마지막에 0을 입력하세요:
         * 12 438 99 20 0
         * 입력한 숫자는 4개 입니다.
         * 평균은 142입니다.
         * 정수를 입력하고 마지막에 0을 입력하세요:
         * 78 992 77 1 29 39 59 0
         * 입력한 숫자는 7개 입니다.
         * 평균은 182입니다.
         * 정수를 입력하고 마지막에 0을 입력하세요:
         */
        Scanner scanner = new Scanner(System.in);
        // 숫자 입력용 변수
        int num = 0;
        // 합계용 변수
        int sum = 0;
        // 갯수용 변수
        int count = 0;
        boolean run = true;
        System.out.println("정수를 입력하고 마지막에 0을 입력하세요 :");
        while (run) {
            num = scanner.nextInt();
//            System.out.println("num = " + num);
            if (num == 0) {
                run = false;
            } else {
                // 합계 계산
                sum += num;
                // 입력된 숫자 갯수 +1
                count++;
            }
        }
        int avg1 = sum / count;
        System.out.println("avg1 = " + avg1);
        double avg2 = sum / count;
        System.out.println("avg2 = " + avg2);
        double avg3 = (double) sum / count;
        System.out.println("avg3 = " + avg3);
    }
}

