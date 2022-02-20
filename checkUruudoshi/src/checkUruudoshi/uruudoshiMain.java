package checkUruudoshi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class uruudoshiMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
		int year = Integer.parseInt(sdf.format(now));

		System.out.println("now year is " + year);

		while (year >= 0) {
			if (year % 400 == 0) {
				System.out.println(year + " nen is uruudoshi!");
			} else if (year % 100 == 0) {
				System.out.println(year + " nen is not uruudoshi!");
			} else if (year % 4 == 0) {
				System.out.println(year + " nen is uruudoshi!");
			} else {
				System.out.println(year + " nen is not uruudoshi!");
			}
			year -= 1;
		}
	}
}
