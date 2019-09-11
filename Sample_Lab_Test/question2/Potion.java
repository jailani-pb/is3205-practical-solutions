package question2;

public class Potion extends GameItem implements Eatable {

	public int heal;
	
	public Potion(int weight, int heal) {
		super(weight);
		this.heal = heal;
	}
	
}
