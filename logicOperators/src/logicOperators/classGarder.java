package logicOperators;
import java.util.Scanner;

public class classGarder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("What is calification of the student? (0-10)");
		double score = s.nextDouble();
		
		System.out.println(String.format("he score of the student is %s", calification(score)));
		
	s.close();	
	}
	
	static String calification(double value) {
		String score = "";
		if(value>=0 && value<=3) {
			score = "Failed";
		}else if(value>3 && value<=5) {
			score = "Insufficient";
		}else if(value>5 && value<=9) {
			score = "Good";
		}else if(value == 10) {
			score = "Excellent";
		}else {
			score = "Error!!";
		}
		return score;
		}
}
