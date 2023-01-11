package classpart;

public class Student { // 클래스를 만드는 예약어 클래스 이름

	// 멤버 변수
	int studentID; // 학번
	String stduentName; // 학생 이름
	int grade; // 학년
	String address; // 사는 곳

	public void showStudentInfo() {

		System.out.println(stduentName + "," + address);

	}

	public String getStudentName() {

		return stduentName;

	}

	public void setStudentName(String name) {

		stduentName = name;

	}

//	public static void main(String[] args) {
//
//		Student studentAhn = new Student();
//		studentAhn.stduentName = "안연수";
//
//		System.out.println(studentAhn.stduentName);
//		System.out.println(studentAhn.getStudentName());
//
//	}

}
