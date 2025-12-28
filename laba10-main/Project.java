import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Project {

	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private List<Participation> participations = new ArrayList<>();

	public Project(String name, LocalDate startDate, LocalDate endDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public LocalDate getPeriod() {
		return startDate;
	}

	public void addParticipation(Participation p) {
		participations.add(p);
	}

	@Override
	public String toString() {
		return "Проект: " + name + " (" + startDate + " – " + endDate + ")";
	}
}