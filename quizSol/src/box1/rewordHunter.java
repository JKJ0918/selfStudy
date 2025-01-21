package box1;

import java.util.Scanner;

public class rewordHunter {

	// 백준 15953번 문제 풀이
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        // 2017년 상금 테이블
        int[] reward2017 = {500, 300, 200, 50, 30, 10};
        int[] rank2017 = {1, 2, 3, 4, 5, 6};

        // 2018년 상금 테이블
        int[] reward2018 = {512, 256, 128, 64, 32};
        int[] rank2018 = {1, 2, 4, 8, 16};

        // 테스트 케이스 개수 입력
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int rank2017Input = sc.nextInt();
            int rank2018Input = sc.nextInt();

            // 2017년 상금 계산
            int prize2017 = getPrize(rank2017Input, reward2017, rank2017);

            // 2018년 상금 계산
            int prize2018 = getPrize(rank2018Input, reward2018, rank2018);

            // 총 상금 계산 및 출력
            System.out.println((prize2017 + prize2018) * 10000);
        }

        sc.close();
    }

    // 상금 계산 함수
    private static int getPrize(int rank, int[] rewards, int[] ranks) {
        if (rank == 0) return 0; // 진출을 못할 경우
        int cumulativeRank = 0;
        for (int i = 0; i < ranks.length; i++) {
            cumulativeRank += ranks[i];
            if (rank <= cumulativeRank) {
                return rewards[i];
            }
        }
        return 0;

	}

}
