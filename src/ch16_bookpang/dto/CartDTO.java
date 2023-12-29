package ch16_bookpang.dto;

public class CartDTO {
    private Long bookId;   // 도서관리번호
    private String bookTitle;   // 도서명
    private int quantity;   // 수량
    private int totalPrice; // 총 가격

    public Long getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    public CartDTO() {

    }

    public CartDTO(Long bookId, String bookTitle, int quantity, int totalPrice) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "CartDTO{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
