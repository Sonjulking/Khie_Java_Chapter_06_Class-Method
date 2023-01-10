package method;

import java.util.Scanner;

//간단한 계산기 예제

public class Method_04 {

	public static void plus(int a, int b) {

		System.out.println("덧셈 >>> " + (a + b));

	}

	public static void minus(int a, int b) {

		System.out.println("뺄셈 >>> " + (a - b));

	}

	public static void mul(int a, int b) {

		System.out.println("곱셈 >>> " + (a * b));

	}

	public static void divide(int a, int b) {

		System.out.println("나눗셈 >>> " + (a / b));

	}

	public static void mod(int a, int b) {

		System.out.println("나머지 >>> " + (a % b));

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1.키보드로부터 두개의 정수와 연산자를 입력을 받자.

		System.out.print("첫번째 정수 입력 : ");
		int su1 = sc.nextInt();

		System.out.print("두번째 정수 입력 : ");
		int su2 = sc.nextInt();

		System.out.print("연산자(+, -, *, /, %) 중 하나를 입력 : ");

		String op = sc.next();

		switch (op) {
		case "+":
			plus(su1, su2);
			break;
		case "-":
			minus(su1, su2);
			break;
		case "*":
			mul(su1, su2);
			break;
		case "/":
			divide(su1, su2);
			break;
		case "%":
			mod(su1, su2);
			break;
		}

		sc.close();

	}

}
