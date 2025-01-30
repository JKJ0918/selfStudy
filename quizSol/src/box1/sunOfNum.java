package box1;

import java.util.Scanner;

// 11720

public class sunOfNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		int sum = 0;
		
		String[] strArr = sc.next().split(""); //storing numbers as characters using the split().
		
		for(int i=0; i < array.length; i++) {
			array[i] = Integer.parseInt(strArr[i]);
			
			sum += array[i];
			
		}//end for
		System.out.println(sum);


	}

}
