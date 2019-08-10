
public class Date {

	int intDay, intMonth, intYear;
	// Constructor
	Date(int intDay, int intMonth, int intYear) {
	this.intDay = intDay;
	this.intMonth = intMonth;
	this.intYear = intYear;
	}
	// setter and getter methods
	void setDay(int intDay)
	{
	this.intDay = intDay;
	}
	int getDay( )
	{
	return this.intDay;
	}
	void setMonth(int intMonth)
	{
	this.intMonth = intMonth;
	}
	int getMonth( )
	{
	return this.intMonth;
	}
	void setYear(int intYear)
	{
	this.intYear=intYear;
	}
	int getYear( )
	{
	return this.intYear;
	
}
	@Override
	public String toString() {
		return "Date [intDay=" + intDay + ", intMonth=" + intMonth + ", intYear=" + intYear + "]";
	}


}