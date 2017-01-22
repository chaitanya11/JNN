package core;

public class CellBody {

	private float strength;
	private Object output;

	public float getStrength() {
		return strength;
	}

	public void setStrength(float strength) {
		this.strength = strength;
	}

	public Object getOutput() {
		return output;
	}

	public void setOutput(Object output) {
		this.output = output;
	}

	@Override
	public String toString() {
		return "{\"strength\":" + strength + ", \"output\":" + output + "}";
	}
	
	
}
