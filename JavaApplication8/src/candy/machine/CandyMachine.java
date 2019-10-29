/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candy.machine;

import java.util.Scanner;

/**
 *
 * @author 21399
 */
public class CandyMachine {

    /**
     * @param args the command line arguments
     */
    private static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to CCHS's Computer Candy Machine!\n"
                + "   All candy provided is virtual.\n");
        System.out.print("How much money do ya got? > ");
        
        
        
        
        double dollar = dollar();
        double candy = candy();
        double change;
        
        if(dollar > candy){
        change = dollar - candy;
            System.out.println("Thanks for purchasing candy through us."
                            + "\nplease take your candy, and your $" + change + " change!");
        }
        else if(dollar < candy){
            System.out.println("You're broke. Take your $" + dollar + " and go elsewhere.");
        }
        else{
            System.out.println("Thanks for purchasing candy through us."
                                + "\n You have no change.");
        }
    }

    public static double dollar() {
        double dollar = kb.nextDouble();
        System.out.println("$" + dollar + ", that's all?");
        System.out.println("Well, lemme tell ya what we got here.");
        return dollar;
        
    }

    public static double candy() {
        String candy = kb.nextLine();
        System.out.println("A $0.65 Twix\n"
                + "B $0.50 Chips\n"
                + "C $0.75 Nutter Butter\n"
                + "D $0.65 Peanut Butter Cup\n"
                + "E $0.55 Juicy Fruit Gum");
        System.out.print("\nSo, What'll ya have? > ");
        char choice = kb.next().charAt(0);
        
        if(choice == 'A' || choice == 'a'){
            return 0.65;
        }
        else if(choice == 'B' || choice == 'b'){
            return 0.50;
        }
        else if(choice == 'C' || choice == 'c'){
            return 0.75;
        }
        else if(choice == 'D' || choice == 'd'){
            return 0.65;
        }
        else if(choice == 'E' || choice == 'e'){
            return 0.55;
        }
        else{
            return 0;
        }


    }

}
