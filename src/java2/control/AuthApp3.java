package java2.control;

public class AuthApp3 {

    public static void main(String[] args) {

        // String[] users = {"sungsoo", "hyokjun", "gilmo"};
        String[][] users = {
                {"sungsoo", "1111"},
                {"hyokjun", "2222"},
                {"gilmo", "3333"}
        };
        String inputId = args[0];
        String inputPass = args[1];

        boolean isLogined = false;
        for (int i=0; i< users.length; i++) {
            String[] current = users[i];
            if (current[0].equals(inputId) && current[1].equals(inputPass)) {
                isLogined = true;
                // 더 이상 for문을 반복하지 않고 빠져나옴
                break;
            }
        }
        System.out.println("Hi,");
        if (isLogined) {
            System.out.println("Master!!");
        } else {
            System.out.println("Who are you?");
        }
    }
}
