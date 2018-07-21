package markeri;

public class Writer {

	private Color color;
	private String brand;
	private boolean canWrite;
	
	public Writer(String brand, Color color, boolean canWrite) {
		this.brand = brand;
		this.color = color;
		this.canWrite = canWrite;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public Color getColor() {
		return color;
	}
	
	public boolean isCanWrite() {
		return canWrite;
	}
}
