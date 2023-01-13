package cooperation;

public class Taxi {

	String taxi;
	int passengerCount;
	int money;

	public Taxi(String taxi) {
		this.taxi = taxi;
	}

	public void take(int money) {

		this.money += money;

		passengerCount++;
	}

	public void showInfo() {

		System.out.println(taxi + " 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");

	}

}
