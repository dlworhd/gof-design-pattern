package gof.designpattern.factory;

import java.util.HashMap;

public class ItemFactory extends Factory {

	private class ItemData {
		private int maxCount;
		private int currentCount;

		public ItemData(int maxCount) {
			this.maxCount = maxCount;
		}
	}

	private HashMap<String, ItemData> repository;

	public ItemFactory() {
		repository = new HashMap<>();

		repository.put("sword", new ItemData(3));
		repository.put("shield", new ItemData(2));
		repository.put("bow", new ItemData(1));
	}

	@Override
	public boolean isCreatable(String itemName) {
		ItemData itemData = repository.get(itemName);
		if (itemData == null) {
			System.out.println(itemName + "은 없는 아이템입니다.");
			return false;
		}

		if(itemData.currentCount >= itemData.maxCount){
			System.out.println(itemName + "은 품절 아이템입니다.");
			return false;
		}
		return true;
	}

	@Override
	public Item createItem(String itemName) {
		Item item = null;

		if(itemName.equals("sword")) item =  new Sword();
		if(itemName.equals("shield")) item = new Shield();
		if(itemName.equals("bow")) item =  new Bow();

		return item;
	}

	@Override
	public void postProcessItem(String itemName) {
		ItemData itemData = repository.get(itemName);
		if(itemData != null) itemData.currentCount++;
	}
}
