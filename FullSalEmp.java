package com.cvr.mngmt.pojos;

import com.cvr.mngmt.pojos.Employee;

public class FullSalEmp extends Employee{
	private int hra;
	private int basic;
	private int da;
	public FullSalEmp(int hra,int basic,int da) {
		this.hra = hra;
		this.basic = basic;
		this.da = da;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getHra() {
		return this.hra;
	}
	public int getBasic() {
		return this.basic;
	}
	public int getDa() {
		return this.da;
	}
	public int CalcSal() {
		return hra+da+basic;
	}
}