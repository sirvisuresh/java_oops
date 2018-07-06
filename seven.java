class animal
{
	public void print()
	{
	    System.out.println("this is animal");
	}

}
class dog extends animal
{
	public void print()
	{
		System.out.println("this is dog");
	}
}
class seven
{
	public static void main(String[] args) {
		animal original_animal = new animal();
		animal dog_animal = new dog();
		dog dog1 = new dog();
		//upcasting
		animal casted_animal = (animal)dog1;
		//downcasting
		dog casted_dog = (dog)dog_animal;
		//downcastin but it will throw exception
		try{dog error_dog = (dog)original_animal;}
		catch(Exception e)
          {
          	System.out.println("it is original animal so a super class object cannot be downcasted into subclass object like this");
          }
		}

	}
