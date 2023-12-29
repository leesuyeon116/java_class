package ch16_bookpang.repository;

import ch16_bookpang.dto.MemberDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {
    private static List<MemberDTO> memberDTOList = new ArrayList<>();
    private static Map<String, MemberDTO> memberDTOMap = new HashMap<>();

    public boolean save(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }

    // login 메서드
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

    public boolean update(String loginEmail, String mobile) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.get(i).setMemberMobile(mobile);
                result = true;
            }
        }
        return result;
    }

    // delete 메서드
    public boolean delete(String loginEmail) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }

    // emailCheck 메서드
    public boolean emailCheck(String memberEmail) {
        boolean result = true;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                // 중복되는 이메일이 있다 => 결과를 false로 주자
                result = false;
            }
        }
        return result;
    }
}
