/*Create a method which can perform a particular String operation based on the user’s choice. 
 * The method should accept the String object and the user’s choice and return the output of the operation.
Options are
 Add the String to itself
 Replace odd positions with #
 Remove duplicate characters in the String
 Change odd characters to upper case  */


package com.string1;
import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {

           int ch;
           Scanner sc = new Scanner(System.in);
          // ch=sc.nextInt();
           
           System.out.println("enter the string :");
           String str=sc.nextLine();
           System.out.println("enter the string :");
           String str1=sc.nextLine();
          
          
           System.out.println("Enter your choice : ");
        
           System.out.println("1.add the string \n2.replace odd positions with # \n3.remove duplicate character \n4.change odd character to upper case\n");
           ch=sc.nextInt();
           
           
           do
           {
              switch(ch)
              {
                
	              case 1: 
	                      String s3 = str.concat(str1);
	                      System.out.println(s3);
	                      break;
                      
	              case 2: int i=0;
	                      while(i<str.length())
	                      { 	  if(i%2==0)
	                               System.out.print("#");
	                    	      else
	                    	        System.out.print(str.charAt(i));
	                               i++;
	                      }      
	                      break;
	                    	 
	                      
	              case 3: StringBuilder sb = new StringBuilder();
	                      int idx;
	            	       for(i=0;i<str.length();i++)
	                       {
	            	           char c = str.charAt(i);
	            	           idx = str.indexOf(c,i+1);
	            	           if(idx==-1)
	            	        	   sb.append(c);
	                       }
	                       System.out.println(sb);
	                       break;
	                      
	              case 4: int j=0;
	                      char a;
                           while(j<str.length())
			                  { 	  if(j%2==0)
			                	      {a=str.charAt(j);
			                           System.out.print((char)(a-32));
			                	      }else
			                	        System.out.print(str.charAt(j));
			                           j++;
			                  }      
                  break;
              }
           }while(ch==0);

	}

}
