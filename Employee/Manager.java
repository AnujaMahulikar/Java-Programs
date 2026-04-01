package org.anuja;

public class Manager extends Employee
{
protected float house_Rent_Allowance;
public Manager(String name,String address,int age,boolean gender,float basic_Salary,float house_Rent_Allowance)
{
	super(name, age, gender, address, basic_Salary);

	setHouse_Rent_Allowance(house_Rent_Allowance);
}

public float getHouse_Rent_Allowance() 
{
return house_Rent_Allowance;
}
public void setHouse_Rent_Allowance(float house_Rent_Allowance)
{
if(house_Rent_Allowance<0)
	house_Rent_Allowance=5000;
else
	this.house_Rent_Allowance = house_Rent_Allowance;
}
public String display()
{
	return new StringBuffer().toString();
}

/*
 * public void add(Manager objManager) { // TODO Auto-generated method stub
 * 
 * }
 */
}