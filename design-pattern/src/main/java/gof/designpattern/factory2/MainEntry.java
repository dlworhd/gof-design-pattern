package gof.designpattern.factory2;

public class MainEntry {
	public static void main(String[] args) {

		FlightFactory factory = new FlightFactory();

		if (factory.canFly("airplane")) {
			Flight airplane = factory.createFlight("airplane");
			airplane.introduction();
		}

		if (factory.canFly("ironman")) {
			Flight ironman = factory.createFlight("ironman");
			ironman.introduction();
		}

		if (factory.canFly("bird")) {
			Flight bird = factory.createFlight("bird");
			bird.introduction();
		}
	}
}
