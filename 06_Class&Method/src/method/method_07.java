package method;

//메서드 호출 시 반환형 

public class method_07 {

	// 값이 반환이 된 경우
	public static int method1() { // 실인수를 받을 가인수(매개변수)가 없음!

		return 155; // void가 아닌경우는 무조건 return값이 필요함

	}

	// 변수명이 반환 되는 경우
	public static int method2(int su1, int su2) {

		int sum = (su1 * 2) + (su2 * 2);

		return sum;

	}

	// 수식이 반환되는 경우
	public static int method3(int su1, int su2) {

		return su1 * su2;

	}

	public static void main(String[] args) {

		int su = method1(); // 155라는 숫자를 반환받음.

		System.out.println("method1() 메서드 호출 후 반환된 값 >>> " + su);

		// System.out.println("method1() 메서드 호출 후 반환된 값 >>> " + method1()); 이렇게도 작성이 가능함
		// 따로 넘길필요없으면 이렇게 보통 작성하지만 넘겨줘야되면은 따로 변수를 받아서 저장함.

		System.out.println("method2() 메서드 호출 후 반환된 값 >>> " + method2(200, 145));
		System.out.println("method2() 메서드 호출 후 반환된 값 >>> " + method3(200, 145));
	}

}
