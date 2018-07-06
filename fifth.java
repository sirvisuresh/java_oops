interface software_eng
{
   public void work();
 }
interface manager
{
   public void work();
 }
 interface accountant
{
   public void work();
 }
 abstract class hr implements manager,accountant
 { abstract public void increase_overtime();
    public void responsibility()
    {
    	System.out.println("it has some responsibility");
    }
    public void work()
 	 {
 	 	System.out.println("Working");
    }
 }
 
 class fifth extends hr
 {
 	public void increase_overtime()
 	{
 		System.out.println("overtime will be increased");
 	}
    public static void main(String[] args) {
    	fifth obj = new fifth();
    	obj.work();
    	obj.responsibility();
    	obj.increase_overtime();
    }
 }

