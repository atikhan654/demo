package staff;

public class Doctor extends Hospital.Salary {
	public static void main(String[] args) {
		Doctor d = new Doctor();
		System.out.println(d.calSalary());
	}
}
