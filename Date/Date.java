public class Date {
    public static void main(String[] args) {
        int choice;
        int day =0 , month = 0 , year =0;
        alterCalender objAltCalender = null;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Set Date");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Compare Date");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = ConsoleInput.getInt();

            switch(choice) {
                case 1:
                {
                	 System.out.print("Enter day: ");
                     day = ConsoleInput.getInt();
                     System.out.print("Enter month: ");
                     month = ConsoleInput.getInt();
                     System.out.print("Enter year: ");
                     year = ConsoleInput.getInt();

                    objAltCalender = new alterCalender(day, month, year);
                    System.out.println("Date set to: " + objAltCalender.getDay() + "/" + objAltCalender.getMonth() + "/" + objAltCalender.getYear());
                    break;
                }
                case 2:
                {
                    if(objAltCalender == null) {
                    	System.out.println("---First, Set a date---");
                    	System.out.print("Enter day: ");
                        day = ConsoleInput.getInt();
                        System.out.print("Enter month: ");
                        month = ConsoleInput.getInt();
                        System.out.print("Enter year: ");
                        year = ConsoleInput.getInt();

                      objAltCalender = new alterCalender(day, month, year);
                      System.out.println("Date set to: " + objAltCalender.getDay() + "/" + objAltCalender.getMonth() + "/" + objAltCalender.getYear());

                    }
                    System.out.print("Enter number of days to add: ");
                    int addDay = ConsoleInput.getInt();
                    objAltCalender.addDays(addDay);
                    System.out.println("Date set to: " + objAltCalender.getDay() + "/" + objAltCalender.getMonth() + "/" + objAltCalender.getYear());

                    break;
                }
                case 3:
                {
                	if(objAltCalender == null) {
                		System.out.println("---First, Set a date---");
                    	System.out.print("Enter day: ");
                        day = ConsoleInput.getInt();
                        System.out.print("Enter month: ");
                        month = ConsoleInput.getInt();
                        System.out.print("Enter year: ");
                        year = ConsoleInput.getInt();

                      objAltCalender = new alterCalender(day, month, year);
                      System.out.println("Date set to: " + objAltCalender.getDay() + "/" + objAltCalender.getMonth() + "/" + objAltCalender.getYear());

                    }
                    System.out.print("Enter number of months to add: ");
                    int addMonth = ConsoleInput.getInt();
                    objAltCalender.addMonth(addMonth);
                    System.out.println("Date set to: " + objAltCalender.getDay() + "/" + objAltCalender.getMonth() + "/" + objAltCalender.getYear());

                    break;
                }
                case 4:
                {
                	if(objAltCalender == null) {
                		System.out.println("---First, Set a date---");
                    	System.out.print("Enter day: ");
                        day = ConsoleInput.getInt();
                        System.out.print("Enter month: ");
                        month = ConsoleInput.getInt();
                        System.out.print("Enter year: ");
                        year = ConsoleInput.getInt();

                      objAltCalender = new alterCalender(day, month, year);
                      System.out.println("Date set to: " + objAltCalender.getDay() + "/" + objAltCalender.getMonth() + "/" + objAltCalender.getYear());

                    }
                    System.out.print("Enter number of years to add: ");
                    int addYear = ConsoleInput.getInt();
                    objAltCalender.addYears(addYear);
                    System.out.println("Date set to: " + objAltCalender.getDay() + "/" + objAltCalender.getMonth() + "/" + objAltCalender.getYear());

                    break;
                }
                case 5:
                {
                	if(objAltCalender == null) {
                		System.out.println("---First, Set a date---");
                    	System.out.print("Enter day: ");
                        day = ConsoleInput.getInt();
                        System.out.print("Enter month: ");
                        month = ConsoleInput.getInt();
                        System.out.print("Enter year: ");
                        year = ConsoleInput.getInt();

                      objAltCalender = new alterCalender(day, month, year);
                      System.out.println("Date set to: " + objAltCalender.getDay() + "/" + objAltCalender.getMonth() + "/" + objAltCalender.getYear());

                    }
                    objAltCalender.Compare_date();
                    
                    break;
                }
                case 6:
                {
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice. Try again.");
                }
            }

        } while(choice != 6);
    }
}
