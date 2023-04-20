package gof.designpattern.factory;

public class Bow implements Item{
	@Override
	public void use() {
		System.out.println("활을 사용하여 화살을 쏘다.");
	}
}
