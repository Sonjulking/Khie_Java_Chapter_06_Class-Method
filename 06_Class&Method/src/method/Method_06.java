package method;

public class Method_06 {

	public static void change(int[] array) { // arr과 동일한 주소값 //그래서 여기서 값을 바꾸면 밑에서도 값이 바뀜.
		System.out.println("array 배열의 주소값 >>> " + array);

		for (int i = 0; i < array.length; i++) { // arr.length와 동일.

			array[i] = array[i] * 10;

		}
	}

	// 참조변수 : 객체의 주소값
	public static void main(String[] args) {

		// 2. call by reference 방식

		int[] arr = new int[3];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		System.out.println("arr 배열의 주소값 >>> " + arr); // heap메모리에 잡힌 arr의 시작 주소값

		System.out.println("change() 메소드 호출 전...");

		for (int i = 0; i < arr.length; i++) {

			System.out.println("arr[" + i + "] >>> " + arr[i]);

		}

		change(arr); // 실인수가 넘어감 //배열의 주소값을 넘겨줌

		System.out.println("change() 메소드 호출 후..."); // 기본자료형은 안변하는데 !! 이건 변했음!! 꺄악

		for (int i = 0; i < arr.length; i++) {

			System.out.println("arr[" + i + "] >>> " + arr[i]);

		}

	}

}
