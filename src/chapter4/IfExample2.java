package chapter4;

public class IfExample2 {
    public static void main(String[] args) {
        int age = 50;
        int charge;

        if (age < 8) {
            charge = 1000;
            System.out.println("취학 전 아동입니다.");
        } else if (age < 14) {
            charge = 2000;
            System.out.println("초등학생입니다.");
        } else if (age < 20) {
            charge = 2500;
            System.out.println("중, 고등학생입니다.");
        } else if (age >= 60) {
            charge = 0;
            System.out.println("경로우대입니다.");
        }
        else {
            charge = 3000;
            System.out.println("일반인입니다.");
        }
        System.out.println("입장료는 " + charge + "원입니다.");

        /*
        if - else if - else
        하나의 조건을 만족하면 나머지 조건을 비교하지 않음

        if - if - if
        if문 각 조건을 비교
         */

        int score = 100;
        char grade;
//        if (score >= 90) {
//            grade = 'A';
//        } else {
//            grade = 'F';
//        }
        // 조건 연산자 사용
        grade = (score >= 90) ? 'A' : 'F';
        System.out.println(grade);
     }
}
