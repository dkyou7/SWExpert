package swexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sol1256 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); 
		for (int i = 0; i < input; i++) {
			int num = sc.nextInt(); sc.nextLine();
			String ss = sc.nextLine();
			String [] arr = new String[ss.length()];
			for (int j = 0; j < ss.length(); j++) {
				String tmp = ss.substring(j, ss.length());
				arr[j]= tmp;
			}
			Arrays.sort(arr,new sortingString());
			if(num>ss.length()) {
				System.out.printf("#%d %s",i+1,"none");
				continue;
			}
			System.out.printf("#%d %s\n",i+1,arr[num-1]);
		}
	}
}
class sortingString implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
	
}
