package org.anuja;

public abstract class Employee
{
protected String name,address;
protected int age;
protected boolean gender;
protected float basic_Salary,house_Rent_Allowance;
Employee(String name,int age,boolean gender,String address,float basic_Salary)
{
super();
setName(name);
setAddress(address);
setGender(gender);
setBasic_Salary(basic_Salary);
setAge(age);
}

boolean validate_input(String name,int age,boolean gender,String address)
{
return ((age>=18 && age<=65) && (name!=null || name!=""|| name.length()>=1) && (address!=""));
}
public String getName()
{
return name;
}
public void setName(String name) 
{
//if(name==null || name.length()>5||name.equals(""))
//	name="Default";
//else 
	this.name = name;
}
public String getAddress() 
{
return address;
}
public void setAddress(String address)
{
if(address==null || address.equals(""))
	address="Default";
else 
	this.address = address;
}
public int getAge() 
{
return age;
}
public void setAge(int age) 
{
if(age<18 || age>65)
	age=18;
else
	this.age = age;
}
public boolean isGender() 
{
return gender;
}
public void setGender(boolean gender) 
{
this.gender = gender;
}
public float getBasic_Salary() 
{
return basic_Salary;
}
public void setBasic_Salary(float basic_Salary) 
{
if(basic_Salary<0)
		basic_Salary=10000;
else
		this.basic_Salary = basic_Salary;
}

}
