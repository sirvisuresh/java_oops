package p;
 class example
{
    void display()
       {
           System.out.println("hello");
       }
    public void print()
    {
          System.out.println("this is public");
    }

    protected void printprotected()
    {
          System.out.println("this is protected");
    } 

    private void printprivate()
    {
          System.out.println("this is private");
    }
    public void newprint()
    {    System.out.println("its getting access from same class but ");
    	   printprivate();
    }

}
class another extends example
{
      	

}

 class eight

{
	public static void main(String[] args) {
		example obj = new example();
		obj.display();
		obj.print();
		obj.printprotected();
		obj.newprint();
	    another obj2 = new another();
	    obj2.display();
		obj2.print();
		obj2.printprotected();
		obj2.newprint();

	}
}