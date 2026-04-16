package basic.question05;

import java.io.IOException;

/**
 * 第8章 条件分岐
 */

public class Question05_2 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		int[] numberGroup = new int[4];
		numberGroup[0] = 3;
		numberGroup[1] = 5;
		numberGroup[2] = 7;
		numberGroup[3] = 9;
		if (numberGroup[3] == 3) {
			System.out.println("4番目の要素の値は3です。");
		} else if (numberGroup[3] == 5) {
			System.out.println("4番目の要素の値は5です。");
		} else if (numberGroup[3] == 7) {
			System.out.println("4番目の要素の値は7です。");
		} else {
			System.out.println("4番目の要素の値は3,5,7以外の値です。");
		}
	}
}
