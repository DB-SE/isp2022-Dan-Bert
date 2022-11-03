package assignment2;

public class Config {
	/**
	 * SINGLETON
	 * 
	 * Die Var sind auf static final gesetzt, damit der Compiler wei�, 
	 * sie sich nicht �ndern und Code dementsprechend weglassen kann
	 */
	public static final boolean label = false;
	public static final boolean weight = true;
	public static final boolean directed = true;
	
	private Config() {}
}
