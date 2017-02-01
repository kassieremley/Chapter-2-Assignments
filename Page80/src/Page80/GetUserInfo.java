/**
 * 
 */
package Page80;
import java.util.Scanner; 
/**
 * @author kr131457
 *
 */
public class GetUserInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name;
        int age;
        
        Scanner imputDevice = new Scanner(System.in);
        System.out.print("Please enter your name >>>>>"); 
        name = imputDevice.nextLine();
        System.out.print("Please enter your age>>>>>"); 
        age = imputDevice.nextInt();
        System.out.println("Your name is " + name +  " and you are " + age + " years old."); 
	}

}
