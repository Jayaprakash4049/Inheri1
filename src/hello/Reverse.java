package hello;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       
	        String str= "Jayaprakash", nstr="";
	        char ch;
	       
	   
	      System.out.println("Welcome to shimach"); 
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i);   //extracts each character
	        nstr= ch+nstr;   //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }
	}


