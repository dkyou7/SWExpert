package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class sol4259 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = 
					new StringTokenizer(br.readLine());
			BigInteger [] bigArr = new BigInteger[n];
			for (int j = 0; j < n; j++) {
				String tmp = (st.nextToken());
				BigInteger aaa = new BigInteger(tmp.substring(0,tmp.length()-1));
				int bbb = Integer.parseInt((tmp.substring(tmp.length()-1,tmp.length())));
				bigArr[j] =	aaa.pow(bbb);
			}
			BigInteger result = new BigInteger("0");
			for (int j = 0; j < bigArr.length; j++) {
				result = result.add(bigArr[j]);
			}
			System.out.println("#"+i+" "+result);
		}
	}
}
