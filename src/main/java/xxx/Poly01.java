package xxx;

import java.util.Scanner;

public class Poly01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int money ;
		while(true) {
			System.out.println("お金を入力してください");
			 money = sc.nextInt();
			 if(money>=0 && money<=9999999 ) {
				 break;
			 }else {
				 System.out.println("もう一回");
			 }
		}
		
		
	}
	public static String reverser(int a) {
		String[] arr ={"壹"};
		return arr[a];
		
	}
}
