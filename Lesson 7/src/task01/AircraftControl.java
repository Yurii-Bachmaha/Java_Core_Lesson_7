package task01;

public class AircraftControl {

	void MoveUP() {
		System.out.println("Aircraft is moving UP on " + Math.random() * 40 + " km");
	}

	void MoveDOWN() {
		System.out.println("Aircraft is moving Down on " + Math.random() * 40 + " km");
	}

	void MoveLEFT() {
		System.out.println("Aircraft is moving LEFT on " + Math.random() * 40 + " km");
	}

	void MoveRIGHT() {
		System.out.println("Aircraft is moving RIGHT on " + Math.random() * 40 + " km");
	}

}