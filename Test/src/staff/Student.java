package staff;

class Teacher {
	public void showTeaching() {
		System.out.println("Teaching");

	}
}

class Hobbies {
	public void showHobbies() {
		System.out.println("Hobbies");
	}

}

class Subject {
	public void showSubject() {
		System.out.println("Subjects");
	}

}

class Homework {
	public void showHomework() {
		System.out.println("Homework");

	}
}

public class Student {
	String name;

	public void showName() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Hobbies h = new Hobbies();
		h.showHobbies();
		Teacher t = new Teacher();
		t.showTeaching();
		Subject s = new Subject();
		s.showSubject();
		Homework ho = new Homework();
		ho.showHomework();
	}

}
