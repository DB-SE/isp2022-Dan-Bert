/**
 * TODO description
 */
public class Node {

	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return original() + " with color: " + color;
	}
}