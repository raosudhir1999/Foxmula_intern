

class TestingQuadrilateral
public class AreaSolving{
    public static void main(String args[]){
      Square sq=new Square(10,20,20,10,10,20,20,10); 
	    
      System.out.println("area  of square is:"+sq.area());
	    
      Rectangle rec= new Rectangle(10,20,30,10,30,20,20,10);
	    
      System.out.println("area of rectangle is:"+rec.area());
	    
      Paralleogram para= new Paralleogram(10,20,30,10,30,0,20,10,20);
	    
      System.out.println("area of paralleogram is:"+para.area());
	    
      Trapezoid trap= new Trapezoid(10,20,30,10,30,0,20,10,20);
	    
      System.out.println("area  of trapezoid is:"+trap.area());
    }
}