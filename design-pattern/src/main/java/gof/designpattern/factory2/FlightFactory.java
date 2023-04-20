package gof.designpattern.factory2;

import java.util.HashMap;

public class FlightFactory extends Factory {
	HashMap<String, Data> repository;

	public class Data {
		private int maxLevel;
		private int currentLevel;

		public Data(int maxLevel) {
			this.maxLevel = maxLevel;
		}
	}

	public FlightFactory() {
		repository = new HashMap<>();

		repository.put("ironman", new Data(3));
		repository.put("airplane", new Data(2));
		repository.put("bird", new Data(1));
	}


	@Override
	public boolean canFly(String name) {
		Data data = repository.get(name);
		if (data != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Flight createFlight(String name) {

		if(name.equals("ironman")) return new IronMan();
		if(name.equals("airplane")) return new AirPlane();
		if(name.equals("bird")) return new Bird();

		return null;
	}

}
