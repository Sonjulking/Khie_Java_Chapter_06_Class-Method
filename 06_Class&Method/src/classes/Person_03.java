package classes;

public class Person_03 {

	public static void main(String[] args) {

		Person person = new Person(); // person 객체 생성 및 person객체를 메모리에 생성.

		person.personInfo();

		System.out.println();

		person.name = "홍길동";

		person.age = 27;

		person.personInfo();

	}

}
