package QuartsToGallons;
import javax.swing.JOptionPane;
public class QuartsToGallons 
{

	public static void main(String[] args)
	{
		int Quarts_To_Gallon = 4;
		String quartsTold; 
		int quartsNumber;
		int quartsRemainder;
		int gallonShow; 
		
	quartsTold = JOptionPane.showInputDialog(null, " How many quarts would you like?", "Dialog 1", JOptionPane.INFORMATION_MESSAGE); 
	quartsNumber = Integer.parseInt(quartsTold); 
	gallonShow = quartsNumber/Quarts_To_Gallon; 
	quartsRemainder = gallonShow % quartsNumber; 
	System.out.println("A job that needs " + quartsNumber + " quarts requires " +gallonShow + " gallons and " + quartsRemainder + " quarts left over. ");

	}

}
