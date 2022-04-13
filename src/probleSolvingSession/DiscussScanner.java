package probleSolvingSession;

import java.util.Scanner;

public class DiscussScanner {
	
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Price");
		double price=input.nextDouble();
		System.out.println("Enter Quantity");
		double qty=input.nextDouble();
		double total=price*qty;
		
		System.out.printf("Total is %.2f\n",total);
		
		System.out.println("yahoo");
		
		//System.out.printf("%.2f", val);
	}

}
