package week02;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        // 입력받는 단을 제외하고 출력!!
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt(); // 출력을 제외할 구구단 값

        // 구구단!
        for (int i=2; i<=9; i++) { // 구구단의 첫번째 수
            if (i == passNum) {
                continue;
            }
            for (int j=2; j<=9; j++) { // 구구단의 두번째 수
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
        }
    }
}
