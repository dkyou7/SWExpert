package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class sol6900 {
	static int T,N,M;
	static int result;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			result = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			String [] cases = new String [N];
			int [] money = new int [N];
			String [] tests = new String [M];
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				cases[j] = st.nextToken();
				money[j] =  Integer.parseInt(st.nextToken());
			}
			for (int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
				tests[j] = st.nextToken();
			}
			for (int j = 0; j < N; j++) {
				char [] tmpCases = cases[j].toCharArray();
				for (int k = 0; k < N; k++) {
					char [] tmpTests = tests[k].toCharArray();
					if(calc(tmpCases,tmpTests)) {
						result += money[j];
					}
				}
			}
			System.out.printf("#%d %d",i+1,result);
		}
	}
	public static boolean calc(char[] o1, char[] o2) {
		boolean isS = true;
		for (int l = 0; l < o2.length; l++) {
			if(o1[l] != '*' && o1[l] != o2[l]) {
				isS = false;
				break;
			}						
		}
		return isS;
	}
}
