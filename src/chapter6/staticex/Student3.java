package chapter6.staticex;

public class Student3 {

    private static int serialNum = 1000;
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student3() {
        serialNum++;           // 학생이 생성될 때마다 증가
        studentID = serialNum; // 증가된 값을 학번 인스턴스 변수에 부여
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static int getSerialNum() {
        int i = 10;
        // studentName = "이지원"; // 오류 발생
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student3.serialNum = serialNum;
    }
}
