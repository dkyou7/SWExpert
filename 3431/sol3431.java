package com.submit;

import java.util.Scanner;

public class sol3431 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		for (int i = 0; i < n; i++) {
			String ss = sc.nextLine();
			String [] sp = ss.split(" ");
			int test = Integer.parseInt(sp[2]);
			int low = Integer.parseInt(sp[0]);
			int high = Integer.parseInt(sp[1]);
			int result = 0;
			if(low<=test && test<=high) {
				result = 0;
			}else if(low>test) {
				result = low-test;
			}else if(test>high) {
				result = -1;
			}
			System.out.printf("#%d %d\n",i+1,result);
		}
	}

}
