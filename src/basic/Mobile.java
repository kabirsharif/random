package basic;

public class Mobile {
	
	// states: property
	String mobileName="iPhone";
	int mobileRamSize=12;
	int mobileMemorySize=256;
	static String mobileColor="Rose Golden";
	public int mobilePrice=1200;
	
	
	// behavior
	public void calling() {
		String mobileNumber="9557890809";
	//	System.out.println("My Mobile Number "+mobileNumber);
//		System.out.println("Using mobile phone we can call mahmud vai/brother");
//		System.out.println("Using mobile phone we can call mahmud vai/brother1");
//		System.out.println("Using mobile phone we can call mahmud vai/brother2");
//		System.out.println("Using mobile phone we can call mahmud vai/brother3");
//		System.out.println("Using mobile phone we can call mahmud vai/brother4");
		
	}
	
	public boolean isAvailable() {
		return false;
	}
	
	
	public static void main(String[] args) {
		
		// How to create an object?
		// className  objectName = new constructorOfClass();
		// using object we can call the states and behavior
		
		
		
		Mobile tajwarMobile = new Mobile();
		//tajwarMobile.mobileName;    not allowed
		System.out.println(tajwarMobile.mobileName); // allowed to call variable using object name to print the value
		
		tajwarMobile.mobileName="Samsung"; // allowed to call variable using object name to reAssign the variable value
		
		String newMobile= tajwarMobile.mobileName;
		System.out.println("New Mobile "+newMobile);
		
		System.out.println("*********************************************");
		
		tajwarMobile.calling(); // method is called by object name
		
		//System.out.println(tajwarMobile.calling());
		System.out.println(tajwarMobile.isAvailable());
		
	}
	
	
	
	

}
