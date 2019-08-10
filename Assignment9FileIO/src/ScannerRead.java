import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerRead {
	
	public static void main(String[] args) {

	    File file = new File("C://cloudbatchdemo/numbers.txt");

	    try {

	        Scanner sc = new Scanner(file);
	        sc.useDelimiter("\\D");//to remove commas

	        while (sc.hasNextLine()) {
	        	int number = sc.nextInt();
	        	if(number %2==0)
	            System.out.println(number);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	 }
	}

