package ch17_bookpang;

import ch17_bookpang.service.BookService;
import ch17_bookpang.service.MemberService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        BookService bookService = new BookService();
        MemberService memberService = new MemberService();
        while (run) {
            System.out.println("======== 회원 ========");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println("1. 회원가입 | 2. 로그인 | 3. 회원수정 | 4. 회원탈퇴 | 5. 로그아웃 | 6. 도서조회(id) | 7. 도서조회(제목) | 0. 종료");
            System.out.println("선택-> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                System.out.println("회원가입");
                // 호출하는 문장 작성
            } else if (selectNo == 2) {
                System.out.println("로그인");
                // 호출하는 문장 작성
            } else if (selectNo == 3) {
                System.out.println("회원수정");
                // 호출하는 문장 작성
            } else if (selectNo == 4) {
                System.out.println("회원탈퇴");
                // 호출하는 문장 작성
            } else if (selectNo == 5) {
                System.out.println("로그아웃");
                // 호출하는 문장 작성
            } else if (selectNo == 6) {
                System.out.println("도서조회(id)");
                // 호출하는 문장 작성
            } else if (selectNo == 7) {
                System.out.println("도서조회(제목)");
                // 호출하는 문장 작성
            } else if (selectNo == 0) {
                System.out.println("종료");
            }
        }
    }
}
