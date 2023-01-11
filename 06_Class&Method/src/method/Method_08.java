package method;

import java.util.Scanner;

/*
 * 성적 프로그램
 *main()메서드는 키보드로 이름, 국어, 영어, 수학 점수를 입력을 받고, 총점 메서드, 평균 메서드, 학점 메서드를 호출하여 성적을 처리후에
 *화면에 출력해보자.
 */

public class Method_08 {

	// 총점을 구하는 메서드
	public static int total(int k, int e, int m) { // 가인수

		return k + e + m;

	}

	// 평균을 구하는 메서드
	public static double average(int tot) {

		return tot / 3.0;

	}

	// 학점을 구하는 메서드

	public static String hakjum(double avg) {

		String grade;

		if (avg >= 90) {

			if (avg >= 95) {

				grade = "A+학점";

			} else {

				grade = "A학점";

			}

		} else if (avg >= 80) {

			grade = "B학점";

		} else if (avg >= 70) {

			grade = "C학점";

		} else if (avg >= 60) {

			grade = "D학점";

		} else {
			grade = "F학점";
		}

		return grade;

	}

	public static void main(String[] args) {

		// 1.메인 메서드에서는 이름, 국어점수, 영어점수, 수학점수를 키보드로 입력을 받자.

		Scanner sc = new Scanner(System.in);

		System.out.print("학생의 이름을 입력하세요. : ");
		String name = sc.next();

		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();

		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();

		System.out.print("수학 점수 입력 : ");
		int mat = sc.nextInt();

		// 2.총점을 구하자. ==> 총점 메서드 호출

		int sum = total(kor, eng, mat); // 실인수

		// 3.평균을 구하자. ==> 평균 메서드 호출

		double avg = average(sum);

		// 4.학점을 구하자. ==> 학점 메서드 호출

		String hakjum = hakjum(avg);

		// 5.성적을 화면에 출력해보자.

		System.out.println("이   름 : " + name);
		System.out.println("국어점수 : " + kor + "점");
		System.out.println("영어점수 : " + eng + "점");
		System.out.println("수학점수 : " + mat + "점");
		System.out.println("총   점 : " + sum + "점");
		System.out.printf("평   균 : %.2f\n", avg);
		System.out.println("학   점 : " + hakjum);

		sc.close();
	}

}
