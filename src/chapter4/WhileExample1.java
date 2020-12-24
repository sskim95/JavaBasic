package chapter4;

public class WhileExample1 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10) { // num이 10보다 작거나 같을 동안
            sum += num; // sum에 num 더하기
            num++; // num에 1 더하기
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
