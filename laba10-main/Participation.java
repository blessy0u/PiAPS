class Participation {

	private int hours;
	private Research research;

	public Participation(Research research, int hours) {
		this.research = research;
		this.hours = hours;
	}

	@Override
	public String toString() {
		return research.getName() + " — " + hours + " часов";
	}
}
