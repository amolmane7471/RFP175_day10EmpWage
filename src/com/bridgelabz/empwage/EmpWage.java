package com.bridgelabz.empwage;
public class EmpWage {

	int isFullTime = 1;
	int isPartTime = 2;
	int empHrs ;
	int empWagePerHrs = 20;
	int empWage;
	
	public void computeEmpWage() {
	int empcheck = (int) Math.floor(Math.random() * 10 % 3);
	if(empcheck == isFullTime)
	{
		System.out.println("Employee is Full Time Present");
		empHrs = 8;
		empWage = empHrs * empWagePerHrs;
		System.out.println("daily Emp Wage Is : "+empWage);
	}
	else if(empcheck == isPartTime)
	{
		System.out.println("Employee is Part Time Present");
		empHrs = 4;
		empWage = empHrs * empWagePerHrs;
		System.out.println("daily Emp Wage Is : "+empWage);
	}
	else
	{
		System.out.println("Employee is Absent");
		empHrs = 0;
		empWage = empHrs * empWagePerHrs;
		System.out.println("daily Emp Wage Is : "+empWage);
	}
	}

	public static void main(String args[]){
		System.out.println("<<< Welcome To Employee Wage computation program >>>");
		EmpWage attendance = new EmpWage();
		attendance.computeEmpWage();
	}
}
