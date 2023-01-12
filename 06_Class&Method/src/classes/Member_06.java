package classes;

import java.util.Scanner;

public class Member_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("회원의 아이디, 이름, 나이, 연락처, 직업을 입력해주세요.");

		Member mem = new Member(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
				sc.nextLine(), sc.nextLine());

		mem.showMemberInfo();
		sc.close();

	}

}
