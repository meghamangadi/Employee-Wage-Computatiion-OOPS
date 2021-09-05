package com.blz.oops.employeewage;



public interface IComputeEmployeeWage {
	public void addCompanyEmpWage(String companyName, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth);
	public void computeEmpWage();

}
