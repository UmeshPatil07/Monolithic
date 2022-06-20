package com.infy.dto;

public class EmployeeDTO {
	int empNo;
	String empName;
	int empSal;
	Office office;
	public EmployeeDTO() {
		super();
	}
	public EmployeeDTO(int empNo, String empName, int empSal, Office office) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
		this.office = office;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + ", office=" + office
				+ "]";
	}
	

}
