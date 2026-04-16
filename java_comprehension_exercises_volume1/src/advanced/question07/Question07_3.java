package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		int[] stocks = new int[5];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の在庫数：>");
			stocks[i] = Integer.parseInt(reader.readLine());
		}

		for (int i = 0; i < 5; i++) {
			int amount = 0;
			Boolean isValid = false;

			while (!isValid) {
				System.out.print(itemNames[i] + "の購入数：>");
				amount = Integer.parseInt(reader.readLine());
				if (amount > stocks[i]) {
					System.out.println("在庫数を超えています。もう一度入力してください。");
				} else {
					amounts[i] = amount;
					isValid = true;
				}
			}
		}
		int price = 0;
		int totalPrice = 0;

		for (int i = 0; i < 5; i++) {
			price = amounts[i] * prices[i];
			System.out.println(itemNames[i] + "：購入" + amounts[i] + "個");
			System.out.println("在庫" + stocks[i] + "個");
			totalPrice += price;
		}
		System.out.println("合計金額：" + totalPrice + "円");

	}
}
