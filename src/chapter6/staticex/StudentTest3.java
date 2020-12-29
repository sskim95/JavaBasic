package chapter6.staticex;

public class StudentTest3 {

    public static void main(String[] args) {
        Student3 studentLee = new Student3();
        studentLee.setStudentName("이지원");
        System.out.println(Student3.getSerialNum()); // serialNum 변수를 직접 클래스 이름으로 참조
        System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);

        Student3 studentSon = new Student3();
        studentSon.setStudentName("손수경");
        System.out.println(Student3.getSerialNum()); // serialNum 변수를 직접 클래스 이름으로 참조
        System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID);
    }
}
