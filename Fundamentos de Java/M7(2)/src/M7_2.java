import java.util.ArrayList;
import java.util.Scanner;

public class M7_2 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		ArrayList<Float> grades = new ArrayList<Float>();
		
		System.out.println("How many grades would you like to enter?");
		byte numGrades = data.nextByte();
		
		grades = avGrade(numGrades);
		
		//showMessage(grades);
		
		System.out.println("The average grade of the class is:"+grades);
		
		data.close();
	}

	/*private static void showMessage(ArrayList<Float> grades) {
		
		System.out.println(grades);
		if (grades < 5) {
			System.out.println("The average grade of the class is suspended. Students should ask their questions and work harder.");
		} else if (grades < 7) {
			System.out.println("The average grade in the class is good, but students should improve personal work.");
		} else {
			System.out.println("Congratulations! The grade point average for the class corresponds to the effort made.");
		}
	
		
	}*/

	public static ArrayList<Float> avGrade(int numGrades) {
		
		Scanner data = new Scanner(System.in);
		ArrayList<Float> grades = new ArrayList<Float>();
		
		int i = 0;
		float total = 0f;
		float grade;
		float minGrade = 0f;
		float maxGrade = 10f; 
		
		while (i < numGrades) {
			System.out.println("Enter grade " + (i + 1) + ": ");
			grade = data.nextFloat();
			
			if (grade >= 0 && grade <= 10) {
				if (grade > maxGrade) {
					maxGrade = grade;
				}
				if(grade < minGrade) {
					minGrade = grade;
				}
				total += grade;
				i++;
			} else {
				System.out.println("Grade must be between 0 - 10");
			}
		}
		total = total / numGrades;
		grades.add(minGrade);
		grades.add(maxGrade);
		grades.add(total);
		
		data.close();
		return grades;
	}
}