package logicOperators;

import java.lang.Math;
import java.util.Scanner;

public class weightGuru {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("What is your height? (in m)");
		double height = s.nextDouble();
		
		System.out.println("What is your weight? (in kg)");
		double weight = s.nextDouble();
		s.close();
		
		System.out.println(String.format("ICM: %s. Your weight is %s",icm(height, weight), calculate(icm(height, weight))));
	}
	static double icm(double height, double weight) {
		double icm = weight/Math.pow(height, 2);
		return icm;
	}
	static String calculate(double icm) {
		String data = "";
		if(icm>=0 && icm<18.5) {
			data = "low";
		}else if(icm>=18.5 && icm<=24.9) {
			data = "normal. Good!!";
		}else if(icm>=25 && icm<=29.9) {
			data = "overweight";
		}else if(icm>=30){
			data = "obese";
		}else {
			data = "Error Input Data!!!";
		}
		return data;
	}

}
