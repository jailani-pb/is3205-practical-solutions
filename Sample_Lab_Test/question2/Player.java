package question2;

import java.util.ArrayList;

public class Player {

	private ArrayList<GameItem> inventory;
	private int healthLevel;
	private int defenceLevel;
	private Armour armour;
	
	public Player() {
		this.healthLevel = 100;
		this.defenceLevel = 0;
		inventory = new ArrayList<GameItem>();
	}
	
	public void eatItem(int index) {
		if(!inventory.isEmpty() && index >= 0 && index < inventory.size()) {
			GameItem eatItem = inventory.get(index);
			if(eatItem instanceof Eatable) {
				if(eatItem instanceof Potion) {
					healthLevel = healthLevel + ((Potion) eatItem).heal;
				}
				inventory.remove(index);
			}
		}
	}
	
	public void placeItem(int index, GameWorld gameWorld) {
		if(gameWorld != null) {
			if(!inventory.isEmpty() && index >= 0 && index < inventory.size()) {
				GameItem placeItem = inventory.get(index);
				if(placeItem instanceof Placeable) {
					gameWorld.addPlaceableItem((Placeable) placeItem);
					inventory.remove(index);
				}
			}
		}
	}
	
	public void equipArmour(int index) {
		if(!inventory.isEmpty() && index >= 0 && index < inventory.size()) {
			GameItem equipItem = inventory.get(index);
			if(equipItem instanceof Armour) {
				Armour wearArmour = (Armour) equipItem;
				if(!wearArmour.equals(armour)) {
					armour = wearArmour;
					defenceLevel = wearArmour.defence;
				}
			}
		}
	}
	
	public void removeArmour() {
		armour = null;
		defenceLevel = 0;
	}
	
	public void addGameItem(GameItem item) {
		if(item != null) {
			inventory.add(item);
		}
	}
	
	public void removeGameItem(GameItem item) {
		inventory.remove(item);
	}
	
	public void removeGameItem(int index) {
		if(!inventory.isEmpty() && index >= 0 && index < inventory.size()) {
			inventory.remove(index);
		}
	}
	
	public GameItem getGameItem(int index) {
		if(!inventory.isEmpty() && index >= 0 && index < inventory.size()) {
			return inventory.get(index);
		}
		return null;
	}
	
	public int getHealthLevel() {
		return healthLevel;
	}
	
	public int getDefenceLevel() {
		return defenceLevel;
	}
	
	public int getTotalWeight() {
		int totalWeight = 0;
		for(GameItem item : inventory) {
			totalWeight = totalWeight + item.getWeight();
		}
		return totalWeight;
	}
	
}
