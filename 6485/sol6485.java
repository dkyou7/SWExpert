package swexpert;

import java.util.Scanner;

public class sol6485 {
	
	static int [] result;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			int num = sc.nextInt();
			range [] arr = new range[num];
			for (int j = 0; j < num; j++) {
				int min = sc.nextInt();
				int max = sc.nextInt();
				arr[j] = new range(min,max);
			}
			int loc = sc.nextInt();
			result = new int [loc];
			for (int j = 0; j < loc; j++) {
				int number = sc.nextInt();
				int tmp = 0;
				for (int k = 0; k < num; k++) {
					if(number>=arr[k].min && number<=arr[k].max) {
						tmp++;
					}					
				}
				result[j] = tmp;
			}
			System.out.printf("#%d ",i+1);
			for (int j = 0; j < result.length; j++) {
				System.out.printf("%d ",result[j]);				
			}
			System.out.println();
		}
	}

}
class range{
	int min;
	int max;
	public range(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
}
