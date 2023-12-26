package ch11_list.ex2;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        // Book 객체를 담기위한 bookList 객체 선언
        List<Book> bookList = new ArrayList<>();

        // 기본생성자로 Book 객체(book1) 생성 후 bookList에 추가
        Book book1 = new Book();
//        book1.setId(1L);
        book1.setBookTitle("푸바오, 매일매일 행복해");
        book1.setBookAuthor("에버랜드 동물원");
        book1.setBookPrice(20000);
        book1.setBookPublisher("시공주니어");
        bookList.add(book1);

        // 매개변수 생성자로 Book 객체(book2) 생성 후 bookList에 추가
        Book book2 = new Book("학교가 날아가 버렸으면 좋겠어", "에벨리네 히슬러 ", 4800, "반딧불이");
        bookList.add(book2);

        Book book3 = new Book("이번 생에 건물주 한번 돼보고 죽을랍니다", "노동환", 17000, "알키");
        bookList.add(book3);

        // for를 이용하여 bookList의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList = " + bookList.get(i));
        }

        // for each를 이용하여 bookList의 전체 데이터 출력
        for (Book book: bookList) {
            System.out.println("book = " + book);
        }

        // list의 0번 인덱스에 담긴 책의 가격을 50000으로 변경
        bookList.get(0).setBookPrice(50000);

        // list의 1번 인덱스에 담긴 출판사의 제목을 "안녕출판사"로 변경
        bookList.get(1).setBookPublisher("안녕출판사");

        // for를 이용하여 bookList의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList = " + bookList.get(i));
        }

        // for each를 이용하여 bookList의 전체 데이터 출력
        for (Book book: bookList) {
            System.out.println("book = " + book);
        }
    }
}
