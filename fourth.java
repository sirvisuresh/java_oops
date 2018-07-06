public class fourth
{
      int id;
      fourth(int id)
      {
        this.id=id;
      }


 
// Overriding hashCode() method 
    public int hashCode()
    {
        return id;
    }
 
    public static void main(String args[])
    {
        fourth e = new fourth(7);
 
        System.out.println(e.hashCode());
    }
}