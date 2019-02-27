package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sol1221 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String arr[] = {"ZRO","ONE","TWO","THR","FOR",
				"FIV","SIX","SVN","EGT","NIN"};
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = 
					new StringTokenizer(br.readLine());
			String test_case = st.nextToken();
			int len = Integer.parseInt(st.nextToken());
			int [] result = new int [len];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < result.length; j++) {
				String tmpS = st.nextToken();
				for (int j2 = 0; j2 < 10; j2++) {
					if(arr[j2].equals(tmpS)) {
						result[j]=j2;
						break;
					}
				}
			}
			Arrays.sort(result);
			System.out.println(test_case+" ");
			for (int k = 0; k < result.length; k++) {
				System.out.print(arr[result[k]]+" ");				
			}
			System.out.println();
		}
	}
}
