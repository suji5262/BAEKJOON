package 애너그램_만들기;

import java.util.Map;
import java.util.Scanner;

public class Ex_1919_2 {

    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        return count;
    } // 함수로 뽑아낸다

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int[] countA = getAlphabetCount(a);
        int[] countB = getAlphabetCount(b);
        // 함수를 재사용해 코드를 깔끔하게 줄일 수 있음

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(countA[i] - countB[i]);
        }
        System.out.println(ans);
    }
}
