package box1;

import java.util.Scanner;

// 9046

public class decryption {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 수 입력
        int testCases = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        for (int t = 0; t < testCases; t++) {
            String input = sc.nextLine();

            // 알파벳 빈도수를 저장할 배열 (a-z: 26개)
            int[] frequency = new int[26];

            // 입력 문자열을 순회하며 알파벳 빈도수 증가
            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) { // 알파벳만 고려
                    frequency[c - 'a']++; // 해당 index의 값을 증가 시킴
                }
            }

            // 가장 많이 등장한 문자 찾기
            int maxFrequency = 0;
            char maxChar = '?';
            boolean isDuplicate = false;

            for (int i = 0; i < 26; i++) {
                if (frequency[i] > maxFrequency) {
                    maxFrequency = frequency[i];
                    maxChar = (char) (i + 'a');
                    isDuplicate = false;
                } else if (frequency[i] == maxFrequency && frequency[i] > 0) {
                    isDuplicate = true;
                }
            }

            // 결과 출력
            if (isDuplicate) { // isDuplicate True
                System.out.println("?");
            } else { // isDuplicate False
                System.out.println(maxChar);
            }
        }

        sc.close();
		

	}

}
