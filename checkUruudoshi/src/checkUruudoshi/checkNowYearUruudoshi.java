package checkUruudoshi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class checkNowYearUruudoshi {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date now = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
		int year = Integer.parseInt(sdf.format(now));

		if (year % 400 == 0) {
			System.out.println(year + "年は閏年です。");
		} else if (year % 100 == 0) {
			System.out.println(year + "年は閏年ではありません。");
		} else if (year % 4 == 0) {
			System.out.println(year + "年は閏年です。");
		} else {
			System.out.println(year + "年は閏年ではありません");
		}
	}
}
