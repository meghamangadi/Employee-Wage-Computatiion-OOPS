package com.blz.oops.employeewage;

import java.util.HashMap;
import java.util.Map;



public class EmployeeWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static Map<String, Integer> companyInfoMap = new HashMap<String,Integer>();
	public static int computeEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
		
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;		 
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

		}

		int totalEmpWage = totalEmpHrs * empRatePerHour;			
		companyInfoMap.put(company, totalEmpWage);	
		return totalEmpWage;
	}

	public static void main(String[] args) {

		computeEmpWage("JIO", 40, 21, 120);		
		computeEmpWage("Wipro", 50, 24, 140);
		System.out.println("Company Name And Total Wages:" + companyInfoMap);
		
	}

}
