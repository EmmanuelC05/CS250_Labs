
package lab5incorrectmessage;

/**
 *
 * @author Emmanuel C.
 */
public class Lab5IncorrectMessage {

     public static void main(String[] args)
    {
        int a = 2, b = 8, c = 6;
        System.out.print("Finding the largest number \n");
        
        if (a > b && a > c) 
            System.out.println(a + " is the largest number");
        
        else if (b > a && b > c)
            System.out.println(b + " is the largest Number");
        
        else 
            System.out.println(c + " is the largest Number");
            
                
    }
    
}
