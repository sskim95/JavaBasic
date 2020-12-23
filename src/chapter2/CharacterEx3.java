package chapter2;

public class CharacterEx3 {
    public static void main(String[] args) {
        int a = 65;
        int b = -66;

        char a2 = 65;
        // char b2 = -66;류 // 문자형 변수에 음수를 넣으면 오류 발생

        System.out.println((char)a);
        System.out.println((char)b); // char 형에 음수값을 대입하면 오류 발생
        System.out.println(a2);

        /*
        유니코드를 표현하는 인코딩 방법은 크게 utf-8 / utf-16 두가지
        자바는 모든 문자를 2바이트로 표현하는 utf-16 방식
        utf-8은 각 문자마다 1~4바이트 사용 -> 메모리 낭비가 적고 전송 속도가 빨라 인터넷에서 많이 사용
         */

    }
}
