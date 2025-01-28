package box1;

import java.util.Scanner;

// 2474 피보나치의 수열 구하기

public class fibonacciSeq {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int array[] = new int[a+1];
		
		for (int i = 0; i < array.length; i++) {
			if(i == 0) {
				array[i] = 0; 
			}else if(i == 1){
				array[i] = 1;
			}else {
				array[i] = array[i-1] + array[i-2];
			}

		}// end for
		
		System.out.println(array[a]);
		
	}// end main method
	

}
