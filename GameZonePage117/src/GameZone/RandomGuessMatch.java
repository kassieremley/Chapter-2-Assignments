/**
 * 
 */
package GameZone;

import javax.swing.JOptionPane;

/**
 * @author kr131457
 *
 */
public class RandomGuessMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// creating random guess
		String guessString;
		int random;
		int guess;
		final int MIN = 1;
		final int MAX = 2; 
		boolean isMatch;
		
		random = MIN + (int)(Math.random() * MAX); 
		guessString = JOptionPane.showInputDialog(null, "Guess my number between" + MIN + " and " +MAX + " Random guess ", " ", JOptionPane.INFORMATION_MESSAGE);
		
	    guess = Integer.parseInt(guessString);
		
		isMatch = guess == random; 
		
		JOptionPane.showMessageDialog(null, "Your guess was " + (random - guess) + " numbers away from the random number.");
		
		JOptionPane.showMessageDialog(null, "The number was " + random + ". The result is " + isMatch + "."); 

	}

}
