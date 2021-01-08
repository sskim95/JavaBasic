package java2.control;

public class IfApp {

    public static void main(String[] args) {

        System.out.println("a");
//        if (false) {
//            System.out.println(1);
//        } else {
//            if (true) {
//                System.out.println(2);
//            } else {
//                System.out.println(3);
//            }
//        }

        // else if 를 사용하여 1차원적으로 만들 수 있다
        if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }

        System.out.println("b");

    }
}