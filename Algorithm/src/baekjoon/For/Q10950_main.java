package baekjoon.For;

import java.util.Scanner;

public class Q10950_main {

	// for문_A+B - 3
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A = 0;
		int B = 0;
		int[] arr = new int[T];
		for(int i=0; i<T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			arr[i] = A+B;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
