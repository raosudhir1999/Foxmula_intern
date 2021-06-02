package java_project_internship;

import java.io.*;
import java.util.*;

public class HSet {

	
	public static void main(String []args)
	{
		int n=5;
		HashSet<Integer> arr = new HashSet<Integer>(n);
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<n;i++)
		{
			arr.add(sc.nextInt());
		}
		
		Iterator<Integer> itr=arr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}
}
