package task01;

public abstract class Aircraft {

	double length;
	double width;
	double weight;

	public Aircraft(double length, double width, double weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	void startingEngines() {
		double time;
		time = Math.random() * (88 - 20) + 20;
		System.out.println("Engines will start in " + time + " seconds");
	}

	void aircraftTakeOff() {
		System.out.println("The aircraft will fly " + Math.random() * 1000 + " km in a full tank of fuel");
	}

	void landingAircraft() {
		System.out.println("The Aircraft is landing");
	}

}