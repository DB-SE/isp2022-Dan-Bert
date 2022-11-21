package superClasses;

public class SuperEdge 
	//#if Weighted 
//@	implements Comparable<SuperEdge>
	//#endif 
{
	public SuperNode<?> a;
	public SuperNode<?> b;
	
	public SuperEdge(SuperNode<?> a, SuperNode<?> b) {
		this.a = a;
		this.b = b;
	}
	
	
	public String toString() {
		String r = "(" + this.a.toString() + ", " + this.b.toString() + ")" 
				// #if Weighted
//@				+ " W: " + this.weight 
				// #endif
				;
		return r;
	}


	// #if Undirected
//@	public boolean contains(SuperNode<?> first, SuperNode<?> second) {
//@		if(
//@				(this.a.equals(first) && this.b.equals(second)) ||
//@				(this.b.equals(first) && this.a.equals(second))) {
//@			return true;
//@		}else return false;
//@	}
//@	
//@	public SuperNode<?> neighbor(SuperNode<?> root) {
//@		if(this.a.equals(root)) {
//@			return this.b;
//@		} else if(this.b.equals(root)) {
//@			return this.a;
//@		} else return null;
//@	}
	// #endif
	
	
	// #if Directed
	public boolean contains(SuperNode<?> first, SuperNode<?> second) {
		if(this.a.equals(first) && this.b.equals(second)) {
			return true;
		}else return false;
	}

	public SuperNode<?> neighbor(SuperNode<?> root) {
		if(this.a.equals(root)) {
			return this.b;
		} else return null; 
	}
	// #endif
	
	
	// #if Weighted
//@	public int weight = 0;
//@	
//@	public SuperEdge(SuperNode<?> a, SuperNode<?> b, int weight) {
//@		this.a = a;
//@		this.b = b;
//@		this.weight = weight;
//@	}
//@
//@	@Override
//@	public int compareTo(SuperEdge o) {
//@		if(this.weight < o.weight) return -1;
//@		else if(this.weight > o.weight) return 1;
//@		else return 0;
//@	}
//@	
	// #endif
}
