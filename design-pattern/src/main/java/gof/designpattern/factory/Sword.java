package gof.designpattern.factory;

public class Sword implements Item{
	@Override
	public void use() {
		System.out.println("칼을 사용하여 베다.");
	}
}
