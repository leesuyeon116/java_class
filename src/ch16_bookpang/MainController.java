package ch16_bookpang;

import ch16_bookpang.service.BookService;
import ch16_bookpang.service.MemberService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo;

        BookService bookService = new BookService();
        MemberService memberService = new MemberService();

        while (run) {
            System.out.println("=== 메인 메뉴 ===");
            System.out.println("1. 도서 서비스");
            System.out.println("2. 회원 서비스");
            System.out.println("3. 종료");
            System.out.print("서비스를 선택하세요 (1-3): ");

            try {
                selectNo = scanner.nextInt();
                scanner.nextLine(); // 개행 문자 처리
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                scanner.nextLine(); // 유효하지 않은 입력 처리
                continue;
            }

            switch (selectNo) {
                case 1:
                    runBookService(scanner, bookService);
                    break;
                case 2:
                    runMemberService(scanner, memberService);
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다. 안녕히 계세요!");
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 올바른 숫자를 입력하세요.");
            }
        }

        scanner.close();
    }

    private static void runBookService(Scanner scanner, BookService bookService) {
        boolean runBookService = true;
        int bookServiceOption;

        while (runBookService) {
            System.out.println("=== 도서 서비스 메뉴 ===");
            System.out.println("1. 도서 추가");
            System.out.println("2. 모든 도서 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 가격 수정");
            System.out.println("5. 도서 삭제");
            System.out.println("6. 카트에 추가");
            System.out.println("7. 카트 조회");
            System.out.println("8. 카트에서 삭제");
            System.out.println("9. 메인 메뉴로 돌아가기");
            System.out.print("옵션을 선택하세요 (1-9): ");

            try {
                bookServiceOption = scanner.nextInt();
                scanner.nextLine(); // 개행 문자 처리
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                scanner.nextLine(); // 유효하지 않은 입력 처리
                continue;
            }

            switch (bookServiceOption) {
                case 1:
                    bookService.save();
                    break;
                case 2:
                    bookService.findAll();
                    break;
                case 3:
                    bookService.search();
                    break;
                case 4:
                    bookService.update();
                    break;
                case 5:
                    bookService.delete();
                    break;
                case 6:
                    bookService.addToCart();
                    break;
                case 7:
                    bookService.viewCart();
                    break;
                case 8:
                    bookService.removeFromCart();
                    break;
                case 9:
                    runBookService = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 올바른 숫자를 입력하세요.");
            }
        }
    }

    private static void runMemberService(Scanner scanner, MemberService memberService) {
        boolean runMemberService = true;
        int memberServiceOption;

        while (runMemberService) {
            System.out.println("=== 회원 서비스 메뉴 ===");
            System.out.println("1. 회원 가입");
            System.out.println("2. 로그인");
            System.out.println("3. 모든 회원 조회");
            System.out.println("4. 회원 정보 수정");
            System.out.println("5. 회원 계정 삭제");
            System.out.println("6. 로그아웃");
            System.out.println("7. 메인 메뉴로 돌아가기");
            System.out.print("옵션을 선택하세요 (1-7): ");

            try {
                memberServiceOption = scanner.nextInt();
                scanner.nextLine(); // 개행 문자 처리
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                scanner.nextLine(); // 유효하지 않은 입력 처리
                continue;
            }

            switch (memberServiceOption) {
                case 1:
                    memberService.save();
                    break;
                case 2:
                    memberService.login();
                    break;
                case 3:
                    memberService.findAll();
                    break;
                case 4:
                    memberService.update();
                    break;
                case 5:
                    memberService.delete();
                    break;
                case 6:
                    memberService.logout();
                    break;
                case 7:
                    runMemberService = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 올바른 숫자를 입력하세요.");
            }
        }
    }
}
