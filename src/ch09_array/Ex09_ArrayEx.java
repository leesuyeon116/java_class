package ch09_array;

import java.util.Scanner;

public class Ex09_ArrayEx {
    public static void main(String[] args) {
        /**
         * ------------------------------------------------------
         * 1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료
         * ------------------------------------------------------
         * 선택> 1
         * 학생수> 3
         * ------------------------------------------------------
         * 1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료
         * ------------------------------------------------------
         * 선택> 2
         * 1번 학생 점수: 90
         * 2번 학생 점수: 80
         * 3번 학생 점수: 77
         * ------------------------------------------------------
         * 1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료
         * ------------------------------------------------------
         * 선택> 3
         * 1번 학생 점수: 90
         * 2번 학생 점수: 80
         * 3번 학생 점수: 77
         * ------------------------------------------------------
         * 1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료
         * ------------------------------------------------------
         * 선택> 4
         * 최고점수: 90
         * 평균점수: 82.33333333333333
         * 1등: 90
         * 2등: 80
         * 3등: 77
         * ------------------------------------------------------
         * 1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료
         * ------------------------------------------------------
         * 선택>
         * ------------------------------------------------------
         */
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int studentNum = 0;
        int selectNo = 0;

        int[] scores = null;

        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scan.nextInt();

//            int[] scores = null;
            if (selectNo == 1) {

                System.out.print("학생수>");
                studentNum = scan.nextInt();

                scores = new int[studentNum];

//                int[] scores = new int[studentNum];
            } else if (selectNo == 2) {

                for (int i = 0; i < scores.length; i++) {
                    System.out.print((i + 1) + "번 학생 점수: ");
                    scores[i] = scan.nextInt();
                }
            } else if (selectNo == 3) {

                for (int i = 0; i < scores.length; i++) {
                    System.out.println((i + 1) + "번 학생 점수: " + scores[i]);
                }
            } else if (selectNo == 4) {

                int sum = 0, max = 0;
                double avg = 0.0;
                for (int i = 0; i < scores.length; i++) {
                    if (max < scores[i]) {
                        max = scores[i];
                    }
                    sum += scores[i];
                }
                avg = sum / scores.length;
                avg = (double) sum / scores.length;
                System.out.println("최고점수: " + max);
                System.out.println("평균점수: " + avg);


                int temp = 0;
                for (int i = 0; i < scores.length; i++) {
                    for (int j = i + 1; j < scores.length; j++) {
                        if (scores[i] < scores[j]) {
                            temp = scores[i];
                            scores[i] = scores[j];
                            scores[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < scores.length; i++) {
                    System.out.println((i + 1) + "등: " + scores[i]);
                }
            } else if (selectNo == 5) {

                run = false;
            }
        }
    }
}
