package method;

import java.util.Scanner;

public class Method_02 {

	public static void cal() {

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		System.out.print("수를 입력하세요. : ");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {

			sum += i;

		}

		System.out.println(number + " 까지의 합 >>> " + sum);

		sc.close();

	}

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		/*
		 * [문제] 1부터 키보드로 받은 수까지의 합을 구하는 메서드를 호출해 보세요.
		 */

		cal();
		System.out.println("프로그램 종료");

	}

}
