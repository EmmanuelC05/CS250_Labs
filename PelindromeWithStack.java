/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pelindromewithstack;
import java.util.Stack;
/**
 *
 * @author manny
 */
public class PelindromeWithStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Stack<Character> stack = new Stack();
        String input = "level";
        
        for(int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
        }
        String backwordsInput = "";
        
        while (!stack.isEmpty()){
            backwordsInput += stack.pop();
        }
        if (input.equals(backwordsInput))
            System.out.println("Palindrome");
        else System.out.println("Not palindrome");
        
      
        
        
    }
    
}
