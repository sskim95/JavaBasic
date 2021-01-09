package java2.inheritance;

class Cal00 {
    int v1, v2;
    Cal00(int v1, int v2) {
        System.out.println("Cal init!!");
        this.v1 = v1; this.v2 = v2;
    }
    public int sum() {
        return this.v1+v2;
    }
}

class Cal33 extends Cal00 {

    Cal33(int v1, int v2) {
        super(v1, v2);
        System.out.println("Cal 3 init!!");
    }
    public int minus() {
        return this.v1-v2;
    }
}

public class InheritanceApp2 {

    public static void main(String[] args) {
        Cal00 c = new Cal00(2,1);
        Cal33 c3 = new Cal33(2,1);
        System.out.println(c3.sum()); // 3
        System.out.println(c3.minus()); // 1
    }
}

/*
다형성(polymorphism)은 상속 관계에 있는 클래스간의 호환성을 높여주는 기능입니다.

우리가 인스턴스를 생성할 때, 같은 클래스의 자료형을 가진 변수를 선언하여

인스턴스를 생성해 왔습니다.

그런데 부모 클래스의 자료형을 가진 변수를 선언하여 자식 클래스의 인스턴스를 생성할 수 있습니다.

그렇게 생성한 변수에서 자식 클래스의 변수나 메소드를 호출할 수 있습니다.



접근 제어자(access modifier)는 우리가 public과 private에 대해서 이미 알아본 바가 있습니다.

접근 제어자에는 이 외에도 default, protected라는 두 개의 접근 제어자가 더 있습니다.

default의 경우 같은 패키지 내의 클래스에서는 접근할 수 있는 권한이 있고,

protected의 경우 해당 클래스와 자식 클래스를 통해서 접근할 수 있습니다.



final 키워드는 상속과 관련하여 제한을 걸어주는 키워드 입니다.

만약 현재 클래스에서 더 이상 자식 클래스를 생성하지 못하게 막기 위해서는

클래스에 final 키워드를 삽입합니다.

그리고, 메소드가 자식 클래스에서 더 이상 오버라이드 되기를 원하지 않는다면

메소드에 final 키워드를 삽입합니다.



abstract 키워드는 해당 클래스, 메소드가 재정의가 필요하다는 것을 강제하는 키워드 입니다.

abstract 메소드는 선언만 되어 있는 상태이고, abstract 클래스는 인스턴스로 만들 수 없습니다.

만약 클래스 안에 abstract 메소드가 있다면 그 클래스는 abstract 클래스여야 합니다.
 */