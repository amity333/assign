import java.time.*;
import java.util.Scanner;

public class DatePeriod {

	public static void duration(int d,int m ,int y)
	{
		LocalDate pdate = LocalDate.of(y,m,d);
		LocalDate now = LocalDate.now();
		 
        Period diff = Period.between(pdate, now);
        System.out.println("days="+diff.getDays());
		System.out.println("months="+diff.getMonths());
		System.out.println("years="+diff.getYears());
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter day");
		int d=s.nextInt();
		System.out.println("enter month");
		int m=s.nextInt();
		System.out.println("enter year");
		int y=s.nextInt();
		duration(d,m,y);
		s.close();
		
      
		
	}

}
