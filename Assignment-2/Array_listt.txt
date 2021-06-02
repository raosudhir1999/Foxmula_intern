package java_project_internship;

import java.io.*;
import java.util.*;

public class Array_listt {

	
	public static void main(String []args)
	{
		int n=5;
		ArrayList<Integer> arr
        = new ArrayList<Integer>(n);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			arr.add(sc.nextInt());
		}
		 boolean retval = arr.contains(12); 
	        
	      if (retval == true) {
	         System.out.println("Element 12 is contained");
	      } else {
	         System.out.println("Element 12 is not contained");
	      }
		for(int i=0;i<n;i++)
		{
		System.out.println(arr.get(i));
		}
	}
}
