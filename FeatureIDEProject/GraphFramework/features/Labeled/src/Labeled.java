import interfaces.INodes;

public class Labeled implements INodes {

	private String label;
	
	@Override
	public String getPrint() {
		return "Label: " + label;
	}

	@Override
	public void ChangeColour(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ChangeLabel(String s) {
		this.label = s;
		
	}
	
}
