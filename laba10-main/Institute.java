import java.util.ArrayList;
import java.util.List;

class Institute {

	private String name;
	private String address;
	private List<Research> researches = new ArrayList<>();

	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void addResearch(Research e) {
		researches.add(e);
	}

	public void removeResearch(Research e) {
		researches.remove(e);
	}

	@Override
	public String toString() {
		return "Институт " + name + " (" + address + ")";
	}
}