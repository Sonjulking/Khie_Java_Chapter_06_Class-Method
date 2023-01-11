package example1;

import java.util.Scanner;

public class Example1 {

	public static void input(String[] n, int[] h, String[] m, String[] p, Scanner sc) {

		for (int i = 0; i < n.length; i++) {
			System.out.println();
			System.out.print("이름을 입력하세요. : ");
			n[i] = sc.next();

			System.out.print("학번 : ");
			h[i] = sc.nextInt();

			System.out.print("전공 : ");
			m[i] = sc.next();

			System.out.print("폰번 : ");
			p[i] = sc.next();

		}

	}

	public static void output(String[] n, int[] h, String[] m, String[] p) {

		for (int i = 0; i < n.length; i++) {
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("이름 : " + n[i]);
			System.out.println("학번 : " + h[i]);
			System.out.println("전공 : " + m[i]);
			System.out.println("폰번 : " + p[i]);

		}

	}

	public static void findS(int fn, String[] n, int[] h, String[] m, String[] p) {

		for (int i = 0; i < n.length; i++) {
			if (h[i] == fn) {
				System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
				System.out.println("이름 : " + n[i]);
				System.out.println("학번 : " + h[i]);
				System.out.println("전공 : " + m[i]);
				System.out.println("폰번 : " + p[i]);
				break;

			}
//			else {
//				System.out.println("정보가 없습니다.");
//			}
		}

	}

	public static void alterS(int an, String[] n, int[] h, String[] m, String[] p, Scanner sc) {

		for (int i = 0; i < n.length; i++) {
			if (h[i] == an) {

				System.out.print("전공 : ");
				m[i] = sc.next();

				System.out.print("폰번 : ");
				p[i] = sc.next();

				break;
			}
//			else {
//				System.out.println("정보가 없습니다.");
//			}

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("학생 수 입력 : ");

		int numberOfStudents = sc.nextInt();

		String[] name = new String[numberOfStudents];
		int[] hakbun = new int[numberOfStudents];
		String[] major = new String[numberOfStudents];
		String[] phone = new String[numberOfStudents];

		while (true) {
			System.out.println(
					" [메뉴 구성]\n" + "• 1. 학생등록\n" + "• 2. 전체출력\n" + "• 3. 학생조회\n" + "• 4. 정보수정 \n" + "• 5. 프로그램 종료");

			System.out.println();
			System.out.print("메뉴 입력 : ");

			int selection = sc.nextInt();
			System.out.println();

			switch (selection) {
			case 1:
				input(name, hakbun, major, phone, sc);
				break;
			case 2:
				output(name, hakbun, major, phone);
				break;
			case 3:
				System.out.print("찾으실 학번을 입력하세요. : ");
				int findNum = sc.nextInt();
				findS(findNum, name, hakbun, major, phone);
				break;
			case 4:
				System.out.print("찾으실 학번을 입력하세요. : ");
				int alterNum = sc.nextInt();
				alterS(alterNum, name, hakbun, major, phone, sc);
				break;
			case 5:
				break;

			}

			System.out.println();
			System.out.print("계속 진행 할까요? (Y : 계속 / N : 종료) : ");

			String result = sc.next();

			if (result.equalsIgnoreCase("N")) {

				break;

			}
		}
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		sc.close();

	}

}
