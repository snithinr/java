package com.cvr.mngmt.pojos; 

import com.cvr.mngmt.pojos.Address;


public class Employee{
    private int id;
    private String fname;
    private String lname;
    private Address address;

    Employee(){
        super();
    }
    Employee(int id,String fname,String lname,Address address){
        super();
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
       
    }
    public void setId(int id){
        this.id = id;
    }
    public void setFname(String fname){
        this.fname = fname;
    }
    public void setLname(String lname){
        this.lname = lname;
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public int getId(){
        return id;
    }
    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }
    public Address getAddress(){
        return address;
    }
    public int CalcSal() {
		return 0;
	}
    public String toString(){
        return ("Employee : \n"+"id"+id+"\n"+"Fname : "+fname+"\n"+"Lname"+lname+"\n"+"Address"+address+"\n");
    }
}