package baekjoon.arithmetic;

import java.util.Scanner;

public class Q10430_main {
	public static void main(String[] args) {
		// ����°� ��Ģ����_������
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		// ���1
		System.out.println((A+B)%C);
		// ���2
		System.out.println(((A%C)+(B%C))%C);
		// ���3
		System.out.println((A*B)%C);
		// ���4
		System.out.println(((A%C)*(B%C))%C);
	}
}
