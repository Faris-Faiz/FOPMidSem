/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fopmidsemq2;

import java.util.Scanner;

/**
 *
 * @author Faris Faiz
 */
public class FOPMidsemTestQ2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String durian = "", checker;
        double sales, cumu_sales = 0;
        
        
        while (!durian.equals("Quit")) {
            System.out.print("Enter the type of durian [Quit to terminate]: ");
            durian = keyboard.nextLine();
            switch(durian){
                case "MK":
                    System.out.print("Enter the sales in kg: ");
                    sales = keyboard.nextDouble();
                    cumu_sales = sales + (sales * 25.0);
                    keyboard.nextLine();
                    break;
                case "HL":
                    System.out.print("Enter the sales in kg: ");
                    sales = keyboard.nextDouble();
                    cumu_sales = sales + (sales * 22.0);
                    keyboard.nextLine();
                    break;
                case "D24":
                    System.out.print("Enter the sales in kg: ");
                    sales = keyboard.nextDouble();
                    cumu_sales = sales + (sales * 20.0);
                    keyboard.nextLine();
                    break;
                case "UM":
                    System.out.print("Enter the sales in kg: ");
                    sales = keyboard.nextDouble();
                    cumu_sales = sales + (sales * 18.0);
                    keyboard.nextLine();
                    break;
                case "Quit":
                    durian = "Quit";
                    break;
                default:
                    System.out.println("WRONG DURIAN TYPE/WRONG SPELLING OF 'Quit'!");
                    break;
            }
        }
        System.out.printf("Total Sales: RM%.2f\n", cumu_sales);
    }
}
