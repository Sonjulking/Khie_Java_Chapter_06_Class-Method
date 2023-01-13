package date;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate() {

	}

	public MyDate(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;

	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isValid() {
		switch (month) {
		case 2:
			if (day < 1 || day > 28) {
				System.out.println("유효하지 않은 날짜입니다.");
				return false;
			} else {
				System.out.println("유효한 날짜 입니다.");
				return true;
			}

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (day < 1 || day > 31) {
				System.out.println("유효하지 않은 날짜입니다.");
				return false;
			} else {
				System.out.println("유효한 날짜 입니다.");
				return true;
			}
		case 4:
		case 6:
		case 9:
		case 11:
			if (day < 1 || day > 30) {
				System.out.println("유효하지 않은 날짜입니다.");
				return false;
			} else {
				System.out.println("유효한 날짜 입니다.");
				return true;
			}
		default:
			System.out.println("유효하지 않은 날짜입니다.");
			return false;

		}
	}
}
