package nodes;

public abstract class INode<T> {
	protected T data;
	
	public T getData() {return this.data;}
	
	// #if Coloured 
	public abstract String getColour();
	// #endif
	
	public abstract String toString();
}	
