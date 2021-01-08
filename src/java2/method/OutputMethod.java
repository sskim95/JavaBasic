package java2.method;

public class OutputMethod {

    public static String a() {
        // ...
        return "a";
    }
                // data type
    public static int one() {
        return 1; // 여기서 method 끝
        // ...
    }
    // return 값이 없을 때, void 사용
    public static void main(String[] args) {

        System.out.println(a());
        System.out.println(one());
    }
}
