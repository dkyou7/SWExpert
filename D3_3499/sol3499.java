package swexpert;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class sol3499 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		for (int i = 1; i <= T; i++) {
			int n = sc.nextInt(); sc.nextLine();
			String ss = sc.nextLine();
			String [] sp = ss.split(" ");
			Queue<String> even = new LinkedList<>();
			Queue<String> odd = new LinkedList<>();
			Queue<String> result = new LinkedList<>();
			for (int j = 0; j < (sp.length+1)/2; j++) {
				odd.add(sp[j]);
			}
			for (int j = (sp.length+1)/2; j < sp.length; j++) {
				even.add(sp[j]);
			}
			for (int j = 0; j < sp.length; j++) {
				if(j%2!=0) { //짝수
					result.add(even.poll());
				}else {	//홀수
					result.add(odd.poll());
				}
			}
			System.out.print("#"+i);
			while(!result.isEmpty()) {
				System.out.print(" "+result.poll());
			}
			System.out.println();
		}
	}
}
