package java2.method;

class Greeting {
    // public, protected, default, private
    public static void hi() {
        System.out.println("Hi");
    }
}

public class AccessLevelModifiersMethod {

    public static void main(String[] args) {
        Greeting.hi();
    }
}

/*
private : 같은 클래스 안에서만 사용가능
 */