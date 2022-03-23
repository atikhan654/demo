package demo;

public class Demo1 {
	String name;
	int id;

	@Override
	public String toString() {
		return "Test [name=" + name + ", id=" + id + "]";
	}

	public Demo1(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		Demo1 test = new Demo1("Bob", 123);
		System.out.println(test);
	}
}
