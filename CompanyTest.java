package com.aydin.io_List1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CompanyTest {
	
	public static void main(String[] args) {
		
		String path1="/home/nemo/Desktop/Works/Java/Godoro/Company.txt";
		
		Scanner scnCmp=new Scanner(System.in);
		System.out.println("Company Id :\t");
		int CmpId=scnCmp.nextInt();
		System.out.println("Company Name: \t");
		String CmpName=scnCmp.next();
		
		Company cmpEmpl=new Company(CmpId,CmpName);
		cmpEmpl.setCmpEmplyList(new ArrayList<Employee>());
		
		System.out.println("Input Employee count: ");
		int empCount=scnCmp.nextInt();
		int empId=0;
		String EmpName=null;
		System.out.println("Company--->"+cmpEmpl.getCmpnyId()+" "+cmpEmpl.getCmpnyName());
		
		
		
		for(int i=0;i<empCount;i++)
		{
			System.out.println("Employee Id:\t");
			empId=scnCmp.nextInt();
			System.out.println("Employee Name:\t");
			EmpName=scnCmp.next();
			Employee emply1=new Employee(empId,EmpName);
			emply1.setEmplyList(cmpEmpl);
			cmpEmpl.getCmpEmplyList().add(emply1);
		}
		
		
		for(Employee emp:cmpEmpl.getCmpEmplyList())
		{
			System.out.println("Employee--->"+emp.getEmplid()+" "+emp.getEmplName());
		}
		//------------------------------------------------------
		//------------------------------------------------------
		//------------------------------------------------------
		//------------------------------------------------------
		//------------------------------------------------------
		try(BufferedWriter bfr=new BufferedWriter(new FileWriter(path1))) {
			
			bfr.write("Company--->"+cmpEmpl.getCmpnyId()+" "+cmpEmpl.getCmpnyName()+"\n");
			for(Employee emp:cmpEmpl.getCmpEmplyList())
			{
				bfr.write("\t"+"Employee--->"+emp.getEmplid()+" "+emp.getEmplName()+"\n");
			}
			bfr.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Yazma Yanlışı....");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
