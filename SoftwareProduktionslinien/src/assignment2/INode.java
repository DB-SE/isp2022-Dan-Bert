package assignment2;

public abstract class INode<T> {
	protected T data;
	
	public T getData() {return this.data;}
	
	public abstract String getColour();
	
	public abstract String toString();
}	
