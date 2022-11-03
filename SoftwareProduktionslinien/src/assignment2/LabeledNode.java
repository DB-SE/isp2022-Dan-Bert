package assignment2;

public class LabeledNode<T> extends INodeDecorator<T>{
	String label;
	
	public LabeledNode(INode<T> comp, String label) {
		this.comp = comp;
		this.label = label;
	}
	
	@Override
	public String toString() {
		return this.label;
	}

	@Override
	public T getData() {
		// TODO Auto-generated method stub
		return this.comp.getData();
	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return this.comp.getColour();
	}
}
