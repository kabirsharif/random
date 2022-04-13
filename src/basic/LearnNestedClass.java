package basic;

public class LearnNestedClass {
	
	// nested class means: child class
	
	
	// class name : LearnNestedClass
	
	// Parent class
	
	int age=44;
	static String firstName="James";
	
	
	
	public static class Computer{
		// child class
		
		public String computerName="Mac";
		static int ram=16;
		
		public static void main(String[] args) {
			System.out.println("Child class");
			
			// Create an object
			Computer myComputer=new Computer();
			System.out.println(myComputer.computerName);
			
			System.out.println(Computer.ram);
			myComputer.computerDisplay();
			
			LearnNestedClass learn=new LearnNestedClass();
			System.out.println(learn.age);
			
		}
		
		public void computerDisplay() {
			System.out.println("This is computer display");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Parent class");
		
		
		Computer myCom=new Computer();
		System.out.println(myCom.computerName);
		System.out.println(Computer.ram);
		
	}
	
	

}
