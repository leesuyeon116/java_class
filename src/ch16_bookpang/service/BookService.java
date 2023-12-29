package ch16_bookpang.service;


import ch16_bookpang.dto.BookDTO;
import ch16_bookpang.dto.CartDTO;
import ch16_bookpang.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    Scanner scanner = new Scanner(System.in);
    BookRepository bookRepository = new BookRepository();
    private List<CartDTO> cart = new ArrayList<>(); // 카트 리스트
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
    //  카트 도서 추가 메서드
    public void addToCart() {
        System.out.println("추가할 도서의 id: ");
        Long bookId = scanner.nextLong();
        System.out.println("추가할 수량: ");
        int quantity = scanner.nextInt();

        BookDTO bookDTO = bookRepository.findById(bookId);
        if (bookDTO != null) {
            int totalPrice = bookDTO.getBookPrice() * quantity;
            CartDTO cartItem = new CartDTO(bookId, bookDTO.getBookTitle(), quantity, totalPrice);
            cart.add(cartItem);
            System.out.println("카트에 도서가 추가되었습니다.");
        } else {
            System.out.println("도서를 찾을 수 없습니다.");
        }
    }

    //  카트 내용 조회 메서드
    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("카트가 비어 있습니다.");
        } else {
            System.out.println("카트 내용:");
            for (CartDTO cartItem : cart) {
                System.out.println(cartItem);
            }
        }
    }
    //  카트 도서 제거 메서드
    public void removeFromCart() {
        if (cart.isEmpty()) {
            System.out.println("카트가 비어 있습니다.");
        } else {
            System.out.print("삭제할 도서의 id: ");
            Long bookId = scanner.nextLong();

            // Iterator를 사용하여 도서 ID에 해당하는 아이템을 찾아 제거
            // Iterator를 사용하는 이유는 중간에 아이템을 제거할 때 ConcurrentModificationException을 방지하기 위함
            for (var iterator = cart.iterator(); iterator.hasNext(); ) {
                CartDTO cartItem = iterator.next();
                if (cartItem.getBookId().equals(bookId)) {
                    iterator.remove();
                    System.out.println("카트에서 도서가 제거되었습니다.");
                    return;
                }
            }

            System.out.println("해당 id의 도서를 찾을 수 없습니다.");
        }
    }

}
