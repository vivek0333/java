

public class methodoverloading {


void area(int base, int height, float A )
{
	int area = (int)( base *height*A);
	System.out.println("area of triangle is :"+area);
}

void area (int length ,int breadth) 
{
	int area = length *breadth;
	System.out.println("area of rect is :"+area);
	
}


 void area (int side ) 
 {
	 int area = side*side;
	 System.out.println("area of square is :"+side);
 }












}

