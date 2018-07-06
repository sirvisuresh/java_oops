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
}
 class eight
{
	public static void main(String[] args) {
		example obj = new example();
		example.display();
		example.print();
		example.printprotected();
		example.printprivate();
		
	}
}