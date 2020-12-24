package chapter3;

public class OperationEx2 {
    public static void main(String[] args) {
        int gameScore = 150;

        int lastScore1 = ++gameScore; // gameScore에서 1을 더한 값을 대입
        System.out.println(lastScore1);

        int lastScore2 = --gameScore; // gameScore에서 1을 뺀 값을 대입
        System.out.println(lastScore2);
    }
}
