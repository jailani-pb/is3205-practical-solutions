package question2;

public class Furniture extends GameItem implements Placeable {
	
	private int width;
	private int height;
	
	public Furniture(int weight, int width, int height) {
		super(weight);
		this.width = width;
		if(this.width < 1) {
			this.width = 1;
		}
		this.height = height;
		if(this.height < 1) {
			this.height = 1;
		}
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
