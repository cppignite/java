//Import scanner object
import java.util.Scanner;

public class GPACalculator {

	public static void main(String[] args){

		System.out.println("Welcome to GPA calculator!");
		System.out.println("Please input your grades one by one (enter -1 once finished): ");
		
		//Calculate GPA in the inputGrades method
		double GPA = inputGrades();
		//Calculate what the letter grade will be in the letterGradeCalculator method  
		char letterGrade = letterGradeCalculator(GPA);
		
		System.out.println("Your GPA is: " + GPA);
		System.out.println("Your letter grade is: " + letterGrade);
	}
	
	//InputGrades method will calculate what the GPA will be after
	//Receiving user inputs
	public static double inputGrades(){
		double input = 0;
		double total = 0;
		double count = 0;
		
		Scanner kb = new Scanner(System.in);
		
		//Until user enters -1 continue accepting input
		while (input != -1){
			input = kb.nextDouble();
			//As long as input is not -1, add to total count and increment counter
			if (input != -1){
				total += input;
				count++;	
			}
		}
		
		//Calculate GPA
		double GPA = total/count;
		
		//Return GPA to main method
		return GPA;
	}
	
	//LetterGradeCalculator method will receive GPA as an argument
	//And calculate what the letter will be based on GPA
	public static char letterGradeCalculator(double GPA){
		char letterGrade = ' ';
		
		//Based on what the GPA is, set what the letter grade will be
		if (GPA < 1.00)
			letterGrade = 'F';
		else if (GPA < 2.00)
			letterGrade = 'D';
		else if (GPA < 3.00)
			letterGrade = 'C';
		else if (GPA < 4.00)
			letterGrade = 'B';
		else if (GPA == 4.00)
			letterGrade = 'A';
		
		//Return letter grade back to main method
		return letterGrade;
	}
}