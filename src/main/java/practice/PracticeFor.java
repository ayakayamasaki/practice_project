package practice;

public class PracticeFor {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum += i;
		}

		System.out.println("合計" + sum);
	}

}
