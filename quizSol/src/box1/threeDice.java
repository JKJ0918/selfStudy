package box1;

import java.util.Random;

// 백준 문제 - 2480
// 결과 : 오답
// 원인 : 첫 주사위 던지는 부분 구현에서 백준에서 요구한바와 다른듯함
public class threeDice {

	public static void main(String[] args) {
		
		int b = 0 ; // 겹치는 횟수판별 
		int c = 0 ; // 겹치는 숫자 반환
		int max = 0; // 최대값
		int dice[] = new int[3]; // 배열 선언
		
		Random random = new Random();
		
		// 랜덤 이용 주사위 3번 굴려서 각각의 값을 dice[] 배열에 집어 넣음
		for(int i=0; i<3; i++) {
			
			int a = random.nextInt(6) + 1;
			dice[i] = a;
		}
		
		// 겹치는 경우 분류
		for(int i=0; i<dice.length; i++) { // 크기 비교
			
			for(int j=0; j<i; j++) { // j<i : 같은 위치값 비교 방지
				
				if(dice[i] == dice[j]) { // 두가지가 겹치는 경우
					b += 1;
					c = dice[j];
				}
			} //end for j
		}// end for i
		
		if(b == 2) { // 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금
			int prize1 = 10000+c*1000;
			System.out.println("1유형 상금 :"+ prize1);
		} else if(b == 1) { // 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금
			int prize2 = 1000+c*100;
			System.out.println("2유형 상금 : " + prize2);
		}else { // 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금
			
			for(int e=0; e<dice.length; e++) { // 최대값 선정
				
				if(dice[e] > max) {
						max = dice[e];
					}
				}
			int prize3 = max*100;
			System.out.println("3유형 상금 : " + prize3);
			
			} // end for 
			

		} // end main

} // end class

// 모범 정답
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a == b && b == c)
            System.out.print(10000 + a*1000);
        else if(a == b || a == c)
            System.out.print(1000 + a*100);
        else if(b == c)
            System.out.print(1000 + b*100);
        else
            System.out.print((Math.max(Math.max(a, b), c)*100)); // Math.max 함수를 통해 최대값을 구할 수 있음
    }
}
*/