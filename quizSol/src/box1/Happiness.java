package box1;

// 15969

import java.util.Scanner;

public class Happiness {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); // 입력받을 학생 수
		int array[] = new int[a];
		
		for (int j = 0; j < array.length; j++) {
			array[j] = scan.nextInt();
		}
		
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(i == 0) {
				max = array[i];
			}else if(max < array[i]) {
				max = array[i];
			}
		}// end for
		
		for (int k = 0; k < array.length; k++) {
			if(k == 0) {
				min = array[k];
			}else if(min > array[k]) {
				min = array[k];
			}
		}// end for
		
		System.out.println(max-min);

	}

}
