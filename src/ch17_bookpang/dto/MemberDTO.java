package ch17_bookpang.dto;

public class MemberDTO {
    private Long id;  // 회원 아이디
    private String memberName;  // 회원 이름
    private String memberEmail; // 회원 이메일
    private String memberPassword;  // 회원 비밀번호
    private String memberMobile;    // 회원 전화번호

    public Long getId() {
        return id;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }
    public MemberDTO() {

    }

    private static Long idValue = 1L;

    public MemberDTO(String memberName, String memberEmail, String memberPassword, String memberMobile) {
        this.id = idValue;
        this.memberName = memberName;
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.memberMobile = memberMobile;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", memberName='" + memberName + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                '}';
    }
}
