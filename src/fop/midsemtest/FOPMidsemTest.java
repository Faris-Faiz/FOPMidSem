/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fop.midsemtest;

import java.util.Scanner;


/**
 *
 * @author Faris Faiz
 */
public class FOPMidsemTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String movement;
        int x, y;
        
        System.out.print("Please enter the initial coordinates (X, Y): ");
        x = keyboard.nextInt();
        y = keyboard.nextInt();
        
        System.out.print("Enter the movement: ");
        keyboard.nextLine();
        movement = keyboard.nextLine();
        
        System.out.println("Initial Coordinates: " + "(" + x + "," + y + ")");
        
        for(int i = 0; i< movement.length(); i++)
        {
            switch(movement.charAt(i)) {
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                default:
                    System.out.println("You have keyeed in a wrong input. Please try again.");
                    break;
            }
        }
        
        System.out.println("Final Coordinates: " + "(" + x + "," + y + ")");
        
    }
    
}
