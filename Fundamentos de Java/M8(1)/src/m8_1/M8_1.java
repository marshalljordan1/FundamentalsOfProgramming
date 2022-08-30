package m8_1;

public class M8_1 {
	
	public static void main(String[] args) {
		
		Computer pc1 = new Computer("Lenovo", "ThinkPad E15");
		pc1.setProcessor("i5");
		pc1.setRam(16);
		pc1.setHdisk(500);
		
		System.out.println("Computer pc1: "+ pc1.toString());
		
		Computer pc2 = new Computer("Dell", "Inspirion", "i7", 32, 1000);
		System.out.println("Computer pc2: brand = "+ pc2.getBrand() +", model = "+ pc2.getModel());
		System.out.println("Computer pc2: ram ="+ pc2.getRam());
		
		pc2.setRam(64);
		System.out.println("Computer pc2: "+ pc2.toString());
		
		System.out.println(pc1.executing("Eclipse") + "on pc1");
		System.out.println(pc2.executing("Discord") + "on pc2");
		}

}
