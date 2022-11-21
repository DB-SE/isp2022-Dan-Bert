package nodes;

// #if Labeled 
public class LabeledNodeDecorator<T> extends INodeDecorator<T>{
	private String label;
	
	public LabeledNodeDecorator(INode<T> comp, String label) {
		this.comp = comp;
		this.label = label;
	}
	
	@Override
	public String toString() {
		return this.label;
	}

	@Override
	public T getData() {
		return this.comp.getData();
	}

	// #if Coloured 
	@Override
	public String getColour() {
		return this.comp.getColour();
	}
	// #endif
}
// #endif 

// #if !Labeled
//@class LabeledNodeDecorator{}
// #endif
