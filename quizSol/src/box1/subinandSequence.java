package box1;

import java.util.Scanner;

// 백준 10539 수빈이와 수열
// 수열 B가 주어질때 수열 A를 구하시오
public class subinandSequence {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int b = scanner.nextInt(); // 수열 몇가지 할지 입력
		
		int bArr[] = new int[b];
		int aArr[] = new int[b];
		
		for(int i = 0; i<bArr.length; i++) { // 수를 입력 받음
			bArr[i] = scanner.nextInt();
		}
		
		int sum = 0;
		
		// bArr[i] = (sum+aArr[i])/i+1
		// -> aArr[i] = bArr[i]*(i+1)-sum
		for(int i =0; i<aArr.length; i++) {
			aArr[i] = bArr[i]*(i+1)-sum;
			sum += aArr[i];
		}
		for(int i=0; i<aArr.length; i++) {
			System.out.print(aArr[i] + " ");
		}
		scanner.close();
	

	}

}
