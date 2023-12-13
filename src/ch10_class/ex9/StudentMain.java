package ch10_class.ex9;

public class StudentMain {
    public static void main(String[] args) {
        // 기본생성자로 Student 클래스 객체를 만들고 setter를 이용하여 필드값 채우기
        Student student1 = new Student();
        student1.setStudentName("차은우");
        student1.setStudentNumber("20231004");
        student1.setStudentMajor("연극영화학");
        student1.setStudentMobile("010-1234-5678");

        // 모든 필드를 매개변수로 하는 생성자로 Student 클래스 객체 만들기
        Student student2 = new Student("송강", "10041004", "경제학", "010-9876-54321");

        // 각각의 객체에서 print 메서드 호출하여 필드값 출력
        student1.print();
        student2.print();

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
    }
}
