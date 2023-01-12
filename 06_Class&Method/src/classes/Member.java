package classes;

//문제 member 라는 클래스를 만들어서 해당 member 클래스의 회전 정보를 화면에
//보여주세요.(단, 회원의 정보는 회원 아이디, 회원 이름, 회원 나이,  회원 연락처,
//회원 직업으로 구성을 한다)

public class Member {

	String memberID;
	String memberName;
	int memberAge;
	String memberPhone;
	String memberJob;

	public Member() {

	}

	public Member(String i, String n, int a, String p, String j) {

		memberID = i;
		memberName = n;
		memberAge = a;
		memberPhone = p;
		memberJob = j;

	}

	public void showMemberInfo() {

		System.out.println("회원의 아이디 >>> " + memberID);
		System.out.println("회원의 이름 >>> " + memberName);
		System.out.println("회원의 나이 >>> " + memberAge);
		System.out.println("회원의 연락처 >>> " + memberPhone);
		System.out.println("회원의 직업 >>> " + memberJob);

	}

}
