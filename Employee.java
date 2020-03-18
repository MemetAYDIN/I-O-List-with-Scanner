package com.aydin.io_List1;

public class Employee {
	
	private int Emplid;
	private String EmplName;
	private Company emplyList;
	
	
	public int getEmplid() {
		return Emplid;
	}
	public void setEmplid(int emplid) {
		Emplid = emplid;
	}
	public String getEmplName() {
		return EmplName;
	}
	public void setEmplName(String emplName) {
		EmplName = emplName;
	}
	public Company getEmplyList() {
		return emplyList;
	}
	public void setEmplyList(Company emplyList) {
		this.emplyList = emplyList;
	}
	public Employee(int emplid, String emplName) {
		Emplid = emplid;
		EmplName = emplName;
	}
	public Employee() {
	}
	
	
	

}
