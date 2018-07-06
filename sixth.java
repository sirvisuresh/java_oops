class vechile {
    public void start() {
        System.out.println("this is vehicle");
    }
}
class car extends vechile {
    //method overriding
    public void start() {
        System.out.println("this is car");
    }
}
public class sixth {   
    public static void main(String args[]) {
        vechile vechile1 = new car(); 
        vechile1.start(); 
        //compiler will not know which method will be called at compile time.it will be resolved at run time.so it it called dynamic binding.
    }
}
