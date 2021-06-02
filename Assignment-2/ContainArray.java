package java_project_internship;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class ContainArray {

	
	public static void main(String []args)
	{
		int n=10;
		ArrayList<Integer> arr
        = new ArrayList<Integer>(n);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			arr.add(sc.nextInt());
		}
		Map<Integer, Integer> count=new HashMap<Integer,Integer>();
		
		for (int i = 0; i < 10; i++)
        {
            int key = arr.get(i);
            if (count.containsKey(key))
            {
                int flag = count.get(key);
                flag++;
                count.put(key, flag);
            } else
            {
                count.put(key, 1);
            }
        }
		
		for(Entry<Integer,Integer> val : count.entrySet())
        {
            System.out.println(val.getKey() + " occurs " + val.getValue() + " time");
        }
		
	}
}
