package org.anuja;

public class Program 
{
	public static void main(String[]args)
	{
		Employee objEmployee= new Manager(null, null, 0, false, 0, 0);
		int choice=0;
		int subchoice=0;
		final int MENU_ADD=1;
		final int MENU_DISPLAY=2;
		final int MENU_SORT=3;
		final int MENU_EXIT=4;
		int count=0;
		int next_count=0;
		Employee [] arrEmployee=new Employee[100];
		int indexEmployee=0;
		do 
		{
			System.out.println("1.Add \n 2.Display\n 3.Sort \n 4.Exit");
			System.out.println("Enter your choice");
			choice=ConsoleInput.getInt();
			switch(choice)
			{
			case MENU_ADD:
			{
				final int MANAGER_CASE=1,ENGINEER_CASE=2,SALESMAN_CASE=3,EXIT_MENU=4;
				do {
					
					System.out.println("1.Manager\n 2.Engineer\n 3.salesPerson 4.Exit\n Enter choice: ");
					subchoice=ConsoleInput.getInt();

					if(subchoice>=1 && subchoice<=3)
					{
						System.out.println("Enter the name");
						String nameString=ConsoleInput.getString();
						System.out.println("Enter the age");
						int ageInt=ConsoleInput.getInt();
						System.out.println("Enter the address");
						String addressString=ConsoleInput.getString();
						System.out.println("Enter the gender");
						String tmp=ConsoleInput.getString();
						boolean gender=Boolean.parseBoolean(tmp);
						System.out.println("Enter Basic Salary");
						float basicSalaryInt=ConsoleInput.getFloat();

						switch(subchoice)
						{
						case MANAGER_CASE:
						{
							System.out.println("Enter HRA");
							float hra=ConsoleInput.getFloat();
							arrEmployee[indexEmployee++]=new Manager(nameString,addressString,ageInt,gender,basicSalaryInt,hra);
						}
						break;

						case ENGINEER_CASE:
						{
							System.out.println("Enter the over time");
							float ot=ConsoleInput.getFloat();
							arrEmployee[indexEmployee++]=new Enginner(nameString,addressString,ageInt,gender,basicSalaryInt,ot);
						}
						break;

						case SALESMAN_CASE:
						{
							System.out.println("Enter the commision");
							float comission=ConsoleInput.getFloat();
							arrEmployee[indexEmployee++]=new SalesPerson(nameString,addressString,ageInt,gender,basicSalaryInt,comission);
						}
						break;
						}
					}

				}while (subchoice!=4);
			}
			break;

			case MENU_DISPLAY:
			{
				int menu_choice=0;
				do
				{
					System.out.println("1.All_Employee \n 2.First_Employee \n 3.Next_Employee 4.Previous_Employee 5.Last_Employee \n 6.Exit\n Enter your choice");
					menu_choice=ConsoleInput.getInt();
					final int All_Employee=1,First_Employee=2,Next_Employee=3,Previous_Employee=4,Last_Employee=5;
					switch(menu_choice)
					{
					case All_Employee:
					{
						for(int iTmp=0;iTmp<indexEmployee;iTmp++)
						{
							System.out.println("Name: "+arrEmployee[iTmp].getName());
							System.out.println("Address :"+arrEmployee[iTmp].getAddress());
							System.out.println("Age :"+arrEmployee[iTmp].getAge());
							System.out.println("Gender: "+arrEmployee[iTmp].isGender());
							System.out.println("Basic_Salary"+arrEmployee[iTmp].getBasic_Salary());
							if(arrEmployee[iTmp] instanceof Manager)
							{
								Manager objManager=(Manager) arrEmployee[iTmp];
								System.out.println("HRA:"+objManager.getHouse_Rent_Allowance());
							}
							else if(arrEmployee[iTmp] instanceof Enginner)
							{
								Enginner objEnginner=(Enginner)arrEmployee[iTmp];
								System.out.println("OT:"+objEnginner.getOverTime());
							}
							else if(arrEmployee[iTmp] instanceof SalesPerson)
							{
								SalesPerson objSalesPerson=(SalesPerson)arrEmployee[iTmp];
								System.out.println("OT:"+objSalesPerson.getComission());
							}
						}
					}
					break;

					case First_Employee:
					{
						System.out.println("Name: "+arrEmployee[count].getName());
						next_count=count;
					}
					break;

					case Next_Employee:
					{
						System.out.println("Name: "+arrEmployee[next_count].getName());
						next_count++;
					}
					break;

					case Last_Employee:
					{
						int counts=indexEmployee-1;
						System.out.println("Name: "+arrEmployee[counts].getName());
					}
					break;
					}
				}while(menu_choice!=6);
			}
			break;   

			case MENU_SORT:
			{
				Linklist sortList = new Linklist();

				
				for(int i=0;i<indexEmployee;i++)
				{
					sortList.add(arrEmployee[i]);
				}

				int ch3 = 0;
				do {
					System.out.println("1.Managers\n2.Engineers\n3.Sales\n4.Asc\n5.Desc\n6.Exit");
					ch3 = ConsoleInput.getInt();

					switch (ch3) {

					case 1:
						sortList.displayByType("Manager");
						break;

					case 2:
						sortList.displayByType("Engineer");
						break;

					case 3:
						sortList.displayByType("SalesPerson");
						break;

					case 4:
						sortList.sortByName(true);
						sortList.displayAll();
						break;

					case 5:
						sortList.sortByName(false);
						sortList.displayAll();
						break;
					}

				} while (ch3 != 6);
			}
			break;

			}

		}while(choice!=4);   
	}
}