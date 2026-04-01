package org.anuja;

public class Enginner extends Employee
{
protected float overTime;
public Enginner(String name,String address,int age,boolean gender,float basicSalary,float overTime)
{
	super(name, age, gender, address, basicSalary);
	this.overTime=overTime;
}
public float getOverTime()
{
	return overTime;
}
public void setOverTime(float overTime)
{
	this.overTime=overTime;
}

/*
 * public void add(Enginner objEnginner) { // TODO Auto-generated method stub
 * 
 * }
 */
}
