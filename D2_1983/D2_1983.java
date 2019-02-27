package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

import swexpert.sol1247.sc;

public class sol1983 {
	static int N,K;
	static stu[] stus;
	static String [] arr = {"A+","A0","A-",
							"B+","B0","B-",
							"C+","C0","C-",
							"D0"};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int i = 1; i <= tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			stus = new stu[N];
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				int mid = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				int hw = Integer.parseInt(st.nextToken());
				stus[j] = new stu(j+1,mid,end,hw);
			}
			Arrays.sort(stus, new Comp());
			for (int j = 0; j < 10; j++) {
				for (int j2 = j*(stus.length/10); j2 < j*(stus.length/10)+stus.length/10; j2++) {
					stus[j2].make(arr[j]);
				}
			}
			for (int j = 0; j < stus.length; j++) {
				if(stus[j].getId()==K) {
					System.out.printf("#%d %s\n",i,stus[j].scoreChar);
					break;
				}
			}
		}
	}
}
class stu{
	int id;
	int mid;
	int end;
	int hw;
	double score;
	String scoreChar;
	public stu(int id,int mid, int end, int hw) {
		super();
		this.id = id;
		this.mid = mid;
		this.end = end;
		this.hw = hw;
		this.score = mid*0.35 + end*0.45 + hw*0.2;
	}
	public int getId() {
		return this.id;
	}
	public void make(String num) {
		this.scoreChar = num;
	}
}
class Comp implements Comparator<stu> {

	@Override
	public int compare(stu o1, stu o2) {
		if(o1.score<o2.score) {
			return 1;
		}else if(o1.score>o2.score) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
