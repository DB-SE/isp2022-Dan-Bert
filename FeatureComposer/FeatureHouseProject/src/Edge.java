/**
 * TODO description
 */
public   class  Edge  implements Comparable<Edge> {
	

	public Node<?> a;

	
	public Node<?> b;

	
	
	// default Undirected and weight 0	
	public Edge(Node<?> a, Node<?> b) {
		this.a = a;
		this.b = b;
	}

	
	
	
	public Node<?> getNodeA() {
		// TODO Auto-generated method stub
		return this.a;
	}

	


	public Node<?> getNodeB() {
		// TODO Auto-generated method stub
		return this.b;
	}

	
	
	public String toString() {
		return a + "-" + b;
	}

	
	
	
	public boolean contains( Node<?> first, Node<?> second) {
		if(
				(this.a.equals(first) && this.b.equals(second)) ||
				(this.b.equals(first) && this.a.equals(second))) {
			return true;
		}else return false;
	}

	
	
	public Node<?> neighbor(Node<?> root) {
		if(getNodeA().equals(root)) {
			return this.b;
		} else if(getNodeB().equals(root)) {
			return this.a;
		} else return null;
	}

	
	
	public int compareTo  (Edge o) {
		float a = this.getWeight();
		float b = o.getWeight();
		if(a < b) return -1;
		else if(a > b) return 1;
		else return 0;
	}

	
	
	public boolean contains(Edge selfRef, Node<?> first, Node<?> second) {
		if(
				(selfRef.a.equals(first) && selfRef.b.equals(second)) ||
				(selfRef.b.equals(first) && selfRef.a.equals(second))) {
			return true;
		}else return false;
	}

	

	public Node<?> neighbor(Edge selfRef, Node<?> root) {
		if(selfRef.getNodeA().equals(root)) {
			return selfRef.b;
		} else if(selfRef.getNodeB().equals(root)) {
			return selfRef.a;
		} else return null;
	}

	
	private float weight;

	
	
	public void changeWeight(float value) {
		this.weight = value;
	}

	
	
	public float getWeight() {
		return weight;
	}


}
