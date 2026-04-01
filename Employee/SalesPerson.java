package org.anuja;



public class SalesPerson extends Employee
{
	 protected float comission;
	 public SalesPerson(String name,String address,int age,boolean gender,float basicSalary,float comission)
	 {
	 	super(name, age, gender, address, basicSalary);
	 	this.comission=comission;
	 }
	 public float getComission()
	 {
	 	return comission;
	 }
	 public void setComission(float overTime)
	 {
	 	this.comission=comission;
	 }
		/*
		 * public void add(SalesPerson objSalesPerson) { // TODO Auto-generated method
		 * stub
		 * 
		 * }
		 */
 }
