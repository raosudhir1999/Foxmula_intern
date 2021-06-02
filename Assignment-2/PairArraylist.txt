package java_project_internship;

import java.io.*;
import java.util.*;

public class PairArraylist {

	
	public static void main(String []args)
	{
		int n=5;
		int sum=6;
		ArrayList<Integer> arr
        = new ArrayList<Integer>(n);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			arr.add(sc.nextInt());
		}
		
		int flag = 0; 
		 
	    for (int i = 0; i < n; i++)
	        for (int j = i + 1; j < n; j++)
	            if (arr.get(i) + arr.get(j) == sum)
	            { System.out.println("("+arr.get(i)+ ","+ arr.get(j) +")");
	            }
		
	}
}
