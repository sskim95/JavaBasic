package chapter4;

public class ContinueExample {
    public static void main(String[] args) {
        int total = 0;
        // 홀수값만 더하기
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) // i가 짝수일 경우
                continue;   // 이후를 생략하고 i++ 수행
            total += i; // i값이 홀수일 때만 수
        }
        System.out.println(total);
        /*
        continue: 특정조건에서는 수행하지 않고 건너뛰어야할 때 사용
         */
    }
}
