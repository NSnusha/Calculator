package com.epam.maven_calci;

import java.util.Scanner;

public class Calculator {
	public double num1;
	public double num2;
	


	public Calculator(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the two numbers");
		Scanner scan = new Scanner(System.in);
		double num1= scan.nextDouble();
		
		double num2 = scan.nextDouble();
		System.out.println("Enter an operator");
		char operator = scan.next().charAt(0);
		Calculator calci = new Calculator();
		double ans;
		
		switch(operator){
		case'+':
			ans = calci.add(num1,num2);
			break;
			
		case '-':
			ans = calci.sub(num1,num2);
			break;
			
		case '*':
			ans = calci.mul(num1,num2);
			break;
		
		case '/':
			ans = calci.div(num1,num2);
			break;
			
		default:
			System.out.println("Incorrect operator");
			return;
		}
			
		System.out.println(num1 + " "+operator+" "+num2+" "+"="+" "+ ans);
			
		
		

	}
	private double div(double num1, double num2) {
		// TODO Auto-generated method stub
		return(num1/num2) ;
	}

	private double mul(double num1, double num2) {
		// TODO Auto-generated method stub
		return(num1*num2);
	}

	private double sub(double num1, double num2) {
		// TODO Auto-generated method stub
		return(num1-num2);
	}

	private double add(double num1, double num2) {
		// TODO Auto-generated method stub
		return(num1+num2);
	}

}



