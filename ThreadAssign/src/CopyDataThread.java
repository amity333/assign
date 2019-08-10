import java.io.*;

public class CopyDataThread extends Thread {
	
	String file;
	public CopyDataThread(String file) {
		this.file=file;
	}

	public void copy10Chars() {
     try 
    {
       File fileIn  = new File(file);
       File fileOut = new File("target.txt");

       FileInputStream fis   = new FileInputStream(fileIn);
       FileOutputStream fos = new FileOutputStream(fileOut);
       DataOutputStream dos=new DataOutputStream(fos);

       int data=0;int i=1;
       while ((data =fis.read()) != -1 && i!=10) 
       {
    	   dos.write(data);i++;
    	   if(i==10)
    	   {
       System.out.println("10 characters are copied");
       Thread.currentThread().sleep(5000);
    	   }
       }
    }
    
    catch (FileNotFoundException e) 
    {
       e.printStackTrace();
    } 
    catch (IOException e) 
    {
       e.printStackTrace();
    } catch (InterruptedException e) {
		
		e.printStackTrace();
	}
}
}


