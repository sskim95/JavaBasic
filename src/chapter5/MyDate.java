package chapter5;

public class MyDate {
    private int day;
    private int month;
    private int year;

    // private 변수들 같은 경우 public method을 통해 데이터 읽고 쓰기
    public void setDay(int day) {
        if (month == 2) {
            if (day < 1 || day > 28) {
                System.out.println("error");
            } else {
                this.day = day;
                System.out.println(day);
            }
        }
    }
}
