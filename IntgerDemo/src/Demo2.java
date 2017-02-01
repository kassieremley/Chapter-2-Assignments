import java.util.Scanner;

public class Demo2 {
  

	public static void main(String[] args) 
	{
		
		  int anInt;
		    int aByte;
		    short aShort;
		    long aLong;
		    double anotherInt;
		    
		 Scanner input = new Scanner(System.in); 
		 
		 System.out.print("Please enter an integer >>>");
		 anInt = input.nextInt();
		 
		 System.out.print("Please enter a Byte >>>");
		 aByte = input.nextByte();

		System.out.println("The int is" + anInt);//1234
		System.out.println("The byte is" + aByte);//12
		System.out.println("The short is" + aShort);//12345
		System.out.println("The long is" + aLong);//12345678978654321
		System.out.println("Another int is" + anotherInt);
		              

	}

}
