package java_project_internship;

import java.io.*;
import java.util.*;

public class CustomExceptionNumber{

	
	public static void main(String []args) throws NumberNotFoundException
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check the valid no :");
		
		int no=sc.nextInt();
		
		boolean val=true;
		int rem;
		if (no == 1 || no == 0)
		{
            System.out.println(no+"::"+ " is Valid.");
        } 
		else
		{	
		for(int i = 2;i <no/2;i++) {
				
				if(no % i == 0) 
				{
					val = false;
					break;
				}
			}
			
		if(val && no % 2 != 0)
		{
			  
			throw new NumberNotFoundException(no+" :: "+"The number is invalid");
	    }
		else System.out.println(no+"The Number is valid ");
		
		}
		
	}
}
