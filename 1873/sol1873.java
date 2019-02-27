package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sol1873 {
	static int [] dy = {-1,1,0,0};
	static int [] dx = {0,0,-1,1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = 
					new StringTokenizer(br.readLine());
			int Y,X;
			Y = Integer.parseInt(st.nextToken());	//H
			X = Integer.parseInt(st.nextToken());	//W
			String [][] map = new String[Y+2][X+2];
			int positionY=0;
			int positionX=0;
			int dir=0;
			for (int j = 0; j < map.length; j++) {
				for (int j2 = 0; j2 < map[j].length; j2++) {
					map[j][j2] = "NULL";
				}
			}
			for (int y = 0; y < Y; y++) {
				String ss = br.readLine();
				String [] sp = ss.split("");
				for (int x = 0; x < X; x++) {
					if(sp[x].equals("v") || sp[x].equals("^") || sp[x].equals("<") || sp[x].equals(">")) {
						positionY = y+1;
						positionX = x+1;
					}
					if(sp[x].equals("v")) {
						dir=1;
					}else if(sp[x].equals("^")) {
						dir=0;
					}else if(sp[x].equals("<")) {
						dir=2;
					}else if(sp[x].equals(">")) {
						dir=3;
					}
					map[y+1][x+1] = sp[x];
				}
			}
			int input = Integer.parseInt(br.readLine());
			String cmd = br.readLine();
			String [] cmdA = cmd.split("");
			for (int j = 0; j < cmdA.length; j++) {
				int nextY = 0;
				int nextX = 0;
				switch(cmdA[j]) {
				case "S":
					//방향에 포탄이 있으면 벽돌인지, 강철인지 확인 후 없애기
					int powY = positionY;
					int powX = positionX;
					while(!map[powY+dy[dir]][powX+dx[dir]].equals("NULL")) {
						powY = powY+dy[dir];
						powX = powX+dx[dir];
						if(map[powY][powX].equals("#")) {
							break;
							//평지로 만들기.
						}else if(map[powY][powX].equals("*")) {
							map[powY][powX]=".";
							break;
						}
					}
					break;
				case "U":
					dir=0;
					nextY = positionY+dy[dir];
					nextX = positionX+dx[dir];
					map[positionY][positionX] = "^";
					if(map[nextY][nextX].equals(".")) {
						String tmp = map[positionY][positionX];
						map[positionY][positionX] = map[nextY][nextX];
						map[nextY][nextX] = tmp;
						positionY = nextY;
						positionX = nextX;
					}
					break;
				case "R":
					dir=3;
					nextY = positionY+dy[dir];
					nextX = positionX+dx[dir];
					map[positionY][positionX] = ">";
					if(map[nextY][nextX].equals(".")) {
						String tmp = map[positionY][positionX];
						map[positionY][positionX] = map[nextY][nextX];
						map[nextY][nextX] = tmp;
						positionY = nextY;
						positionX = nextX;
					}
					break;
				case "D":
					dir=1;
					nextY = positionY+dy[dir];
					nextX = positionX+dx[dir];
					map[positionY][positionX] = "v";
					if(map[nextY][nextX].equals(".")) {
						String tmp = map[positionY][positionX];
						map[positionY][positionX] = map[nextY][nextX];
						map[nextY][nextX] = tmp;
						positionY = nextY;
						positionX = nextX;
					}
					break;
				case "L":
					dir=2;
					nextY = positionY+dy[dir];
					nextX = positionX+dx[dir];
					map[positionY][positionX] = "<";
					if(map[nextY][nextX].equals(".")) {
						String tmp = map[positionY][positionX];
						map[positionY][positionX] = map[nextY][nextX];
						map[nextY][nextX] = tmp;
						positionY = nextY;
						positionX = nextX;
					}
					break;
				}
//				System.out.println(j+"번째 cmd : " + cmdA[j]);
//				print(map);
			}
			System.out.print("#"+i+" ");
			print(map);
		}
	}
	public static void print(String [][] map) {
		for (int i = 1; i < map.length-1; i++) {
			for (int j = 1; j < map[i].length-1; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	public static void move(String [][] map,int y,int x,int dir) {
		String tmp = map[y][x];
		map[y][x] = map[y+dy[dir]][x+dx[dir]];
		map[y+dy[dir]][x+dx[dir]] = tmp;
	}
}
