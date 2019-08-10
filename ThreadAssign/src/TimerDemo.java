import java.util.*;
import java.util.TimerTask;

public class TimerDemo extends Thread {
	
 
	public static void main(String args[]) {
	        long start = System.currentTimeMillis();
	        
	        for(int i=0;i<=10;i++) {
	        System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
	        try {
	        Thread.sleep(2000);
	        }
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        }
	        }
	        
	    }
	}

