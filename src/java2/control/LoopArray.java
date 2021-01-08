package java2.control;

public class LoopArray {

    public static void main(String[] args) {

        /*
         *  <li>sungsoo</li>
         *  <li>hyokjun</li>
         *  <li>gilmo</li>
         */

        String[] users = new String[3];
        users[0] = "sungsoo";
        users[1] = "hyokjun";
        users[2] = "gilmo";

        // length 사용으로 유동적으로 반복문을 처리함
        for (int i=0; i< users.length; i++) {
            System.out.println("<li>" + users[i] + "</li>");
        }
    }
}
