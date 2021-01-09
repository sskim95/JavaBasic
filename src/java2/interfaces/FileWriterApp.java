package java2.interfaces;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterApp {
    public static void main(String[] args) throws IOException {
        Writer fileWriter = new FileWriter("filewriter.txt");

        fileWriter.write("data 1");
        fileWriter.write("data 2");
        fileWriter.write("data 3");
        // file을 다 사용한 후 놓아줘야됨
        fileWriter.close();
    }
}
