package ch17_bookpang.dto;

public class BookDTO {
    private Long id;    // 도서관리번호
    private String bookTitle;   // 도서명
    private String bookAuthor;  // 저자
    private int bookPrice;  // 가격
    private String bookPublisher;   // 출판사

    public Long getId() {
        return id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }
    public BookDTO() {

    }
    private static Long idValue = 1L;

    public BookDTO(String bookTitle, String bookAuthor, int bookPrice, String bookPublisher) {
        this.id = idValue++;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookPublisher = bookPublisher;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookPublisher='" + bookPublisher + '\'' +
                '}';
    }
}
