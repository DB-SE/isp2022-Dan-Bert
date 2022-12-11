package superClasses;

public class SuperNode<T> {
	private T data;
	
	public SuperNode(T data) {
		this.data = data;
	}
	
	public String toString() {
		// #if Labeled
		return labeledtoString();
		// #endif
		// #if !Labeled
//@		return data.toString();
		// #endif
	}

	public T getData() {
		return this.data;
	}

	// #if Coloured
	public Colour colour;
	
	public SuperNode(T data, Colour colour) {
		this.data = data;
		this.colour = colour;		
	}
	// #endif
	
	
	// #if Labeled 
	public String label = "";
	
	public SuperNode(T data, String label) {
		this.data = data;
		this.label = label;
	}
	
	public String labeledtoString() {
		//return this.label;
		return this.data.toString();
	}
	// #endif
	
}
