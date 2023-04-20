package gof.designpattern.factory;

public class Shield implements Item{
	@Override
	public void use() {
		System.out.println("방패를 사용해서 막다.");
	}
}
