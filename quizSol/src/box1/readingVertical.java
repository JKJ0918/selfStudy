package box1;

import java.util.Scanner;

// 10798

public class readingVertical {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] strArr = new String[5];
		
		String str = ""; // 문자열 초기화
		
		char c = ' '; // 문자 초기화
		// 글자수를 세는 것 필요
		// 입력 받음
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = sc.next();
		}

		for (int j = 0; j < strArr.length; j++) {
			for (int k = 0; k < strArr.length; k++) {
				c = strArr[k].charAt(j);
			}
		}
		// 문자들을 합치는 것 필요
		// 공백을 제거하는 과정 필요

		System.out.println(c);

	}

}
