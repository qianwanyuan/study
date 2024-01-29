package xxx;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入月份");
		int month = sc.nextInt();
		System.out.println("頭等艙還是經濟艙");
		int fly = sc.nextInt();
		System.out.println("價格");
		double price = sc.nextInt();
		if (month >= 5 && month <= 10) {
			if (fly == 1) {
				price = price * 0.9;
			} else {
				price = price * 0.85;
			}

		} else {
			if (fly == 2) {
				price = price * 0.7;
			} else {
				price = price * 0.65;
			}
		}
		System.out.println(price);

	}
}
