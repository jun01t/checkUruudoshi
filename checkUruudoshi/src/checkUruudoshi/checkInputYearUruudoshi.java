package checkUruudoshi;

import java.util.Scanner;

public class checkInputYearUruudoshi {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		System.out.println("西暦を入力してください（数値４桁)");

		int year = sc.nextInt();

		try {
			if (checkInput(year) == false) {
				System.out.println("4桁の数値を入力してください。");
				return;
			}
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		if (year % 400 == 0) {
			System.out.println(year + "年は閏年です。");
		} else if (year % 100 == 0) {
			System.out.println(year + "年は閏年ではありません。");
		} else if (year % 4 == 0) {
			System.out.println(year + "年は閏年です。");
		} else {
			System.out.println(year + "年は閏年ではありません。");
		}
	}

	private static boolean checkInput(int input) {

		if (input > 9999) {
			return false;
		} else {
			return true;
		}
	}

}
