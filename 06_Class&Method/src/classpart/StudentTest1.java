package classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.stduentName = "안연수";
		System.out.println(student1.getStudentName());

		Student student2 = new Student();
		student2.stduentName = "안승연"; // 멤버변수 사용
		System.out.println(student2.getStudentName()); // 메서드 사용
	}

}
