package java2.oop;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

    public static void main(String[] args) throws IOException {
        // class: System, Math, FileWriter
        // instance: f1, f2

        // Math class에 PI라는 변수
        System.out.println(Math.PI);
        // 소수점 값을 0으로 내림
        System.out.println(Math.floor(1.8));
        // 소수점 값을 올림
        System.out.println(Math.ceil(1.8));

        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.write(" Java");


        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("Hello");
        f2.write(" Java2");
        f2.close();

        f1.write("!!!");
        f1.close();
    }
}
