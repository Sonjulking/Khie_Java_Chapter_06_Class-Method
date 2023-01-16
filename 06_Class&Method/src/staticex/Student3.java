package staticex;

public class Student3 {

	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String addrres;
	public static int cardNum = serialNum + 100;
	public int studentCard;

	public Student3() {

		serialNum++;
		cardNum++;
		studentID = serialNum;
		studentCard = cardNum;

	}

	public String getStudentName() {

		return studentName;

	}

	public void setStudentName(String name) {

		studentName = name;

	}

	public static int getSerialNum() {
		int i = 10;

		return serialNum; // 클래스 변수
	}

	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}

}
