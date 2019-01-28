package com.submit;

import java.util.Arrays;
import java.util.Scanner;

public class sol4466 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); sc.nextLine();
		
		for (int i = 0; i < input; i++) {
			String ss = sc.nextLine();
			String [] sp = ss.split(" ");
			int caseNum = Integer.parseInt(sp[0]);
			int select = Integer.parseInt(sp[1]);
			int [] arr = new int [caseNum];
			String sss = sc.nextLine();
			String [] ssp = sss.split(" ");
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(ssp[j]);
			}
			Arrays.sort(arr);
			int tot = 0;
			for (int j = arr.length-1; j >arr.length-1-select; j--) {
				tot+= arr[j];
			}
			System.out.printf("#%d %d\n",i+1,tot);
		}
	}
}
