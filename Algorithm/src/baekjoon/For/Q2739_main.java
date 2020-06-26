package baekjoon.For;

import java.util.Scanner;

public class Q2739_main {
	// for문_구구단
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(N + " * " + i + " = " + N*i);
		}
		sc.close();
	}

}
