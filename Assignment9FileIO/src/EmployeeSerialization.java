import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of employees");
		int count=s.nextInt();
		
		Employee e1[]=new Employee[count];
		try {
			
			FileOutputStream fos=new FileOutputStream("Employeeinfo.obj");//destination file object Empinfo
			
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			for(int i=0;i<count;i++) {
			
			System.out.println("enter empid"+i+1);
			int empId=s.nextInt();
			
			System.out.println("enter empname"+i+1);
			String eName=s.next();
			
			System.out.println("enter empsal"+i+1);
			float eSal=s.nextFloat();
			
			e1[i]=new Employee(empId,eName,eSal);
			oos.writeObject(e1[i]);
			System.out.println("Details Written for object"+(i+1));
			System.out.println("Employee "+i+1+" details : "+empId+" "+eName+" "+eSal);
			}
			
		}
			catch(IOException e) {
				e.printStackTrace();
			}
	}

}
