package swexpert;

import java.math.BigDecimal;
import java.util.Scanner;

public class sol3260 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();sc.nextLine();
		for (int i = 0; i < tc; i++) {
			String ss = sc.nextLine();
			String [] sp = ss.split(" ");
			BigDecimal num1 = new BigDecimal(sp[0]);
			BigDecimal num2 = new BigDecimal(sp[1]);
			System.out.printf("#%d %s\n",i+1,num1.add(num2));
		}
	}
}
