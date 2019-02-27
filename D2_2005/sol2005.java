package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sol2005 {
	static int [][] map;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		for (int i = 1; i <= tc; i++) {
			int size = Integer.parseInt(br.readLine());
			map = new int[size][size];
			for (int j = 0; j < map.length; j++) {
				for (int j2 = 0; j2 < j+1; j2++) {
					map[j][j2]=1;
				}
			}
			for (int j = 2; j < map.length; j++) {
				for (int j2 = 1; j2 < j+1; j2++) {
					map[j][j2] = map[j-1][j2-1]+map[j-1][j2];
				}
			}
			System.out.printf("#%d",i);
			print(map);
		}
	}
	public static void print(int [][]map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}
