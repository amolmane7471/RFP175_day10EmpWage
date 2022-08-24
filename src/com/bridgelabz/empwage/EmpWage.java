package com.bridgelabz.empwage;
public class EmpWage {

	final int isFullTime = 1;
	final int isPartTime = 2;
	int empHrs;
	int totalEmpHrs = 0 ;
	int totalWorkingDays = 0 ;
	static int totalEmpWage ;
	
	public void computeEmpWage(String company ,int empWagePerHrs,int numOfWorkingDays,int maxHrsInMonth)
	{
	while(totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays ) {
		totalWorkingDays ++;
	int empcheck = (int) Math.floor(Math.random() * 10 % 3);
	switch(empcheck) {
	case isFullTime:
			System.out.println("Employee is Full Time Present");
			empHrs = 8;
			break;
	case isPartTime:
			System.out.println("Employee is Part Time Present");
			empHrs = 4;
			break;
	default :
		System.out.println("Employee is Absent");
		empHrs = 0;
		break;
	}
	totalEmpHrs += empHrs;
	System.out.println("day:"+totalWorkingDays+ " Emp Hr : " +totalEmpHrs);
	}
	totalEmpWage = totalEmpHrs * empWagePerHrs;
	  System.out.println("Total Emp Wage for company "+company+" is "+totalEmpWage);
	    System.out.println("***************");

	}
	
	public static void main(String args[]){
		System.out.println("<<< Welcome To Employee Wage computation program >>>");
		EmpWage attendance1 = new EmpWage();
		EmpWage attendance2 = new EmpWage();
		attendance1.computeEmpWage("DMart",20,5,30);
		attendance2.computeEmpWage("Reliance",10,10,50);
		
	}
}
