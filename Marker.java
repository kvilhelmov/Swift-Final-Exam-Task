package markeri;

public class Marker extends Writer {

	private int inkContainerThickness;
	private int weight;
	
	public Marker(String brand, Color color, boolean canWrite, int inkContainerThickness, int weight) throws InvalidDataException {
		super(brand, color, canWrite);
		this.inkContainerThickness = inkContainerThickness;
		setWeight(weight);
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) throws InvalidDataException {
		if(weight > 0 && weight <= 500) {
			this.weight = weight;
		}else {
			throw new InvalidDataException("Weight is invalid.");
		}
	}
	
	public int getInkContainerThickness() {
		return inkContainerThickness;
	}
}
