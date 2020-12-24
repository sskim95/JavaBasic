package chapter3;

public class OperationEx4 {
    public static void main(String[] args) {
        /*
        조건식 ? 결과1 : 결과2 -> 조건식이 참 -> 결과1 / 거짓 -> 결과2
         */
        int fatherAge = 45;
        int motherAge = 47;

        char ch;
        ch = (fatherAge > motherAge) ? 'T' : 'F';
        System.out.println(ch);
    }
}
