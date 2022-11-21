package nodes;

// #if Coloured
public class ColouredNodeDecorator<T> extends INodeDecorator<T>{
	private String colour;
	
	public ColouredNodeDecorator(INode<T> comp, String colour) {
		this.comp = comp;
		this.colour = colour;
	}

	public String getColour() {
		return this.colour;
	}

	@Override
	public String toString() {
		return this.comp.toString();
	}

}
// #endif

// #if !Coloured 
//@class ColouredNodeDecorator {}
// #endif
