import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PersonPropsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		try {
			FileReader fr=new FileReader("PersonProps.properties");
			
			Properties myProps=new Properties();
			myProps.load(fr);
			Enumeration myEnumKey=myProps.keys();
			
			while(myEnumKey.hasMoreElements())
			{
				String propName=(String)myEnumKey.nextElement();
				System.out.println(propName+" : "+myProps.getProperty(propName));
			}
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
	}

}
