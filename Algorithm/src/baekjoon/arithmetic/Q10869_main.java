package baekjoon.arithmetic;

import java.util.Scanner;

public class Q10869_main {
	// ����°� ��Ģ����_��Ģ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			// A+B
			System.out.println(a+b);
			// A-B
			System.out.println(a-b);
			// A*B
			System.out.println(a*b);
			// A/B
			System.out.println(a/b);
			// A%B(mod)
			System.out.println(a%b);
		}catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
