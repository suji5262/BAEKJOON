package 대소문자_바꾸기;

import java.util.Scanner;

public class Ex_2744 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('A'<= ch && ch <='Z') {
                System.out.print((char)('a' + ch - 'A'));
            } else {
                System.out.print((char)('A' + ch - 'a'));
            }
        }

//        for (int i = 0; i < str.length(); i++) {
//            // 대문자니?
//
//            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
//                // int dist = str.charAt(i) - 'A';
//                //int lower_ascii = 'a' + dist;
//
//                System.out.println((char)('a' + str.charAt(i) - 'A'));
//            } else {
//                System.out.println((char)('A' + str.charAt(i) - 'A'));
//
//            }
//        }
    }
}
