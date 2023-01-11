package example1;

import java.util.Scanner;

public class Example1_A {

	public static void input(String[] n, int[] h, String[] m, String[] p, Scanner sc) {

//		System.out.println("n >>> " + n);
//		System.out.println("h >>> " + h);
//		System.out.println("m >>> " + m);
//		System.out.println("p >>> " + p);

		for (int i = 0; i < h.length; i++) {

			System.out.println((i + 1) + "번째 학생 정보 입력");

			System.out.print("학생 이름 입력 : ");
			n[i] = sc.next();

			System.out.print("학생 학번 입력 : ");
			h[i] = sc.nextInt();

			System.out.println("학생 학과 입력 : ");
			m[i] = sc.next();

			System.out.println("학생 연락처 입력 : ");
			p[i] = sc.next();

		} // input() 메서드 end

	}

	// 전체 학생 정보를 출력하는 메서드
	public static void output(String[] na, int[] ha, String[] ma, String[] ph) {

		for (int i = 0; i < na.length; i++) {

			System.out.println("***" + (i + 1) + "번째 학생 정보 출력 ***");
			System.out.println("학생 이름 : " + na[i]);
			System.out.println("학생 학번 : " + ha[i]);
			System.out.println("학생 학과 : " + ma[i]);
			System.out.println("학생 연락처 : " + ph[i]);
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::");

		}

	}// output()메서드 end

	// 학생 정보를 조회하는 메서드
	public static void search(String[] n, int[] h, String[] m, String[] p, Scanner sc) {

		System.out.println("조회할 학생의 학번 입력");
		int hakbun = sc.nextInt();

		for (int i = 0; i < m.length; i++) {
			if (hakbun == h[i]) {

				System.out.println("학생 이름 : " + n[i]);
				System.out.println("학생 학번 : " + h[i]);
				System.out.println("학생 학과 : " + m[i]);
				System.out.println("학생 연락처 : " + p[i]);

			}

		}

	}// search() 메서드 end

	// 학생의 정보를 수정하는 메서드
	public static void modify(int[] h, String[] m, String[] p, Scanner sc) {

		System.out.println("수정할 학생의 학번 입력 : ");

		int hakbun = sc.nextInt();

		for (int i = 0; i < m.length; i++) {
			if (hakbun == h[i]) {
				System.out.println("수정할 학생 학과 입력 : ");
				m[i] = sc.next();

				System.out.println("수정할 학생 연락처 입력 : ");
				p[i] = sc.next();
			}

		}

	}// modify() 메서드 end

	public static void end(Scanner sc) {

		System.out.println("프로그램을 종료 하시겠습니까?(Y : 종료 / N : 계속) : ");

		String res = sc.next();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("학생 수를 입력하세요. : ");

//		int count = sc.nextInt();

		// 학생의 정보를 저장할 배열을 선언 및 배열 메모리를 생성한다.

		String[] names = new String[sc.nextInt()];
		int hakbuns[] = new int[names.length];
		String[] majors = new String[hakbuns.length];
		String[] phones = new String[majors.length];

//		System.out.println("names >>> " + names);
//		System.out.println("hakbuns >>> " + hakbuns);
//		System.out.println("majors >>> " + majors);
//		System.out.println("phones >>> " + phones);

		while (true) {

			System.out.println("*** 학생관리 프로그램 ***");
			System.out.println("1. 학생 등록");
			System.out.println("2. 전체출력");
			System.out.println("3. 학생 조회");
			System.out.println("4. 정보수정");
			System.out.println("5. 프로그램 종료");

			System.out.println();

			System.out.print("학생관리 메뉴 중 하나를 선택하세요. : ");

//			int menu = sc.nextInt();

//			for (int i = 0; i < sc.nextInt(); i++) // 이러면 포문이 돌때마다 입력받아버림

			switch (sc.nextInt()) {
			case 1: // 학생 등록 메뉴
				// 학생 등록 메서드 호출
				input(names, hakbuns, majors, phones, sc);
				break;
			case 2:// 전체 학생 정보 출력 메뉴 선택.
					// 전체 출력 메서드 호출
				output(names, hakbuns, majors, phones);
				break;
			case 3: // 학생을 조회하는 메뉴 선택
				// 학생 조회 메서드 호출
				search(names, hakbuns, majors, phones, sc);
				break;

			case 4: // 학생 정보를 수정하는 메서드 선택
				modify(hakbuns, majors, phones, sc);
				break;

			case 5: // 프로그램 종료 메뉴
				// 프로그램 종료하는 메서드 호출
				end(sc);

			}

		}

	}

}
