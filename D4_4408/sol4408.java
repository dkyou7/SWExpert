package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class sol4408 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int i = 1; i <=T; i++) {
			int N = Integer.parseInt(br.readLine().trim());
			int [] arr = new int [201];
			for (int j = 0; j < N; j++) {
				StringTokenizer st = 
						new StringTokenizer(br.readLine().trim());
				int s = Integer.parseInt(st.nextToken());
				int e = Integer.parseInt(st.nextToken());
				int in = (s+1)/2;
				int out = (e+1)/2;
				int tmp=0;
				if(in>out) {
					tmp=in;
					in=out;
					out=tmp;
				}
				for (int k = in; k <= out; k++) {
					arr[k]++;
				}
			}
			Arrays.sort(arr);
			System.out.println("#"+i+" "+arr[arr.length-1]);

		}
	}
}