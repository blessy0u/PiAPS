import java.util.ArrayList;
import java.util.List;

class Faculty {

	private String name;
	private Dean dean;
	private List<Institute> institutes = new ArrayList<>();

	public Faculty(String name) {
		this.name = name;
	}

	public void addDepartment(Institute d) {
		institutes.add(d);
	}

	public void removeDepartment(Institute d) {
		institutes.remove(d);
	}

	public void assignDean(Dean d) {
		this.dean = d;
	}

	@Override
	public String toString() {
		return "Факультет: " + name + " (Декан: " + (dean != null ? dean.getName() : "не назначен") + ")";
	}
}