package java2.interfaces;

// interface: class 형태 규정 및 약속
interface Calculable {
    // 실제 값 입력
    double PI = 3.14;
    // method에서 실제 구현이 아니라 구현하는 형태 제시
    int sum(int v1, int v2);
}

interface Printable {
    void print();
}
// 다형성 (polymorphism)
class AdvancedPrint implements Printable {
    public void print() {
        System.out.println("This is AdvancedPrint!!");
    }
}

class RealCal implements Calculable, Printable {
    public int sum(int v1, int v2) {
        return v1+v2;
    }

    public void print() {
        System.out.println("This is RealCal!!");
    }
}

public class InterfaceApp {
    public static void main(String[] args) {
        RealCal c = new RealCal();
        System.out.println(c.sum(2,1));
        c.print();
        System.out.println(c.PI);
        // p의 datatype은 AdvancedPrint class의 interface인 Printable
        Printable p = new AdvancedPrint();
        p.print();
    }
}
