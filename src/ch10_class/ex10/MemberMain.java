package ch10_class.ex10;

public class MemberMain {
    public static void main(String[] args) {
        /**
         * 메뉴
         * 1. 회원가입(기본생성자이용)
         *      회원가입 정보는 스캐너로 받음.
         * 2. 로그인
         * 3. 종료
         */
        Member member1 = new Member();
        member1.setMemberEmail("jollyeoyo1234@naver.com");
        member1.setMemberPassword("kim1234");
        member1.setMemberName("김자바");
        member1.setMemberMobile("010-7777-7777");

    }
}
