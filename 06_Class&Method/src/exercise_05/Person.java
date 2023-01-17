package exercise_05;

public class Person {
	String name;
	int money;

	public Person(String name, int money) {

		this.name = name;
		this.money = money;
	}

	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.brweing(4000);

		if (message != null) {
			this.money -= money;
			System.out.println(name + money + message);

		}

	}

	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.brweing(4500);
		if (message != null) {
			this.money -= money;
			System.out.println(name + money + message);
		}
	}
}
