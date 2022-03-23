package Hospital;

public interface Student {
	String name = "shon";
	int id = 15;

	public String showInfo(String name);

	public int showId(int id);

	public static void main(String[] args) {
		Class ob = new Class();
		System.out.println(ob.showInfo("Sam"));
		System.out.println(ob.showId(25));

	}
}

class Class implements Student {

	public int showId(int id) {

		return id;
	}

	public String showInfo(String name) {

		return name;
	}
}
