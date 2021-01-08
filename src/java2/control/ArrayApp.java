package java2.control;

import java.util.Arrays;

public class ArrayApp {

    public static void main(String[] args) {
        // Array (배열)

        // sungsoo, hyokjun, gilmo
//        String users = "sungsoo, hyokjun, gilmo";
        String[] users = new String[3];
        users[0] = "sungsoo";
        users[1] = "hyokjun";
        users[2] = "gilmo";

        System.out.println(users[1]);
        System.out.println(users.length);

        int[] scores = {10, 100, 100};
        System.out.println(scores[1]);
        System.out.println(scores.length);

        /*
        Index   0       1       2
        Element sungsoo hyokjun gilmo
         */
    }
}
