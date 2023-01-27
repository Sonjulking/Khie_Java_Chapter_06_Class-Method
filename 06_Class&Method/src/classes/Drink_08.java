package classes;

import java.util.Scanner;

public class Drink_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("자판기 음료 갯수를 입력하세요. : "); // 배열의 크기

		// 객체 배열을 만들어보자. //객체배열 시험에 나올수도 ★★★★★★★

		Drink[] drinks = new Drink[sc.nextInt()];

		// Drink[] drinks = new Drink[6]; // Drink 객체를 6개 생성

		for (int i = 0; i < drinks.length; i++) {

			System.out.println("음료의 이름과 가격을 입력하세요.");

			System.out.println("::::::::::::::::::::::::::::");
			drinks[i] = new Drink(sc.next(), sc.nextInt());

		}

//		Drink drink1 = new Drink("콜라", 2000); // 참조변수는 주소값
//		Drink drink2 = new Drink("사이다", 2000);
//		Drink drink3 = new Drink("환타", 2000);
//		Drink drink4 = new Drink("캔커피", 1000);
//		Drink drink5 = new Drink("탄산수", 1500);
//		Drink drink6 = new Drink("레모네이드", 1700);

//		System.out.println("drink1 >>> " + drink1);
//		System.out.println("drink2 >>> " + drink2);
//		System.out.println("drink3 >>> " + drink3);
//		System.out.println("drink4 >>> " + drink4);
//		System.out.println("drink5 >>> " + drink5);
//		System.out.println("drink6 >>> " + drink6);

		System.out.println("drinks[0] >>> " + drinks[0]);
		System.out.println("drinks[1] >>> " + drinks[1]);
		System.out.println("drinks[2] >>> " + drinks[2]);
		System.out.println("drinks[3] >>> " + drinks[3]);
		System.out.println("drinks[4] >>> " + drinks[4]);
		System.out.println("drinks[5] >>> " + drinks[5]);

//		drinks[0] = drink1;
//		drinks[1] = drink2;
//		drinks[2] = drink3;
//		drinks[3] = drink4;
//		drinks[4] = drink5;
//		drinks[5] = drink6;

		System.out.println();

//		System.out.println("drinks[0] >>> " + drinks[0]);
//		System.out.println("drinks[1] >>> " + drinks[1]);
//		System.out.println("drinks[2] >>> " + drinks[2]);
//		System.out.println("drinks[3] >>> " + drinks[3]);
//		System.out.println("drinks[4] >>> " + drinks[4]);
//		System.out.println("drinks[5] >>> " + drinks[5]);

		// 일반적인 배열은 실체 데이터값이 들어가있는데 객체배열은 주소값이 들어가져있음.
		// 객체배열에는 참조변수의 주소값이 들어가져있음.

		System.out.print("돈을 입력해 주세요. : ");

		int coin = sc.nextInt();

		/*
		 * 입력을 받은 coin(돈)과 객체배열에 저장된 Drink 클래스의 멤버변수인 price(음료 가격)를 비교해서 가격이 작거나 같은 음료를
		 * 선택 해주세용
		 */

		for (int i = 0; i < drinks.length; i++) {

			if (coin >= drinks[i].price) {// (참조변수.객체) 처럼 접근하는거랑 같음.

				System.out.print(drinks[i].name + "\t");
			}

		}

		sc.close();

	}

}
