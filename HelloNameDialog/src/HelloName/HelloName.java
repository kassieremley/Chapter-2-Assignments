/**
 * 
 */
package HelloName;
import javax.swing.JOptionPane;
/**
 * @author KR131457
 *
 */
public class HelloName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String result; 
		        
		result = JOptionPane.showInputDialog(null,"What is your name?");
		        
	    JOptionPane.showMessageDialog(null, "Hello, " + result + "!"); 
			}




	}


