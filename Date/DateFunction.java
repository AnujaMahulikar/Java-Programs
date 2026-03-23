
public class DateFunction {
    private int day, month, year;
    
    public DateFunction(int day, int month, int year) {
    	 this.year = validateNSetYear(year);
    	 this.month = validateNSetMonth(month);
    	 this.day = validateNSetDay(day);
    }
    
    // Getter Method:
    int getDay(){
    	return this.day;
    }
    
    int getMonth(){
    	return this.month;
    }
    
    int getYear(){
    	return this.year;
    }
    
    int validateNSetDay(int day) {
    	if(day <= getDaysInMonth(this.month, this.year)) {
    		return day;
    	}
        return 1;
    }
    
    int validateNSetMonth(int month) {
    	if(month<= 12)
    	{
    		return month;	
    	}
    	return 1;
    }
    
    int validateNSetYear(int year) {
    	if(year >= 1700 && year <= 4000) 
		{
			 return year;
		}
		return 1700;
    }

/*
    public void setdate(int day, int month, int year) {
        
	        if(day < getDaysInMonth(month, year)) 
	        {
	        	this.day = day;
	        	if(month<= 12)
	        	{
	        		this.month = month;
	        		if(year >= 1700 && year <= 4000) 
	        		{
	        			 this.year = year;
	        		}
	        		else 
	        		// Year: Not in range:
	        		{
	        			this.year =1700;
	        		}	
	        	}
	        	else 
	        	// month >12
	        	{
	        		this.month =1;
	        		if(year >= 1700 && year <= 4000) 
	        		{
	        			 this.year = year;
	        		}
	        		else 
	        		// Year: Not in range:
	        		{
	        			this.year =1700;
	        		}	
	        	}
	        }
	        else {
	        	this.day = 1;
	        	if(month<= 12)
	        	{
	        		this.month = month;
	        		if(year >= 1700 && year <= 4000)
	        		{
	        			 this.year = year;
	        		}
	        		else 
	        		{
	        			this.year =1700;
	        		}	
	        	}
	        	else 
	        	// month >12
	        	{
	        		this.month =1;
	        		if(year >= 1700 && year <= 4000) 
	        		{
	        			 this.year = year;
	        		}
	        		else 
	        		// Year: Not in range:
	        		{
	        			this.year =1700;
	        		}	
	        	}
	        }
        }
*/


    
    private int getDaysInMonth(int m, int y) {
        int NoOfDaysInMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(m == 2) {
            if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                return 29;
            }
        }
        return NoOfDaysInMonth[m-1];
    }

    
    public void addDays(int addD) {
        this.day += addD;
        while(this.day > getDaysInMonth(this.month, this.year)) {
            this.day -= getDaysInMonth(this.month, this.year);
            (this.month)++;
            if(this.month > 12) {
                this.month = 1;
                (this.year)++;
            }
        }
//        System.out.println("New Date: " + day + "/" + month + "/" + year);
    }

   
    public void addMonth(int addM) {
        this.month += addM;
        while(this.month > 12) {
            this.month -= 12;
            (this.year)++;
        }
        
        if(this.day > getDaysInMonth(this.month, this.year)) {
            day = getDaysInMonth(this.month, this.year);
        }
//        System.out.println("New Date: " + day + "/" + month + "/" + year);
    }

    
    public void addYears(int addY) {
        this.year += addY;
        
        if(this.month == 2 && this.day > getDaysInMonth(this.month, this.year)) {
            this.day = getDaysInMonth(this.month, this.year);
        }
//        System.out.println("New Date: " + day + "/" + month + "/" + year);
    }

    
    public void Compare_date() {
        System.out.print("Enter day: ");
        int dd = ConsoleInput.getInt();
        System.out.print("Enter month: ");
        int mm = ConsoleInput.getInt();
        System.out.print("Enter year: ");
        int yy = ConsoleInput.getInt();

        if(day == dd && month == mm && year == yy) {
            System.out.println(" Equal.");
        } else {
            System.out.println("Not Equal.");
        }
    }
}
