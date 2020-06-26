package baekjoon.If;

import java.util.Scanner;

public class Q2884_main {
	// if문_알람 시계
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int time = 0;
		
		if(H==0 && M<45) H=24;
		time = H*60+M-45;
		System.out.println(time/60+" "+time%60);
	}
}
