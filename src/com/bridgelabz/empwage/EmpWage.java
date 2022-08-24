package com.bridgelabz.empwage;
public class EmpWage {

	int isPresent = 1;
	
	public void computeEmpWage() {
	int empcheck = (int) Math.floor(Math.random() * 10 % 2);
	if(empcheck == isPresent)
	{
		System.out.println("Employee is Present");
	}
	else
	{
		System.out.println("Employee is Absent");
	}
	}

	public static void main(String args[]){
		System.out.println("<<< Welcome To Employee Wage computation program >>>");
		EmpWage attendance = new EmpWage();
		attendance.computeEmpWage();
	}
}
