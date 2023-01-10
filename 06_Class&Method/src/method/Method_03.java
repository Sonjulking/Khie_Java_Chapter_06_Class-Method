package method;

import java.util.Scanner;

/*
 * -매개변수가 있는 메서드 정의
 * 
 * 형식) [접근제한] 반환형 메서드이름(type 변수1, type 변수2){
 * 	메서드 호출 시 실행 문장.
 * }
 * 
 * -실인수와 가인수 
 * =>실인수 : 매개변수에 전달할 실제 값 ==> 메서드 호출 시 사용한다.
 * =>가인수 : 매개변수 (매개변수를 가인수라고 부른다.) ==> 메서드에 정의.
 * =>실인수와 가인수는 반드시 type, 순서, 갯수가 일치해야 한다.(중요함)
 */

public class Method_03 {

	public static void total(int k, int e, int m) { // 실인수를 받아줄 매개변수, 자료형이 같아도 생략 불가능
		// 호출이 끝나면 메모리에서 사라짐. (호출할때만 쓰이는 변수들)

		System.out.println("sum >>> " + (k + e + m));
	}

	public static void total(int su) {

		int sum = 0;

		for (int i = 1; i <= su; i++) {

			sum += i;

		}

		System.out.println("1부터 " + su + "까지의 합 >>> " + sum);
	}

	public static void main(String[] args) {

		total(95, 88, 92); // 실인수!

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요. : ");

		total(sc.nextInt()); // 매서드 오버로딩, 다형성
		// 메서드의 이름이 같아도 매개변수의 개수가 다르면 다른 메서드로 인식해줌 이것을 다형성, 메서드 오버로딩이라고 얘기해줌.

		sc.close();

	}

}
