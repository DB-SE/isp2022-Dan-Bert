/**
 * TODO description
 */
public class Edge {
	private float weight;
	
	public void changeWeight(float value) {
		this.weight = value;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public int compareTo(Edge o) {
		float a = this.getWeight();
		float b = o.getWeight();
		if(a < b) return -1;
		else if(a > b) return 1;
		else return 0;
	}

}