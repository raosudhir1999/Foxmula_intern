package java_project_internship;
import java.util.Map.Entry;
import java.io.*;
import java.util.*;

public class FrequencyOccurance{
	
	 public void printing(HashMap<Integer, Integer> vv)
	 {
	        Set<Entry<Integer, Integer>> entries = vv.entrySet();
	        
	        ArrayList<Entry<Integer, Integer>> din = new ArrayList<>(entries);
	        
	        Collections.sort(din, new Comparator<Entry<Integer, Integer>>() {
	            
	            public int compare(Entry<Integer, Integer> f, Entry<Integer, Integer> g) {
	                return f.getValue().compareTo(g.getValue());
	            }});
		din.forEach(value -> System.out.print(value.getKey()+"::"));
	    }
	
	public void CountOccur(ArrayList<Integer> nopp) {
        
		HashMap<Integer, Integer> mapp = new HashMap<>();
		int length=nopp.size();
		
        for (int i = 0; i < length; i++)
        {
            if (!mapp.containsKey(nopp.get(i))) 
            {
                mapp.put(nopp.get(i), 1);
            } 
            else
            {
                mapp.put(nopp.get(i), mapp.get(nopp.get(i)) + 1);
            }
            
        }

        for (Map.Entry<Integer, Integer> e : mapp.entrySet())
        {
            System.out.print(e.getKey() + "::" + e.getValue() +"   ");
        }
        

        printing(mapp);
    }
	
	public static void main(String []args) throws NumberNotFoundException
	{
		int n=5;
		ArrayList<Integer> arr = new ArrayList<Integer>(n);
		
		Scanner sc=new Scanner(System.in);
	    
		System.out.println("Scan the array ::");
		for(int i=0;i<n;i++)
		{
		arr.add(sc.nextInt());
		}
		FrequencyOccurance obj = new FrequencyOccurance();
	        obj.CountOccur(arr);
         
    }  
	
}
