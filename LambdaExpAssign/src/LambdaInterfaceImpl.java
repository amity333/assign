
public class LambdaInterfaceImpl {

	public static void main(String[] args) {
		
		LambdaInterface q1=(int x,int y)-> Math.pow(x, y);
		System.out.println("Greater no of two : "+q1.power(3,4));

		String newString="";int i=0;
		LambdaInterface q2=(String s) -> newString.concat(s); 
		
	}

}
