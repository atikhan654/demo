package aggrigation;

public class Containment {
	Hotel ob1 = new Hotel();
	Chef ob2 = new Chef();
	Salary ob3 = new Salary();
	Waiters ob4 = new Waiters();

	public static void main(String[] args) {
		Containment co = new Containment();
		co.ob1.Hotelname();
		co.ob2.Chefname();
		co.ob3.Salarysheet();
		co.ob4.Waitername();
	}

}

class Hotel {
	String hname = "greenhouse";

	public void Hotelname() {
		System.out.println(hname);
	}
}

class Chef {
	String cname = "tom";

	public void Chefname() {
		System.out.println(cname);
	}

}

class Salary {
	int snumber = 25;

	public void Salarysheet() {
		System.out.println(snumber);
	}
}

class Waiters {
	String wname = "jerry";

	public void Waitername() {
		System.out.println(wname);
	}

}