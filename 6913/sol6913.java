package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sol6913 {
	static int T,N,M;
	static int Max,count,human;
	static int [] map;
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			Max = 0;
			count = 0;
			human = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			map = new int [N];
			for (int j = 0; j < N; j++) {
				int tmp = 0;
				st = new StringTokenizer(br.readLine());
				for (int j2 = 0; j2 < M; j2++) {
					tmp+= Integer.parseInt(st.nextToken());
				}
				map[j] = tmp;
			}
			for (int j = 0; j < map.length; j++) {
				if(Max< map[j]) {
					Max=map[j];
				}
			}
			for (int j = 0; j < map.length; j++) {
				if(Max==map[j]) {
					human++;
				}
			}
			for (int j = 0; j < Max; j++) {
				count++;
			}
			
			
			System.out.printf("#%d %d %d\n",i,human,count);
		}
	}
}
