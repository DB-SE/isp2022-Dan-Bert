import interfaces.INodes;

public class Coloured implements INodes {

	private String colour;
	
	@Override
	public String getPrint() {
		return "Colour: " + colour;
	}

	@Override
	public void ChangeColour(String s) {
		this.colour = s;
		
	}

	@Override
	public void ChangeLabel(String s) {
		
	}
	


}
