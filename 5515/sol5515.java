package swexpert;

import java.util.Scanner;

public class sol5515 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i=1;i<=input;i++) {
			int month = sc.nextInt();
			int day = sc.nextInt();
			int r = 0;
			switch(month) {
			case 1:
				r = (day+3)%7;
				break;
			case 2:
				r = (day-1)%7;
				break;
			case 3:
				r = day%7; 
				break;
			case 4:
				r = (day+3)%7;
				break;
			case 5:
				r = (day+5)%7;
				break;
			case 6:
				r = (day+1)%7;
				break;
			case 7:
				r = (day+3)%7;
				break;
			case 8:
				r = (day-1)%7;
				break;
			case 9:
				r = (day+2)%7;
				break;
			case 10:
				r = (day+4)%7;
				break;
			case 11:
				r = day%7;
				break;
			case 12:
				r = (day+2)%7;
				break;
			}
			System.out.printf("#%d %d\n",i,r);
		}
	}
	
	
	
}
