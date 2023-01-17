package singleton;

public class Car {

	public static int serialNum = 10000;
	private int carNum;

	public Car() {

		serialNum++;
		carNum = serialNum;

	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

}
