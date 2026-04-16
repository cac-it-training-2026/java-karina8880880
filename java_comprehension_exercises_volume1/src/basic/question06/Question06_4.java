package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// TODO:ここに実装
		int amountBooks = 0;
		int sellFlag = 0;
		int bookPrice = 200;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("本を売却します。");
		do {
			amountBooks++;
			System.out.print("売却する本の冊数を１つ増やしますか？\nはい：0、いいえ：1 >");
			sellFlag = Integer.parseInt(reader.readLine());

		} while (sellFlag == 0);
		System.out.println("売却する本の冊数は" + amountBooks + "冊です。");
		System.out.println("売却した本の合計金額は" + (amountBooks * bookPrice) + "円です。");

	}

}
