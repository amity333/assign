import java.io.*;
public class ReverseFileRead {
		
		    public static void main (String [] args)throws IOException
		    {
		    	File myFile=new File("C://cloudbatchdemo/RegexPattern/src/RegexDemo.java");
				try
				{
		        FileReader fr = new FileReader(myFile);
		        FileWriter fw = new FileWriter("reverse_output.txt");
		        BufferedReader br = new BufferedReader(fr);
		        BufferedWriter bw = new BufferedWriter(fw);
		         
		        String data;
		        
		        while ((data = br.readLine()) != null){
		            String[] words = data.split(" ");
		            for(String a: words){
		                StringBuilder builder=new StringBuilder(a);
		                System.out.print(builder.reverse().toString());
		                fw.write(builder.reverse().toString());
		                bw.newLine();
		                bw.flush();
		            }  
		        }
				}
				catch(Exception e) {
					e.printStackTrace();
				}

		        
	}

}


