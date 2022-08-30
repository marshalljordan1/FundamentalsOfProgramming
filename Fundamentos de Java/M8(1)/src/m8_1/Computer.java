package m8_1;

public class Computer {
	
	private String brand;
	private String model;
	private String processor;
	private int ram;
	private int hdisk;
	
	public Computer(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public Computer(String brand, String model, String processor, int ram, int hdisk) {
		this.brand = brand;
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.hdisk = hdisk;
	}

	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getProcessor() {
		return processor;
	}
	
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public int getRam() {
		return ram;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public int getHdisk() {
		return hdisk;
	}

	public void setHdisk(int hdisk) {
		this.hdisk = hdisk;
	}
	
	public String executing(String program) {
		String message = "Currently "+ program +" is being executed ";
		return message;
	}
	@Override
	public String toString() {
		return "brand = " + brand +", model = "+ model +", processor = "+ processor + ", ram = "+ ram +", hard disk = "+ hdisk +".";
	}
	
	
}
