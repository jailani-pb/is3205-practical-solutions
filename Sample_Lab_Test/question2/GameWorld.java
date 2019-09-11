package question2;

import java.util.ArrayList;

public class GameWorld {

	private ArrayList<Placeable> placeableItems;
	
	public GameWorld() {
		placeableItems = new ArrayList<Placeable>();
	}
	
	public Placeable getPlaceableItem(int index) {
		if(!placeableItems.isEmpty() && index >= 0 && index < placeableItems.size()) {
			return placeableItems.get(index);
		}
		return null;
	}
	
	public void addPlaceableItem(Placeable item) {
		if(item != null) {
			placeableItems.add(item);
		}
	}
	
	public void removePlaceableItem(int index) {
		if(!placeableItems.isEmpty() && index >= 0 && index < placeableItems.size()) {
			placeableItems.remove(index);
		}
	}
	
	public void removePlaceableItem(Placeable item) {
		placeableItems.remove(item);
	}
}
