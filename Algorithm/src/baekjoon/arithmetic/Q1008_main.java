package baekjoon.arithmetic;

import java.util.Scanner;

public class Q1008_main {
	// 입출력과 사칙연산_A/B
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			System.out.println((double)a/b);
			/* System.out.printf("%.9f", (double)a/b); */
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
