package java2.exception;

        import java.io.FileWriter;
        import java.io.IOException;

public class CheckedExceptionApp {
    /*
    checked exception
    try-catch나 throw를 통해 예외처리를 해야 컴파일 가능

    unchecked exception
    RuntimeException 클래스에서 상속된 예외들
    try catch로 잡지 않아도 컴파일 가능
     */
    public static void main(String[] args) {
        FileWriter f = null; // null -> 값이 없다
        // try catch finally
        try {
            f = new FileWriter("data.txt");
            f.write("Hello");
            // close를 하기 전에 예외가 발생할 수 있기때문에 finally로 처리
            // f.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 만약에 f가 null이 아니라면
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
