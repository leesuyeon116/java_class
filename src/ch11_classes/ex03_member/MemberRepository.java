package ch11_classes.ex03_member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private static List<MemberDTO> memberDTOList = new ArrayList<>();

    private boolean sare(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }
    public MemberDTO login(String memberEmail, String memberPassword) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail()) && memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                memberDTO = memberDTOList.get(i);
            }
        }
        return memberDTO;
    }
    public List<MemberDTO> findAll() {
        return memberDTOList;
    }
}
