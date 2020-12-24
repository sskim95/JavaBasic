package chapter4;

public class BreakExample {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;

        for (num = 0; sum < 100; num++) {
            sum += num;
        }

        System.out.println("num: " + num);
        System.out.println("sum: " + sum);

        num = 0;
        sum = 0;

        for (num = 0; ; num++) {
            sum += num;
            if (sum >= 100)
                break;
        }

        System.out.println("num: " + num);
        System.out.println("sum: " + sum);
    }
}
