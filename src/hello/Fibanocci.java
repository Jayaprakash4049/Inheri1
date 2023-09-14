package hello;

public class Fibanocci {

	public static void main(String args[])  
	{    
	 int j1=0,j2=1,j3,i,x=20;    
	 System.out.print(j1+" "+j2);//printing 0 and 1    
	    
	 for(i=2;i<x;++i)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  j3=j1+j2;    
	  System.out.print(" "+j3);    
	  j1=j2;    
	  j2=j3;    
	 }    
	  
	}

}
