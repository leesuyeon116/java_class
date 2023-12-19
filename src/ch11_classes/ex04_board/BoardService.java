package ch11_classes.ex04_board;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    Scanner scanner = new Scanner(System.in);
    public void save() {
        System.out.print("제목: ");
        String boardTitle = scanner.next();
        System.out.print("작성자: ");
        String boardWriter = scanner.next();
        System.out.print("비밀번호: ");
        String boardPass = scanner.next();
        System.out.print("내용: ");
        String boardContents = scanner.next();
        BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardPass, boardContents);
        boolean result = boardRepository.save(boardDTO);
        if (result) {
            System.out.println("글작성 완료");
        } else {
            System.out.println("글작성 실패");
        }
    }
    public void findAll() {
        List<BoardDTO> boardDTOList = boardRepository.findAll();
        System.out.println("id\t" + "title\t" + "writer\t" + "hits\t");
        for (BoardDTO boardDTO: boardDTOList) {
            System.out.println(boardDTO.getId() + "\t" + boardDTO.getBoardTitle() + "\t" +
                    boardDTO.getBoardWriter() + "\t" + boardDTO.getBoardHits() + "\t");
        }
    }
}
