/**
 * TODO description
 */
public   class  Node  <T> {
	
	
	protected T data;

	

	public Node(T data) {
		this.data = data;
	}

	

	 private String  toString__wrappee__Base  () {
		return data.toString();
	}

	
	
	public String toString() {
		return toString__wrappee__Base() + " with label: " + label;
	}

	

	public T getData() {
		return this.data;
	}

	
	
	private String label;

	
	
	public void setLabel(String label) {
		this.label = label;
	}


}
