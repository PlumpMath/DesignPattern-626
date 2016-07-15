package BuilderDesignPattern;

public class Shop {

	public static void main (String [] args)
	{
		
		
		
		//Phone p = new Phone("Android",2,"Qualcomm", 5.5, 3100);
		// Here we are passing 5 values. In this case all 5 values are mandatory we can skip some values.
				// To avoid this issue instead of passing five Value we can use builder pattern
		
		Phone p = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
			// Using Builder pattern we can pass only required field and other values will be assign as default values.
				//Also we don't need to follow sequence or anything.
	
		System.out.println(p);
		
		
		
	}
}
