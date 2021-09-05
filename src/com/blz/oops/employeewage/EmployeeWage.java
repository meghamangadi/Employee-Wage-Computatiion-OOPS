package com.blz.oops.employeewage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class EmployeeWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static Map<String, Integer> companyInfoMap = new HashMap<String,Integer>();
	public static List<CompanyEmpWage> EmpWageBuilder=new ArrayList<>();
	 public static int computeEmpWage(List<CompanyEmpWage> companies) {	
	 
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;	
		int totalEmpWage = 0;
		for(int i=0;i<=companies.size()-1;i++) {
			CompanyEmpWage comapany=companies.get(i);
			int empRatePerHour=comapany.getEmpRatePerHr();
			while (totalEmpHrs <= comapany.getMaxHrsPerMonth() && totalWorkingDays <comapany.getNoOfWorkingDays()) {
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
			
			 
			 totalEmpWage = totalEmpHrs * empRatePerHour;
			 comapany.setTotalWage(totalEmpWage);
			 System.out.println("company name :"+comapany.getCompanyName() +"	  No of Working Days :"+comapany.getNoOfWorkingDays() +
					 "	  Maximun hours per month :"+comapany.getMaxHrsPerMonth()+"	   Total Wages :"+comapany.getTotalWage());
			
		}		
			
		return totalEmpWage;
	}

	public static void main(String[] args) {
		System.out.println("Manage  Employee wage for Multiple companies");
		CompanyEmpWage companyJio=new CompanyEmpWage("JIO", 40, 21, 120);
		CompanyEmpWage companyWipro=new CompanyEmpWage("Wipro", 50, 24, 140);
		CompanyEmpWage companyTata=new CompanyEmpWage("TATA", 60, 25, 160);
		CompanyEmpWage companyHCL=new CompanyEmpWage("HCL", 50, 22, 130);
		EmpWageBuilder.add(companyJio);
		EmpWageBuilder.add(companyWipro);
		EmpWageBuilder.add(companyTata);
		EmpWageBuilder.add(companyHCL);
		computeEmpWage(EmpWageBuilder);
		
	}

}
