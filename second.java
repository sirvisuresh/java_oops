class general
{   //this is method overloading
	String name;
	general(String name)
	{
		this.name = name;
	}

	public double cal(double a,double b)
	{
		return a*b;
	}
	public double cal(double a)
	{
		return a*a;
	}
}
class one extends general
{ 
   String type;
   one(String name,String type)
   { super(name);
   	 this.type=type;
   	}
   //this is method overriding and it will override the area method of general which is taking two arguments
   public double cal(double a,double b)
   {  
      return a*a*b*b;
   }
}
class second{
public static void main(String[] args) {
                general obj1 = new general("car");
                one obj2 = new one("car","honda");

}
}