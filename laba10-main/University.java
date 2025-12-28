import java.util.ArrayList;
import java.util.List;

class University {

	private int numberOfEmployees;
	private List<Faculty> faculties = new ArrayList<>();

	public void addFaculty(Faculty f) {
		faculties.add(f);
	}

	public void removeFaculty(Faculty f) {
		faculties.remove(f);
	}

	public Faculty getFacultyByName(String name) {
		for (Faculty f : faculties) {
			if (f.toString().contains(name)) {
				return f;
			}
		}
		return null;
	}

	public int countEmployees() {
		return numberOfEmployees;
	}

	@Override
	public String toString() {
		return "Университет с факультетами: " + faculties.size();
	}
}