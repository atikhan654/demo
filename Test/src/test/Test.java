package test;

public class Test {
	String name;
	int id;

	@Override
	public String toString() {
		return "Test [name=" + name + ", id=" + id + "]";
	}

	public Test(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		Test test = new Test("Bob", 123);
		System.out.println(test);
	}
}
