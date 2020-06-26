package baekjoon.arithmetic;

import java.util.Scanner;

public class Q2588_main {

	// 입출력과 사칙연산_곱셈
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(B%10*A);
		System.out.println((B%100-B%10)/10*A);
		System.out.println(B/100*A);
		System.out.println(A*B);
	}

}
