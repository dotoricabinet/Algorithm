package baekjoon.If;

import java.util.Scanner;

public class Q2753_main {
	// if문_윤년
	public static void main(String[] args) {
		// 1 - 윤년 / 0 - 윤년X
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4==0 && year%100!=0) {
			System.out.println(1);
		}else if(year%400==0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
