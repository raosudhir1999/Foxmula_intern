import java.util.Scanner;

public class LinkedStack {
		private class Node {
	     int data; 
	     Node next; 
	}Node top;  
	
	LinkedStack()
     {
	     this.top = null; 
	 }
	
	boolean checkEmpty()
    {
        return (top == null);
    }

		void push(int data)  
	    {
	        Node temp = new Node();	//temporary node to store data 
	        temp.data = data;	        
	        temp.next = top;     
	        top = temp;
	    }
	
	void pop() 
	    {
	        if(checkEmpty())
	            System.out.println("\nStack Underflow");
	          
	        else {
	        	System.out.println("The popped element is:"+top.data);
	        	top = top.next;
	        }
	        
	}
	
	void Count(LinkedStack stack)
	    {
	        Node temp1 = this.top;
	        Node temp2 = stack.top;
	        int count = 0;
	        while (temp1 != null && temp2 != null)
	        {
	            count++;
	            temp1 = temp1.next;
	            temp2 = temp2.next;
	        }
	       if(count != 0 && temp1==null && temp2==null)
	    	   System.out.println("The number of elements in both the stack are equal i.e.= "+count);
	    	   
	    }
	
	void display()
	    {
	        if (checkEmpty())
	            System.out.println("\nStack Underflow");
	        
	        else {
	            Node temp = top;
	            while (temp != null) {           
	                System.out.print("\t "+temp.data);
	                temp = temp.next;
	            }
	        }
	    }
	
	 public static void main(String[] args)
	    {
	    	LinkedStack st1 = new LinkedStack();
	        LinkedStack st2 = new LinkedStack();
	        Scanner sc=new Scanner(System.in);   
	        int ch;
			do {
				System.out.println("1. Push Element in stack 1 ");
				System.out.println("2. Pop Element in stack 1 ");
				System.out.println("3. Push Element in stack 2 ");
				System.out.println("4. Pop Element in stack 2 ");
				System.out.println("Enter your choice? ");
				ch=sc.nextInt();
	            
				switch(ch){
				case 1:
					System.out.println("Enter the data you want to add to stack 1");
					st1.push(sc.nextInt());
	                break;
				case 2:
					st1.pop();
					st1.display();
					break;
				case 3:
					System.out.println("Enter the data you want to add to stack 2");
					st.push(sc.nextInt());

					break;
				case 4:
					st2.pop();
					st2.display();                    
					break;		
				default:
					System.out.println("Please enter a valid choice!!");
				}
				st.Count(stack2);
				System.out.println("\nDo you want to continue or end here (1.Yes/2.No)");
				ch=sc.nextInt();
			}while(ch==1);         

	    }
}
Terms