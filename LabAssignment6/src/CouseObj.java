
public class CouseObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Courses course=Courses.SAP;
		Trainee trainee=new Trainee("Rohit",course);
		System.out.println("Below Details");
		System.out.println("name="+trainee.getTName());
		System.out.println("course="+trainee.getCourse());
	}

}
