/**
 * TODO description
 */
public class Node {
	
	private String label;
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String toString() {
		return original() + " with label: " + label;
	}

}