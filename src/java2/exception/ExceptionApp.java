package java2.exception;

public class ExceptionApp {
    public static void main(String[] args) {
        System.out.println(1);
        int[] scores = {10, 20, 30};
        try {
            // 여기서 에러가 발생했기때문에
            System.out.println(scores[3]);
            // 이 코드는 실행이 안 됨
            System.out.println(2/0);
        } catch (Exception e) {
            System.out.println("오류 발생!" + e.getMessage());
            e.printStackTrace();
        }
//        Exception 아래의 두 Exceptions의 부모 클래스
//        catch (ArithmeticException e) {
//            System.out.println("잘못된 계산입니다.");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("없는 값을 찾고 계시네요.");
//        }
        System.out.println(3);
    }
}
