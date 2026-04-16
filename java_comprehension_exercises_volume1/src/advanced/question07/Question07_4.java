package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の購入数：>");
			amounts[i] = Integer.parseInt(reader.readLine());
		}
		int price = 0;
		int totalPrice = 0;

		for (int i = 0; i < 5; i++) {
			price = amounts[i] * prices[i];
			System.out.println(itemNames[i] + "：" + price + "円");
			totalPrice += price;
		}
		System.out.println("\n割引前合計：" + totalPrice + "円");
		if (totalPrice >= 5000) {
			totalPrice = (int) (totalPrice * 0.9);
			System.out.println("割引適用（10%OFF）：" + totalPrice + "円");
		} else {
			System.out.println("割引はありません。");
		}
		System.out.println("税込合計：" + (int) (totalPrice * 1.1) + "円");
	}

}
