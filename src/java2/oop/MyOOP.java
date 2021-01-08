package java2.oop;
// refactor를 사용하여 쉽게 다른 클래스 파일 생성 가능
//class Print {
//    public static String delimiter = "";
//    public static void A() {
//        System.out.println(delimiter);
//        System.out.println("A");
//        System.out.println("A");
//    }
//
//    public static void B() {
//        System.out.println(delimiter);
//        System.out.println("B");
//        System.out.println("B");
//    }
//}

public class MyOOP {

    public static void main(String[] args) {

        Print p1 = new Print("----");
        p1.A();
        p1.A();
        p1.B();
        p1.B();

        Print p2 = new Print("****");
        p2.A();
        p2.A();
        p2.B();
        p2.B();

    }
}
