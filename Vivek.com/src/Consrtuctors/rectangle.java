package Consrtuctors;

public class rectangle {
	 int length;
	 int breadth;
	
	
	public  rectangle()
	{
		length=0;
		breadth=0;
		
		
	}
	
	public  rectangle(int l, int b)
	{
		length=l;
		breadth=b;
		
		
	}
	
	public  rectangle(int c)
	{
 		   
		length=c;
		breadth=c;
		
		
	}
	
	public  void areacal()
	{
		int area=length*breadth;
		System.out.println("the area is "+area);
	
	}
}
