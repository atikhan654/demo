package staff;

class Default {
	public int data1 = 10;
	private int data2 = 20;
	protected int data3 = 30;
	int data4 = 40;

	public static void main(String[] args) {
		Default ob = new Default();
		System.out.println(ob.data2);
	}
}

public class Keywords extends Default {

	public static void main(String[] args) {
		Keywords ob1 = new Keywords();
		System.out.println(ob1.data4);
		System.out.println(ob1.data3);
		System.out.println(ob1.data1);

	}

}
