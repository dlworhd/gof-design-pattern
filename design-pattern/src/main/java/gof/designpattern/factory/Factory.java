package gof.designpattern.factory;

public abstract class Factory {
	public Item create(String itemName){
		boolean creatable = isCreatable(itemName);
		if(creatable){
			Item item = this.createItem(itemName);
			postProcessItem(itemName);
			return item;
		}
		return null;
	}


	public abstract boolean isCreatable(String itemName);
	public abstract Item createItem(String itemName);
	public abstract void postProcessItem(String itemName);

}
