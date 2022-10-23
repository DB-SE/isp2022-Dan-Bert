package assignment1;

public class Tuple<V1, V2>{
	public V1 value1;
	public V2 value2;
	
	public Tuple(V1 value1, V2 value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public String toString() {
		return "[" + String.valueOf(value1) + "," + String.valueOf(value2) + "]"; 
	}
	
}