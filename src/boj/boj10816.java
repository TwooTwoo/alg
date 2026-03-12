package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class boj10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // readLine() 메서드는 엔터 포함 한 줄 전체를 String으로 읽들인다
        int n = Integer.parseInt(br.readLine()); // 상근이 카드 개수
        List<Integer> listN = new ArrayList<>(); // 상근이 숫자카드 목록 (List로 중복 허용)
        StringTokenizer stN = new StringTokenizer(br.readLine(), " "); // " " 구분자로 문자열 토큰화
        for (int i = 0; i < n; i++) {
            String tokenN = stN.nextToken();
            listN.add(Integer.parseInt(tokenN));
        }

        int m = Integer.parseInt(br.readLine()); // 몇개 있는지 셀 숫자들 의 개수
        List<Integer> listM = new ArrayList<>();
        int[] counts = new int[m]; // 숫자 등장 횟수 저장 배열

        StringTokenizer stM = new StringTokenizer(br.readLine(), " "); // 몇개 있는지 셀 숫자들 실제로 받기
        for (int i = 0; i < m; i++) {
            listM.add(Integer.parseInt(stM.nextToken()));
        }

        for (int k = 0; k < m; k++) {
            for (int j = 0; j < m; j++) {
                if (listM.get(j).equals(listN.get(k))) {
                    counts[j]++;
                }
            }
        }

        for (int count : counts) {
            System.out.print(count + " ");
        }
    }
}
