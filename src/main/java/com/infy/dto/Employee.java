package com.infy.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_tbl")
public class Employee {
	@Id
	@Column(name="empNo")
	int empNo;
	@Column(name="empName", length=20)
	String empName;
	@Column(name="empSal")
	int empSal;
	@OneToOne(cascade = CascadeType.ALL)
	Office office;
	public Employee() {
		super();
	}
	public Employee(int empNo, String empName, int empSal, Office office) {
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
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + ", office=" + office + "]";
	}
	

}
