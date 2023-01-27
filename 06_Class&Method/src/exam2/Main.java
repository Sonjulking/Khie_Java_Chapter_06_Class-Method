package exam2;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("김동현", 50000);
		Student student2 = new Student("김서윤", 50000);

		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway(2);

		student1.takeBus(bus100);
		student2.takeSubway(subwayGreen);

		// student1 학생에 대한 정보를 출력
		student1.showStudentInfo();
		System.out.println();

		// student2 학생에 대한 정보를 출력
		student2.showStudentInfo();
		System.out.println();

		// bus100에 대한 정보를 출력해보자.
		bus100.showBusInfo();
		System.out.println();

		// subwayGreen에 대한 정보를 출력해보자.
		subwayGreen.showSubwayInfo();

	}

}
