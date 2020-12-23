package chapter2;

public class TypeInference {
    public static void main(String[] args) {
        // 자료형 없이 변수 선언 -> var
        var i = 10; // int i = 10 으로 컴파일
        var j = 10.0; // double j = 10.0 으로 컴파일
        var str = "hello"; // String str = "hello" 으로 컴파일

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
        // str = 3;
        // str 변수는 이미 String형으로 먼저 사용되었기때문에 정수 값을 넣을 수 없음
    }
}
