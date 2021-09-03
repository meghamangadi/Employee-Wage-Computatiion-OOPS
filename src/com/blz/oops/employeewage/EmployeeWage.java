package com.blz.oops.employeewage;

public class EmployeeWage {
	public static void main(String[] args) {
		welcome();
		attendanceCheck();
	}

	static void welcome() {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	}

	static void attendanceCheck() {
		int isFullTime = 1;
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (empCheck == isFullTime)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
}
