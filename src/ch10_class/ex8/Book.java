package ch10_class.ex8;

public class Book {
    private String bookTitle;
    private String bookAuthor;

    // bookTitle setter
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    // bookTitle getter
    public String getBookTitle() {
        return bookTitle;   // this 굳이 필요 없음
    }

    // bookAuthor setter
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    // bookAuthor getter
    public String getBookAuthor() {
        return bookAuthor;
    }
}
