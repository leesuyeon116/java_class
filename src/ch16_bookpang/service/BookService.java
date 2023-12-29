package ch16_bookpang.service;


import ch16_bookpang.dto.BookDTO;
import ch16_bookpang.repository.BookRepository;

import java.util.List;
import java.util.Scanner;

public class BookService {
    Scanner scanner = new Scanner(System.in);
    BookRepository bookRepository = new BookRepository();
    public void save() {
        System.out.print("도서명: ");
        String bookTitle = scanner.next();
        System.out.print("저자: ");
        String bookAuthor = scanner.next();
        System.out.print("가격: ");
        int bookPrice = scanner.nextInt();
        System.out.print("출판사: ");
        String bookPublisher = scanner.next();
        BookDTO bookDTO = new BookDTO(bookTitle, bookAuthor, bookPrice, bookPublisher);
        boolean result = bookRepository.save(bookDTO);
        if (result) {
            System.out.println("등록 성공");
        }else {
            System.out.println("등록 실패");
        }
    }
    public void findAll() {
        List<BookDTO> bookDTOList = bookRepository.findAll();
        for (BookDTO bookDTO: bookDTOList) {
            System.out.println("bookDTO = " + bookDTO);
        }
    }
    public void findById() {
        System.out.print("조회 id: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("조회결과가 없습니다!");
        }
    }
    public void findByTitle() {            // 뭐 때문에 오류일까?
        System.out.print("도서명: ");
        String bookTitle = scanner.next();
        BookDTO bookDTO = bookRepository.findByTitle(bookTitle);
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("조회결과가 없습니다!");
        }
    }

    public void search() {
        System.out.print("검색어: ");
        String bookTitle = scanner.next();
        List<BookDTO> bookDTOList = bookRepository.search(bookTitle);
        if (bookDTOList.size() > 0) {
            for (BookDTO bookDTO : bookDTOList) {
                System.out.println("bookDTO = " + bookDTO);
            }
        } else {
            System.out.println("조회결과가 없습니다!");
        }
    }
    public void update() {
        System.out.print("수정할 id: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if (bookDTO != null) {
            System.out.println("수정할 가격: ");
            int bookPrice = scanner.nextInt();
            boolean updateResult = bookRepository.update(id, bookPrice);
            if (updateResult) {
                System.out.println("수정 성공");
            } else {
                System.out.println("수정 실패");
            }
        } else {
            System.out.println("조회결과가 없습니다!");
        }
    }
    public void delete() {
        System.out.println("삭제할 id: ");
        Long id = scanner.nextLong();
        boolean result = bookRepository.delete(id);
        if (result) {
            System.out.println("삭제 성공");
        } else {
            System.out.println("삭제 실패");
        }
    }

}