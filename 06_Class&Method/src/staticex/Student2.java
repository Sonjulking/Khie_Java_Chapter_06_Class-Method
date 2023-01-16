package staticex;

public class Student2 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String addrres;

	public Student2() {

		serialNum++;
		studentID = serialNum;

	}

	public String getStudentName() {

		return studentName;

	}

	public void setStudentName(String name) {

		studentName = name;

	}

	public static int getSerialNum() {
		int i = 10; // 지역변수
		// studentName = "이지원";
		// 오류발생함! 객체를 생성해야 쓸수 있는 인스턴스 변수인데, 객체를 생성안해도 사용가능한
		// 스태틱 메서드에 선언되어있어서!

		// 정리하자면 클래스 메서드 내부에서 지역변수와 클래수 변수는 사용할 수 있지만 인스턴스 변수는 사용할 수 없습니다.
		// 또한 클래스 메서드에서 인스턴스변수를 사용할수는 없지만, 반대로 일반 메서드에서 클래스 변수를 사용하는 것은 전혀 문제가 되지
		// 않습니다.
		// 왜냐하면 일반메서드는 인스턴스가 생성될 때 호출 되는 메서드이고, 클래스 변수는 이미 만들어진 변수이기때문에 일반 메서드에서도
		// 클래스 변수를 호출할 수 있기 때문입니다.
		return serialNum; // 클래스 변수
	}

	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}

}
