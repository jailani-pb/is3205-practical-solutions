package question2;

public abstract class GameItem {

	private int weight;
	
	public GameItem(int weight) {
		setWeight(weight);
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
		if(weight < 0) {
			this.weight = 0;
		}
	}
	
}
