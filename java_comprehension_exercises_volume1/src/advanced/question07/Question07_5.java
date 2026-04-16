package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_5 {

	public static void main(String[] args) throws IOException {

		// 登録商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 50, 250, 100 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		float tax = 1.1f;
		float discount = 0.9f;

		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の購入数：>");
			amounts[i] = Integer.parseInt(reader.readLine());
		}

		int total = 0;
		int priceWithTax = 0;
		int subtotal = 0;
		System.out.println("\n購入内容一覧");
		for (int i = 0; i < 5; i++) {
			priceWithTax = (int) (prices[i] * tax);
			subtotal = (int) (priceWithTax * amounts[i]);
			System.out.println(itemNames[i] + "：単価" + prices[i] + "円（税込" + priceWithTax + "円）×" + amounts[i] + "個＝"
					+ subtotal + "円");
			total += subtotal;
		}

		int discountedTotal = 0;

		System.out.println("\n合計：" + total + "円");
		if (total >= 5000) {
			discountedTotal = (int) (total * discount);
		} else {
			discountedTotal = total;
		}
		System.out.println("割引後合計（税込）：" + discountedTotal + "円");

	}
}