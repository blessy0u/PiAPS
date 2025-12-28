abstract class Employee {

	private int ssn;
	private String name;
	private String email;

	public String getName() {
		return this.name;
	}

	public Employee(int ssn, String name, String email) {
		this.ssn = ssn;
		this.name = name;
		this.email = email;
	}

	public Employee() {
		this(0, "Unknown", "unknown@university.com");
	}

	@Override
	public String toString() {
		return name + " (" + email + ")";
	}
}