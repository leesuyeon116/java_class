package ch10_class.ex9;

public class Student {
    /*
    필드
    이름(StudentName)
    학번(StudentNumber)
    학과(StudentMajor)
    전화번호(StudentMobile)
     */
    private String studentName;
    private String studentNumber;
    private String studentMajor;
    private String studentMobile;

    //  각 필드의 getter/setter 메서드
    // ALT + Insert getter/setter 생성 단축키
    public String getStudentName() {
        return studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    // 기본생성자
    public Student() {

    }

    // 모든 필드를 매개변수로 하는 생성자   // ALT + Insert 생성 단축키
    public Student(String studentName, String studentNumber, String studentMajor, String studentMobile) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
        this.studentMobile = studentMobile;
    }

    // 필드에 저장된 값을 출력하는 print() 메서드
    public void print() {
        System.out.println("이름: " + studentName + " 학번: " + studentNumber + " 학과: " + studentMajor + " 전화번호: " + studentMobile);
    }

    /**
     * method name: toString
     * return type: String
     * parameter: x
     */
    @Override   //  Override Overloading 차이 -> 학습일지 참고
    public String toString() {  // ALT + Insert 생성 단축키
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }
}

