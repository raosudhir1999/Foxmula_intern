package java_project_internship;

import java.io.*;
import java.util.*;
import java.util.TreeSet;
public class TSet {

	
	public static void main(String []args)
	{
		int n=5;
		TreeSet<Integer> arr = new TreeSet<Integer>();
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
