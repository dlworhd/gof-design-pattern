package gof.designpattern.factory2;

public abstract class Factory {

	public Flight create(String name){
		if(canFly(name)){
			return createFlight(name);
		}
		return null;
	}

	public abstract boolean canFly(String name);
	public abstract Flight createFlight(String name);
}
