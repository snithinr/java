package com.cvr.mngmt.tester;

import com.cvr.mngmt.pojos.*;

import java.util.Scanner;

public class Tester{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.PartWorkerEmployee");
		System.out.println("2.FullSalariedEmployee");
		System.out.println("3.exit");
		System.out.println("Enter your choice : ");
		int c;
		c = sc.nextInt();
		switch(c) {
		case 1 :   
			System.out.println("Enter id,Fname,Lname,city,state,country,pincode,No of Hours,Rate per Hour : ");
			int id = sc.nextInt();
			String fname = sc.next();
			String lname = sc.next();
			String city = sc.next();
			String state = sc.next();
			String country = sc.next();
			int pincode = sc.nextInt();
			int nof = sc.nextInt();
			int rpf = sc.nextInt();
			Address addr = new Address(city,state,country,pincode);
			Employee e1 = new PartWorkerEmp(nof,rpf);
			e1.setId(id);
			e1.setFname(fname);
			e1.setLname(lname);
			e1.setAddress(addr);
			int sal = e1.CalcSal();
			System.out.println(e1);
			System.out.println("Salary : "+sal);
			break;
		case 2 :
			System.out.println("Enter id,Fname,Lname,city,state,country,pincode,hra,basic,da: ");
			 id = sc.nextInt();
			 fname = sc.next();
			lname = sc.next();
			city = sc.next();
			state = sc.next();
			country = sc.next();
			pincode = sc.nextInt();
			int hra = sc.nextInt();
			int basic = sc.nextInt();
			int da =sc.nextInt();
			addr = new Address(city,state,country,pincode);
			Employee e2 = new FullSalEmp(hra,basic,da);
			e2.setId(id);
			e2.setFname(fname);
			e2.setLname(lname);
			e2.setAddress(addr);
			sal = e2.CalcSal();
			System.out.println(e2);
			System.out.println("Salary : "+sal);
			break;
		case 3 :
			break;
		}
	}
}