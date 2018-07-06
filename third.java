class exception extends Exception
{
    public exception(String s)
    {
        super(s);
    }
}
 
public class third
{
    public static void main(String args[])
    {
        try
        {
            throw new exception("hi i am suresh");
        }
        catch (exception ex)
        {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
