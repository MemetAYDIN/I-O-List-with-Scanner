package com.aydin.io_List1;

public class Worker {
	
	private int WrkrId;
	private String WrkrName;
	private Company cmpnyWrkr;
	
	
	
	public int getWrkrId() {
		return WrkrId;
	}
	public void setWrkrId(int wrkrId) {
		WrkrId = wrkrId;
	}
	public String getWrkrName() {
		return WrkrName;
	}
	public void setWrkrName(String wrkrName) {
		WrkrName = wrkrName;
	}
	public Company getCmpnyWrkr() {
		return cmpnyWrkr;
	}
	public void setCmpnyWrkr(Company cmpnyWrkr) {
		this.cmpnyWrkr = cmpnyWrkr;
	}
	public Worker(int wrkrId, String wrkrName) {
		WrkrId = wrkrId;
		WrkrName = wrkrName;
	}
	public Worker() {
	}
	
	
	
	

}
