package ch11_classes.ex03_member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private static List<MemberDTO> memberDTOList = new ArrayList<>();

    private boolean sare(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }
}
