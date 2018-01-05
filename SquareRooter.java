/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square.rooter;

import java.util.Scanner;

/**
 *
 * @author S653957
 */
public class SquareRooter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the square rooter!");
        sqrt();
        //this next bit isn't actually for square rooting but if you
        //want to get another square root without actually compiling again.
        Scanner again = new Scanner(System.in);
        System.out.println("\nWould you like to go again? (y/n)");
        if (again.next().toLowerCase().equals("y")) {
            do {
                System.out.println();
                sqrt();
                System.out.println("\nWolud you like to go again? (y/n)");
            } while (again.next().toLowerCase().equals("y"));
        }
        System.out.println("\nThanks for using the square rooter!!");
    }

    /*keep in mind that this method does not actually take any arguments (or return anything),
    but the arguments that would be accepted are created in the method,
    so the basic functionality is conserved and could be changed to accept
    arguments easily (and return a value easily)
     */
    public static void sqrt() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number to be rooted: ");
        double num = input.nextDouble();
        double low = 0, high = num, root = 0;
        //it doesn't matter how high the number i is less than it's just for precision
        for (int i = 0; i < 1000000; i++) {
            root = (low + high) / 2;
            if (root * root == num) {
                break;
            } else if (root * root < num) {
                low = root;
            } else {
                high = root;
            }
        }
        System.out.println("The square root of " + num + " is " + root);
    }

}
