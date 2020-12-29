package chapter6.cooperation;

public class Student {

    public String studentName;
    public int grade;
    public int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    // 학생이 버스를 타면 1000원 지불하는 기능을 구현한 메서드
    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1500);
        this.money -= 1500;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(10000);
        this.money -= 10000;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
    }
}
