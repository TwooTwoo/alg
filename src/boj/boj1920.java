package boj;

import java.util.Scanner;

public class boj1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numsN = new int[n];
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] numsM = new int[m];
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
        }

        // M 돌면서
        for (int i = 0; i < m; i++) { {
                boolean found = false;
                // numsM의 각 원소를 numsN의 각 원소와 비교
                for (int j = 0; j < n; j++) {
                    // numsM의 원소가 numsN에 존재하면 found=ture 후 break;
                    if (numsM[i] == numsN[j]) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
        }

        }
    }
}
