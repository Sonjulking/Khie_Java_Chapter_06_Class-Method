package classpart;

public class Shopping {

	long orderNumber;
	String ID;
	String date;
	String name;
	String productNumber;
	String addr;

	public static void main(String[] args) {

		Shopping shopping = new Shopping();
		shopping.orderNumber = 201803120001L;
		shopping.ID = "abc123";
		shopping.name = "홍길순";
		shopping.date = "2018년 3월 12일";
		shopping.productNumber = "PD0345-12";
		shopping.addr = "여의도 영등포구 여의도동 20번지";

	}

}
