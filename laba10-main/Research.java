class Research extends Employee {

	protected String researchArea;

	public Research(int ssn, String name, String email, String researchArea) {
		super(ssn, name, email);
		this.researchArea = researchArea;
	}

	@Override
	public String toString() {
		return super.toString() + " — исследование: " + researchArea;
	}
}