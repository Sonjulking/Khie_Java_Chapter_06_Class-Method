package thisex;

class Person {
	String name;
	int age;

	Person() {

		this("이름없음", 1); // this를 사용해 Person(String, int) 호출

	}

	Person(String name, int age) {

		this.name = name;
		this.age = age;

	}

	Person returnSelf() { // 반환형이 클래스형임... Person이라는...

		return this;
	}

}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);

		Person p = noName.returnSelf();
		System.out.println(p);
		System.out.println(noName);

	}

}
