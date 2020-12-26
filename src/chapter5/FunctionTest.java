package chapter5;

public class FunctionTest {

    // add 함수
    public static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    // minus 함수
    public static int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    // times 함수
    public static int times(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    // divide 함수
    public static double divide(int num1, int num2) {
        double result = (double) num1 / num2;
        return result;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int ansAdd = add(num1, num2); // add 함수 호출
        int ansMin = minus(num1, num2);
        int ansTime = times(num1, num2);
        double ansDiv = divide(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + ansAdd);
        System.out.println(num1 + " - " + num2 + " = " + ansMin);
        System.out.println(num1 + " * " + num2 + " = " + ansTime);
        System.out.println(num1 + " / " + num2 + " = " + ansDiv);
    }
}
