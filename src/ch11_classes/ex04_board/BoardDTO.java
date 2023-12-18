package ch11_classes.ex04_board;

public class BoardDTO {
    private Long id;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private String boardPass;

    public Long getId() {
        return id;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public String getBoardContents() {
        return boardContents;
    }

    public String getBoardPass() {
        return boardPass;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public void setBoardContents(String boardContents) {
        this.boardContents = boardContents;
    }

    public void setBoardPass(String boardPass) {
        this.boardPass = boardPass;
    }

    public BoardDTO() {

    }

}
