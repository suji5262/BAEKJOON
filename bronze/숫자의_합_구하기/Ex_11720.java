package 숫자의_합_구하기;

import java.util.Scanner;

public class Ex_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 입력값을 String 형 변수 sNum 에 저장한 후 char[] 형 변수로 변환
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();

        int sum = 0;

        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0'; // cNum[i] 를 정수형으로 변환하면서 sum 에 더하여 누적
        }
        System.out.print(sum);
    }
}
