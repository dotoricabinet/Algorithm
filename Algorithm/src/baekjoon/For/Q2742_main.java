package baekjoon.For;

import java.util.Scanner;

public class Q2742_main {
	public static void main(String[] args) {
		// for문_기찍 N
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=N; i>0; i--) {
			System.out.println(i);
		}
		sc.close();
	}
}
