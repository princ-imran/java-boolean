/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booleancondition;

import java.util.Scanner;

/**
 *
 * @author Spy Hacker
 */
public class BooleanCondition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1;
        System.out.print("Select one number (1 or 2 or 3) to show output: ");
        num1 = input.nextInt();
        if(num1 == 1){
            System.out.println("Name is: Imran");
        }
        else if(num1 == 2){
            System.out.println("Age is: 26");
        }
        else if(num1==3){
            System.out.println("University is: Canadian University of Bangladesh");
        }
        else{
            System.out.println("Wrong Input");
        }
    }
    
}
