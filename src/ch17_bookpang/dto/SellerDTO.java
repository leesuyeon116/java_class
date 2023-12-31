package ch17_bookpang.dto;

public class SellerDTO {
    private Long id;
    private String sellerPassword;  // 관리자 비밀번호
//    private String sellerName;  // 관리자 이름
//    private String sellerCrn;   // 사업자 등록번호
//    private String sellerMobile;    // 관리자 전화번호

    public Long getId() {
        return id;
    }

    public String getSellerPassword() {
        return sellerPassword;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSellerPassword(String sellerPassword) {
        this.sellerPassword = sellerPassword;
    }

    public SellerDTO(String sellerPassword) {
        this.sellerPassword = sellerPassword;
    }

    public SellerDTO(Long id, String sellerPassword) {
        this.id = id;
        this.sellerPassword = sellerPassword;
    }

    @Override
    public String toString() {
        return "SellerDTO{" +
                "id=" + id +
                ", sellerPassword='" + sellerPassword + '\'' +
                '}';
    }
}
