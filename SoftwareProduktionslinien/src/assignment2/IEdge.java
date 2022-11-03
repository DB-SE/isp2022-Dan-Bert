package assignment2;

public abstract class IEdge implements Comparable<IEdge>{	
	public abstract INode<?> getNodeA();
	public abstract INode<?> getNodeB();
	
	public abstract int getWeight();
	
	public abstract boolean contains(INode<?> first, INode<?> second);
	
	public abstract INode<?> neighbor(INode<?> root);
	
	public String toString() {
		return "(" + getNodeA().toString() + ", " + getNodeB().toString() + ", "+ this.getWeight() + ")";
	}
	
	public int compareTo(IEdge o) {
		int a = this.getWeight();
		int b = o.getWeight();
		if(a < b) return -1;
		else if(a > b) return 1;
		else return 0;
	}
}

