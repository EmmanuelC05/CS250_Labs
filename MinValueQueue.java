/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minvaluequeue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author manny
 */
public class MinValueQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Queue<Integer> myQ = new PriorityQueue<>();
        
        myQ.add (5);
        myQ.add (6);
        myQ.add (4);
        myQ.add (9);
      
        
        System.out.println(myQ.poll());
    }
    
}
