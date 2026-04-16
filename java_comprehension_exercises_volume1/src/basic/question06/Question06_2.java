package basic.question06;

import java.io.IOException;

public class Question06_2 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		String[] studentName = new String[5];
		studentName[0] = "かなこ";
		studentName[1] = "ゆうた";
		studentName[2] = "あい";
		studentName[3] = "はるひ";
		studentName[4] = "かずき";
		for (String i : studentName) {
			System.out.println(i);
		}
	}
}
