package baekjoon.For;

import java.util.Scanner;

public class Q2741_main {
	public static void main(String[] args) {
		// for문_N 찍기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=1; i<N+1; i++) {
			System.out.println(i);
		}
	}
}
