package sol1228;

import java.util.ArrayList;
import java.util.Scanner;

public class sol1228 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      for (int i = 0; i < 10; i++) {
    	  ArrayList<String> arr = new ArrayList<>();
         int input = sc.nextInt(); sc.nextLine();   //���� ��ȣ�� ���� 11
         String ss = sc.nextLine();
         String [] sp = ss.split(" ");   //��ȣ�� �� ��ü�� �迭ȭ��
         for (int j = 0; j < sp.length; j++) {
            arr.add(sp[j]);
         }
         int cmd = sc.nextInt(); sc.nextLine();
         String sss = sc.nextLine();
         String [] ssp = sss.split("I");
         for (int j = 1; j <= cmd; j++) {
            String [] sssp = ssp[j].split(" ");
            int index = Integer.parseInt(sssp[1]);	//1��° �� ������
            int count = Integer.parseInt(sssp[2]);	//5���� ���� �����Ѵ�.
            String [] tmpArr = new String[count];
            for (int k = 0; k < count; k++) {
               tmpArr[k] = (sssp[k+3]);
            }
            for (int k = 0; k < count; k++) {
               arr.add(index+k,tmpArr[k]);
            }   
//            System.out.print("\n");
         }
         System.out.printf("#%d ",i+1);
         for (int k = 0; k < 10; k++) {
            System.out.print(arr.get(k)+" ");
         }
         System.out.println();
      }
   }

}