import java.util.Scanner;
public class learning {
		public static void main(String args[]){
			 Scanner input=new Scanner(System.in);
		        System.out.println("Enter a word or a string of words");
		        String word=input.nextLine();
		        Sutff(word);
		        
		        

		}
		        
		        
		        public static void Sutff(String inputword){
			        int count=0;
			        String temp="";

		        for(int i=0;i<inputword.length();i++)
		        {
		            char c=inputword.charAt(i);  
		            for(int j=i;j<inputword.length();j++)
		            {
		                char k=inputword.charAt(j);  
		                if(c==k && temp.indexOf(c)==-1)                                                                          
		                {
		                	
		                    count=count+1;
		                }
		            }

		             if(temp.indexOf(c)==-1)
		             {
		            temp=temp+c; 
		System.out.println("Character   " + c + "   occurs   " + count + "    times");
		             }  
		              count=0;
	}}}