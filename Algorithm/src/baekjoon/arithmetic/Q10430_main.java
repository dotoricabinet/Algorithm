package baekjoon.arithmetic;

import java.util.Scanner;

public class Q10430_main {
	public static void main(String[] args) {
		// 입출력과 사칙연산_나머지
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		// 출력1
		System.out.println((A+B)%C);
		// 출력2
		System.out.println(((A%C)+(B%C))%C);
		// 출력3
		System.out.println((A*B)%C);
		// 출력4
		System.out.println(((A%C)*(B%C))%C);
	}
}
