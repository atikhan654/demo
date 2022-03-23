package staff;

class Teach {
	String tname = "jerry";
	String tfaculty = "It";
	int tid = 55;
	String tsub = "Geography";

	@Override
	public String toString() {
		return "Teach [tname=" + tname + ", tfaculty=" + tfaculty + ", tid=" + tid + ", tsub=" + tsub + "]";
	}

}

class Hobb {
	String hobbie;

	public String Hobbies(String hobbie) {
		return hobbie;
	}

}

class Sub {
	String sname = "science";
	int noofsub = 05;

	@Override
	public String toString() {
		return "Sub [sname=" + sname + ", noofsub=" + noofsub + "]";
	}

}

class Home {
	String hwork = "tables";
	String hsub = "maths";

	@Override
	public String toString() {
		return "Home [hwork=" + hwork + ", hsub=" + hsub + "]";
	}

}

public class Main {
	String name;

	public String showName(String name) {
		return name;
	}

	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m.showName("sneha"));
		Hobb h = new Hobb();
		System.out.println(h.Hobbies("music"));
		Teach t = new Teach();
		System.out.println(t.toString());
		Sub s = new Sub();
		System.out.println(s.toString());
		Home ho = new Home();
		System.out.println(ho.toString());

	}

}
