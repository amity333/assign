
public class FileProgram extends Thread {

	
	public static void main(String[] args)  {
		
		CopyDataThread cdt=new CopyDataThread("source.txt");
		cdt.start();
		
	}

	

}
