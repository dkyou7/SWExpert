package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sol5789 {
	static int T,N,Q;
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		T = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			Q = Integer.parseInt(st.nextToken());
			int [] arr = new int [N];
			for (int j = 0; j < Q; j++) {
				st = new StringTokenizer(br.readLine());
				int I = j+1;
				int L = Integer.parseInt(st.nextToken());
				int R = Integer.parseInt(st.nextToken());
				for (int k = L-1; k <= R-1; k++) {
					arr[k] = I;
				}
			}
			StringBuffer buf = new StringBuffer("#");
			buf.append(i);
			for (int j = 0; j < arr.length; j++) {
				buf.append(" "+ arr[j]);
			}
			System.out.println(buf.toString());
		}
	}
}