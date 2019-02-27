package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sol1493 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		// 배열 먼저 짜주기
		//[1] 준비
        int[][] A = new int[302][302];
        int k=0; //1씩 증가되는 숫자가 저장되는 변수
               
        //[2] 처리
        for(int SPIN=0;SPIN < 2*(A.length-1)+1;SPIN++ ){  //0~8 : 9회전 : 대각선
            for(int i=0;i < A.length;i++){ //0~4 : 5회전 : 행
               
                int j=SPIN-i; //열                
                if(j>=0&&j<A.length){ //0보다 크거나 같고 5보다 작은 경우에
                    k=k+1;
                    A[i][j] = k;
                }
            }          
        }
//		System.out.println(Arrays.deepToString(A));
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = 
					new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			int x =0;
			int y =0;
			for (int y2 = 0; y2 < A.length; y2++) {
				for (int x2 = 0; x2 < A.length; x2++) {
					if(A[y2][x2]==n1) {
						y+=(y2+1);
						x+=(x2+1);
					}
					if(A[y2][x2]==n2) {
						y+=(y2+1);
						x+=(x2+1);
					}
				}
			}
			System.out.println("#"+i+" "+A[y-1][x-1]);
		}
	}
}