import java.util.Scanner;

public class M4_6 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		System.out.println("enter birth month:");
		int month = data.nextByte();
		System.out.println("enter birth day (DD):");
		int day = data.nextByte();
		data.close();
		switch (month) {
		case 1: 
			if(month == 1) {
				if (day < 20)
					System.out.println("Your star sign is: Capricorn");	
				else
					System.out.println("Your star sign is: Aquarius");
				}
				break;
		case 2:
			if(month == 2) {
				if (day < 18)
					System.out.println("Your star sign is: Aquarius");	
				else
					System.out.println("Your star sign is: Pisces");
				break;
			}
		case 3:
			if(month == 3) {
				if (day < 20)
					System.out.println("Your star sign is: Pisces");	
				else
					System.out.println("Your star sign is: Aries");
			}
				break;
		case 4:
			if(month == 4) {
				if (day < 19)
					System.out.println("Your star sign is: Aries");	
				else
					System.out.println("Your star sign is: Taurus");
			}
				break;
		case 5:
			if(month == 5) {
				if (day < 20)
						System.out.println("Your star sign is: Taurus");	
				else
					System.out.println("Your star sign is: Gemini");
			}
				break;
		case 6:
			if(month == 6) {
				if (day < 20)
					System.out.println("Your star sign is: Gemini");	
				else
					System.out.println("Your star sign is: Cancer");
			}
				break;
		case 7:
			if(month == 7) {
				if (day < 22)
					System.out.println("Your star sign is: Cancer");	
				else
					System.out.println("Your star sign is: Leo");
			}
				break;
		case 8:
			if(month == 8) {
				if (day < 22)
					System.out.println("Your star sign is: Leo");	
				else
					System.out.println("Your star sign is: Virgo");
			}
				break;
		case 9:
			if(month == 9) {
				if (day < 22)
					System.out.println("Your star sign is: Virgo");	
				else
					System.out.println("Your star sign is: Libra");
			}
				break;
		case 10:
			if(month == 10) {
				if (day < 22)
					System.out.println("Your star sign is: Libra");	
				else
					System.out.println("Your star sign is: Scorpio");
			}
				break;
		case 11:
			if(month == 11) {
				if (day < 21)
					System.out.println("Your star sign is: Scorpio");	
				else
					System.out.println("Your star sign is: Sagittarius");
			}
				break;
		case 12:
			if(month == 12) {
				if (day <= 20)
					System.out.println("Your star sign is: Sagittarius");	
				else
					System.out.println("Your star sign is: Capricorn");
			}
				break;
		default: 
			System.out.println("You have entered an incorrect date");
		}
	}
}
