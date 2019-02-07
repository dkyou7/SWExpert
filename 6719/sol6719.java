package swexpert;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class sol6719 {
	
	static int count =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();sc.nextLine();
		for(int i=0;i<tc;i++) {
			count=0;
			int num = sc.nextInt();
			int select = sc.nextInt();
			int [] arr = new int [num];
			for (int j = 0; j < num; j++) {
				arr[j]=sc.nextInt();
			}
			Arrays.sort(arr);
			Stack<Integer> st = new Stack<>();
			for (int k = arr.length-1; k >= arr.length-select ; k--) {
				st.push(arr[k]);
			}
			double result = setScore(st,0,select);

			System.out.printf("#%d %.6f\n",i+1,result);


		}
	}
	
	public static double setScore(Stack<Integer> st,double score,int select) {
		if(count==select) {
			return score;
		}
		count++;
		int tmp =(st.pop());
		return setScore(st,(score+tmp)/2,select);
	}
}
