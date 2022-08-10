package task01;

public class Applicatoin {

	public static void main(String[] args) {

		SU27 su27 = new SU27(21.9, 14.7, 16300, 1500, "Blue camouflage");
		System.out.println(su27);
		System.out.println();
		su27.startingEngines();
		su27.aircraftTakeOff();
		su27.aircraftControl.MoveUP();
		su27.aircraftControl.MoveLEFT();
		su27.aircraftControl.MoveDOWN();
		su27.aircraftControl.MoveRIGHT();
		su27.stealthTechnology();
		su27.nuclearStroke();
		su27.turboAcceleration();
		su27.landingAircraft();
	}

}