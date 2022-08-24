package com.bridgelabz.empwage;
public class EmpWage {

	final int isFullTime = 1;
	final int isPartTime = 2;
	final int empWagePerHrs = 20;
	final int numOfWorkingDays = 20;
	final int maxHrsInMonth = 100;
	int empHrs;
	int totalEmpHrs = 0 ;
	int totalWorkingDays = 0 ;
	static int totalEmpWage = 0;
	
	public int computeEmpWage() {
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
	return totalEmpWage;
	}
	
	public static void main(String args[]){
		System.out.println("<<< Welcome To Employee Wage computation program >>>");
		EmpWage attendance = new EmpWage();
		attendance.computeEmpWage();
		System.out.println("\n total Emp Wage is: "+totalEmpWage);
	}
}
