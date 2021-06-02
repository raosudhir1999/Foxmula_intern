

class Time
{
	private int hour,min,sec;
	
	public Time(int hour,int min,int sec)
	{
		this.hour=hour;
		this.min=min;
		this.sec=sec;
		
	}
	
	public Time add(Time tt) 
	{
		Time ttl=new Time(0,0,0);
		ttl.hour=this.hour+tt.hour;
		ttl.min=this.min+tt.min;
		ttl.sec=this.sec+tt.sec;
		
		return ttl;
		
	}
	 public void display()
	 {
		 System.out.println("Hour"+this.hour);
		 System.out.println("Min"+this.min);
		 System.out.println("sec"+this.sec);
	 }

}

public class time_obj {

	public static void main(String args[])
	{
		
		Time t1=new Time(10,15,20);
		Time t2=new Time(2,10,6);
		
		 System.out.println("The hour min and sec of t1 ");
		 t1.display();
		 System.out.println("The hour min and sec of t2 ");
		 t2.display();
		 System.out.println("The hour min and sec of added t1 and t2");	
		Time t3= t1.add(t2);
		 t3.display();
		 
	}
}