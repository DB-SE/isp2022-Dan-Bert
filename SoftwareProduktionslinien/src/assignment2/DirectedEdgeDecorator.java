package assignment2;

public class DirectedEdgeDecorator extends IEdgeDecorator {	
	public DirectedEdgeDecorator(IEdge comp) {
		this.comp = comp;
	}

	@Override
	public INode<?> getNodeA() {
		return this.comp.getNodeA();
	}

	@Override
	public INode<?> getNodeB() {
		return this.comp.getNodeB();
	}

	@Override
	public int getWeight() {
		return this.comp.getWeight();
	}

	@Override
	public boolean contains(INode<?> first, INode<?> second) {
		if(getNodeA().equals(first) && getNodeB().equals(second)) {
			return true;
		}else return false;
	}

	@Override
	public INode<?> neighbor(INode<?> root) {
		if(getNodeA().equals(root)) {
			return getNodeB();
		} else return null; 
	}	
}
