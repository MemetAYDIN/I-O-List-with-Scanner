package com.aydin.io_List1;

import java.util.List;

public class Company {
	
	private int CmpnyId;
	private String CmpnyName;
	private List<Employee> cmpEmplyList;
	
	
	
	public int getCmpnyId() {
		return CmpnyId;
	}
	public void setCmpnyId(int cmpnyId) {
		CmpnyId = cmpnyId;
	}
	public String getCmpnyName() {
		return CmpnyName;
	}
	public void setCmpnyName(String cmpnyName) {
		CmpnyName = cmpnyName;
	}
	public List<Employee> getCmpEmplyList() {
		return cmpEmplyList;
	}
	public void setCmpEmplyList(List<Employee> cmpEmplyList) {
		this.cmpEmplyList = cmpEmplyList;
	}
	public Company(int cmpnyId, String cmpnyName) {
		CmpnyId = cmpnyId;
		CmpnyName = cmpnyName;
	}
	public Company() {
	}
	
	
	
	

}
