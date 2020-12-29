package chapter6.staticex;

public class StudentTest1 {

    public static void main(String[] args) {
        Student1 student1Lee = new Student1();
        student1Lee.setStudentName("이지원");
        System.out.println(student1Lee.serialNum);
        student1Lee.serialNum++;

        Student1 student1Son = new Student1();
        student1Son.setStudentName("손수경");
        System.out.println(student1Son.serialNum); // 1001
        System.out.println(student1Lee.serialNum); // 1001
    }
}
