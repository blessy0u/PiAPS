import java.util.ArrayList;
import java.util.List;

class Course {

	private int id;
	private String name;
	private int weeklyDuration;
	private List<Lecturer> lecturers = new ArrayList<>();

	public Course(int id, String name, int weeklyDuration) {
		this.id = id;
		this.name = name;
		this.weeklyDuration = weeklyDuration;
	}

	public void addLecturer(Lecturer lect) {
		lecturers.add(lect);
	}

	public void removeLecture(Lecturer lect) {
		lecturers.remove(lect);
	}

	public List<Lecturer> getLecturers() {
		return lecturers;
	}

	@Override
	public String toString() {
		return "Курс: " + name + " (" + weeklyDuration + " ч/нед)";
	}
}

