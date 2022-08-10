package task01;

public class SU27 extends Aircraft implements Accessibility {

	private double maxSpeed;
	private String color;
	AircraftControl aircraftControl = new AircraftControl();

	public SU27(double length, double width, double weight, double maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public AircraftControl getAircraftControl() {
		return aircraftControl;
	}

	public void setAircraftControl(AircraftControl aircraftControl) {
		this.aircraftControl = aircraftControl;
	}

	@Override
	public void turboAcceleration() {
		System.out.println("The aircraft is moving with speed: " + (maxSpeed + Math.random() * 1000) + " km/h");
	}

	@Override
	public void stealthTechnology() {
		System.out.println("The aircraft is invisible for " + Math.random() * 120 + " seconds");
	}

	@Override
	public void nuclearStroke() {
		System.out.println("The aircraft dropped " + ((int) (Math.random() * 10) + 1) + " warheads");
	}

	@Override
	public String toString() {
		return "SU27 : length = " + length + " , width = " + width + ", weight = " + weight + " , maxSpeed = " + maxSpeed
				+ ", color = " + color;
	}

}