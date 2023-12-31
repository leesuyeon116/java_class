package ch17_bookpang.repository;

import ch17_bookpang.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private static List<BookDTO> bookDTOList = new ArrayList<>();
    // 도서목록 메서드
    private List<BookDTO> findAll() {
        return bookDTOList;
    }

    // 도서조회 메서드
    private BookDTO findId(Long id) {
        BookDTO bookDTO = null;
        for (BookDTO bookDTO1: bookDTOList) {
            if (id.equals(bookDTO1.getId())) {
            }
        }
        return bookDTO;
    }
    public BookDTO findByTitle(String bookTitle) {
        BookDTO bookDTO = null;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if (bookTitle.equals(bookDTOList.get(i).getBookTitle())) {
                bookDTO = bookDTOList.get(i);
            }
        }
        return bookDTO;
    }

    public List<BookDTO> search(String bookTitle) {
        //  검색결과 담을 Lsit 선언
        List<BookDTO> bookDTOS = new ArrayList<>();
        for (int i = 0; i < bookDTOList.size(); i++) {
            // 저장되어 있는 도서명에 검색어가 포함되어 있으면 true
            if (bookDTOList.get(i).getBookTitle().contains(bookTitle)) {
                // 조건을 만족하면 bookDTOS 에 추가
                BookDTO bookDTO = bookDTOList.get(i);
                bookDTO.add(bookDTO);
            }
        }
        return bookDTOS;
    }

    public boolean update(Long id, int bookTitle) {
        boolean result = false;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if (id.equals(bookDTOList.get(i).getId())) {
                bookDTOList.get(i).setBookPrice(bookTitle);
                result = true;
            }
        }
        return result;
    }
    public boolean delete(Long id) {
        boolean result = false;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if (id.equals(bookDTOList.get(i).getId())) {
                bookDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }
}
