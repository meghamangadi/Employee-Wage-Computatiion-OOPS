package com.blz.oops.employeewage;

public class EmployeeWage {
	public static void main(String[] args) {

		welcome();
		emopDailyWage();
	}

	static void welcome() {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	}

	static void emopDailyWage() {
		int Is_Part_Time = 1;
		int Is_Full_Time = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		if (empCheck == Is_Part_Time)
			empHrs = 4;
		else if (empCheck == Is_Full_Time)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee_wage:" + empWage);
	}
}
