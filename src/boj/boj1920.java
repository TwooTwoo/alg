package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class boj1920 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // readLine() 메서드는 엔터 포함 한 줄 전체를 String으로 읽어들인다
        int n = Integer.parseInt(br.readLine());
        Set<Integer> setN = new HashSet<>();
        StringTokenizer stN = new StringTokenizer(br.readLine(), " ");
        while (stN.hasMoreTokens()) {
            String tokenN = stN.nextToken();
            setN.add(Integer.parseInt(tokenN));
        }

//        int m = sc.nextInt();
        int m = Integer.parseInt(br.readLine());
        int[] numsM = new int[m];

//        Set<Integer> setM = new HashSet<>();
        StringTokenizer stM = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < m; i++) {
            numsM[i] = Integer.parseInt(stM.nextToken());
        }
//        while (stM.hasMoreTokens()) {
//            String tokenM = stM.nextToken();
//            setM.add(Integer.parseInt(tokenM));
//        }
//        int[] numsM = setM.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();


        // M번 반복
//        for (int i = 0; i < m; i++) {
//            {
//                boolean found = false;
//
//                if (found) {
//
//                } else {
//                    System.out.println(0);
//                }
//            }
//        }

        for (int j = 0; j < m; j++) {
            if (setN.contains(numsM[j])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
