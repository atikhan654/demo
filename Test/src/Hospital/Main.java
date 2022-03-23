package Hospital;

abstract class Hotel {
	String name;
	String add;
	int staff;
	int chef;

	public String displayInfo(String name, String add) {
		return name + add;
	}

	abstract public int showStaff(int staff);

	abstract public int showChef(int chef);

}

class Member extends Hotel {

	public int showChef(int chef) {

		return chef;
	}

	public int showStaff(int staff) {

		return staff;
	}

}

public class Main {
	public static void main(String[] args) {
		Member ob = new Member();
		System.out.println(ob.displayInfo("jhon", "pune"));
		System.out.println(ob.showChef(2));
		System.out.println(ob.showStaff(22)); 
	}

}
