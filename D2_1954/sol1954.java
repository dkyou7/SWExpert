package swexpert;

import java.util.Scanner;

public class sol1954 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int a = 0; a< tc; a++) {
			int size = sc.nextInt();
			int N =size;
			int [][] map = new int [N][N];
			int y=0;
			int x=0;
			int d=0;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[y][x] = i*N+j+1;
					if(d==0) {
						if(y+1<N && map[y+1][x]==0) {
							y++;
						}else {
							d=1;
							x++;
						}
					}else if(d==1) {
						if(x+1<N && map[y][x+1] ==0) {
							x++;
						}else {
							d=2;
							y--;
						}
					}else if(d==2) {
						if(y-1>=0 && map[y-1][x] ==0) {
							y--;
						}else {
							d=3;
							x--;
						}
					}else if(d==3) {
						if(x-1>=0 && map[y][x-1] == 0) {
							x--;
						}else {
							d=0;
							y++;
						}
					}
				}
			}
			System.out.println("#" + (a+1));
			print(map);
		}
	}
	public static void print(int [][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.printf("%d ",map[i][j]);
			}
			System.out.println();
		}
	}
}