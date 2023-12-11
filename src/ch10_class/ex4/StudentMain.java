package ch10_class.ex4;

public class StudentMain {
    public static void main(String[] args) {
        // 기본생성자로 student1 객체 생성
        Student student1 = new Student();
        student1.studentName = "차은우";
        student1.studentNumber = "10041004";
        student1.studentMajor = "연기예술학";
        System.out.println("student1.studentName = " + student1.studentName);
        // 매개변수 있는 생성자로 student2 객체 생성
        Student student2 = new Student("손흥민", "77777777", "체육학");
        System.out.println("student2.studentName = " + student2.studentName);
    }
}
