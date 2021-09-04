package com.blz.oops.employeewage;

public class EmployeeWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static int computeEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		     System.out.println("-----------------------------");
		    System.out.println("Company Name :" + company);
		    System.out.println("-----------------------------" );
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < noOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;

			System.out.println("Day :" + totalWorkingDays + "   Employee Hr: " + empHrs);
		}

		int totalEmpWage = totalEmpHrs * empRatePerHour;
		 System.out.println("-----------------------------");
		System.out.println("Total Employee Wage: " + totalEmpWage);
		 System.out.println("-----------------------------");
		return totalEmpWage;
	}

	public static void main(String[] args) {

		computeEmpWage("JIO", 40, 21, 120);
		computeEmpWage("Wipro", 50, 24, 140);
	}

}
