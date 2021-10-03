package com.te.Assignment;

public class PrimeNumbers {
	
	public static void main(String[] args)
	 
	 {
	   for(int i=10;i<=50;i++)
	   {
	    int num=i;
		int a=2;
		while(a<=num/2)
		{
		  if(num%a==0)
		  {
		  
		    break;
		    
		  }
		  a++;
		}
	   if(a>num/2)
	   System.out.println(num);
	   }
	 }
	 

}
