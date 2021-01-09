package java2.inheritance;

// this는 자기자신 super는 부모를 가르킴
class Cal {
    public int sum(int v1, int v2) {
        return v1 + v2;
    }
    // Overloading (method 이름이 같아도 parameter 형식이 다름)
    public int sum(int v1, int v2, int v3) {
        return this.sum(v1, v2) + v3;
    }
}
// Cal class를 확장해서 Cal class가 가지고 있는 변수와 메서드 상속받아서 사용
class Cal3 extends Cal {
    public int minus(int v1, int v2) {
        return v1 - v2;
    }
    // Overriding
    // 부모 클래스 기능 덮어쓰기 (재정의)
    public int sum(int v1, int v2) {
        System.out.println("Cal3!!");
        return super.sum(v1, v2);
    }
}

public class InheritanceApp {

    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.sum(2,1));
        System.out.println(c.sum(2,1,1));

        Cal3 c3 = new Cal3();
        System.out.println(c3.minus(2,1));
        System.out.println(c3.sum(2,1));
    }
}

class Cal2 {
    public int sum(int v1, int v2) {
        return v1 + v2;
    }

    public int minus(int v1, int v2) {
        return v1 - v2;
    }
}