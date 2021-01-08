package java2.method;

class Print {
    public String delimiter;

    public void a() {
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }

    public void b() {
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }

    public static void c(String delimiter) {
        System.out.println(delimiter);
        System.out.println("c");
        System.out.println("c");
    }
}

public class StaticMethod {

    public static void main(String[] args) {
//        Print.a("-");
//        Print.b("-");

        // instance
        Print t1 = new Print();
        t1.delimiter = "-";
        t1.a();
        t1.b();
        // static method는 클래스의 method
        Print.c("-");

//        Print.a("*");
//        Print.b("*");

        Print t2 = new Print();
        t2.delimiter = "*";
        t2.a();
        t2.b();
    }

}

/*
static - class method
no static - instance method
 */