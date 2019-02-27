package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sol2817 {
	static int cnt;
	static int K;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			cnt=0;
			StringTokenizer st =
					new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			int [] arr = new int [N];
			boolean visited[] = new boolean[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			powerset(arr,visited,0);				

			System.out.printf("#%d %d\n",i,cnt);
		}
	}
	public static void powerset(int [] arr,boolean[] visited, int idx) {
		if(idx == arr.length) {
			int tmp=0;
			for (int i = 0; i < arr.length; i++) {
				if(visited[i]) {
					tmp+=arr[i];
				}
			}
			if(K==tmp) {
				cnt++;
			}
			return ;
		}
		visited[idx] = false;
		powerset(arr,visited,idx+1);
		visited[idx] = true;
		powerset(arr,visited,idx+1);
	}

}
