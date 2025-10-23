package _16_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("이동윤", 27, "dongyoon7212@naver.com", "사하구");
        student.setName("배찬익");
        student.showInfo();
        System.out.println(student.getName());
    }
}
