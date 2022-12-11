package edges;

import nodes.*;

public class Edge extends IEdge{
	INode<?> a;
	INode<?> b;
	
	// default Undirected and weight 0	
	public Edge(INode<?> a, INode<?> b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public INode<?> getNodeA() {
		// TODO Auto-generated method stub
		return this.a;
	}

	@Override
	public INode<?> getNodeB() {
		// TODO Auto-generated method stub
		return this.b;
	}
	
	@Override
	public int getWeight() {
		return 0;
	}
	
	@Override
	public boolean contains(INode<?> first, INode<?> second) {
		if(
				(this.a.equals(first) && this.b.equals(second)) ||
				(this.b.equals(first) && this.a.equals(second))) {
			return true;
		}else return false;
	}
	
	@Override
	public INode<?> neighbor(INode<?> root) {
		if(getNodeA().equals(root)) {
			return this.b;
		} else if(getNodeB().equals(root)) {
			return this.a;
		} else return null;
	}
}
