
public class Pojo {

	private String name = "tom";
	private int id = 56;
	private String address = "Pune";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		Pojo ob = new Pojo();
		System.out.println(ob.getName());
		System.out.println(ob.getId());
		System.out.println(ob.getAddress());
	}

}
