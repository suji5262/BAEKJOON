package 수_정렬하기;

import java.util.Scanner;

public class Ex_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i =0; i<N; i++) {
            A[i] = sc.nextInt(); // 정렬되지 않은 데이터가 들어옮
        }
        // 버블 정렬 구현하는 영역
        for (int i = 0; i<N-1; i++) {
            for (int j = 0; j<N-1-i; j++) {
                if(A[j] > A[j+1]){ // 스왑하는 부분
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }
    }
}
