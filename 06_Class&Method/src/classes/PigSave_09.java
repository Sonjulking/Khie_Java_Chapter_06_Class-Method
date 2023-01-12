package classes;

public class PigSave_09 {

	public static void main(String[] args) {
		// 돼지저금통 객체 생성

		PigSave save = new PigSave(0);

		save.deposit(30000);// 입금 메서드 호출
		save.deposit(20000);// 입금 메서드 호출

		save.withdraw(40000);
		save.deposit(20000);// 입금 메서드 호출
		save.withdraw(40000);

		// save.balance = 100000; // 이렇게 접근이 되면은 안된다 .// 프라이빗 해줘서 접근이 안됌

	}

}
