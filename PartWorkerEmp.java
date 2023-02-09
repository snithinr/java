package com.cvr.mngmt.pojos;

import com.cvr.mngmt.pojos.Employee;
import com.cvr.mngmt.pojos.Address;

public class PartWorkerEmp extends Employee{
	private int noofHours;
	private int rateperHour;
	public PartWorkerEmp(int nop,int rate) {
		this.noofHours = nop;
		this.rateperHour = rate;
	}
	public void setNoofHours(int noh) {
		this.noofHours = noh;
	}
	public void setRatePerHour(int rph) {
		this.rateperHour = rph;
	}
	public int getNoofHours() {
		return noofHours;
	}
	public int getRatePerHour() {
		return rateperHour;
	}
	public int CalcSal() {
		return noofHours * rateperHour;
	}
}