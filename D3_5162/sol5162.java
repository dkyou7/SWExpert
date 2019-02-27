package swexpert;

import java.util.Scanner;

public class sol5162 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); sc.nextLine();
		for (int i = 1; i <= T; i++) {
			String ss = sc.nextLine();
			int cnt = 0;
			String [] sp = ss.split(" ");
			int n1 = Integer.parseInt(sp[0]);
			int n2 = Integer.parseInt(sp[1]);
			int money = Integer.parseInt(sp[2]);
			if(n1<n2) {
				while(n1<=money) {
					cnt++;
					money-=n1;
				}
			}else {
				while(n2<=money) {
					cnt++;
					money-=n2;
				}
			}
			System.out.println("#"+i+" "+ cnt);
		}
	}
	
}
