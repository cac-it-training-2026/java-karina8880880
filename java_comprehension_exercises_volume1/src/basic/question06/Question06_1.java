package basic.question06;

import java.io.IOException;

public class Question06_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		String[] messages = new String[4];
		messages[0] = "こんにちは";
		messages[1] = "Java学習中";
		messages[2] = "繰り返しの演習";
		messages[3] = "頑張ります";
		for (int i = 0; i < 4; i++) {
			System.out.println(messages[i]);
		}
		System.out.println("繰り返し処理が終了しました。");
	}
}
