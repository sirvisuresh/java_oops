class shape
{   public double width;
	public double height;
	shape()
	{
		this.width=0;
		this.height=0;
	}
	shape(double width,double height)
       {  this.width=width;
       	  this.height=height;
       	}
   /* shape(int width)
       { this.width=width;
       	 this.height=height;
        }
        */

	public double getarea()
	  {   return width*height;
	  }
	public double getperimeter()
       {  return 2*(width+height);
           }	
}
class square extends shape
{  
	square(double width)
	{   
		super(width,width);
     }
 }
 class circle extends shape
 {  double r;
 	circle(double r)
 	{  
 	   this.r=r;
 	}
 	public double getarea()
 	{
 		return (3.14)*r*r;
 	}
 	public double getperimeter()
 	{
 		return 2*r*3.14;
 	}

 }
 class firstque
 {
 public static void main(String[] args)
 {
 	     shape obj1 = new square(5);
 	     square obj2 = new square(3);
 	     circle obj3 = new circle(4);
 	     System.out.println("for obj1  " + obj1.getarea()+" "+obj1.getperimeter());
 	     System.out.println("for obj2  " + obj2.getarea()+" "+obj2.getperimeter());
 	     System.out.println("for obj3  " + obj3.getarea()+" "+obj3.getperimeter());
 }
}