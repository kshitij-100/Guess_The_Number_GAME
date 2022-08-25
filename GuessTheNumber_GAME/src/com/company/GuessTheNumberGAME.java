package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{

    int user_ch;
    int computer_ch ;
    int noOfGuess = 0;
    int attempts = 10;
    Scanner sc = new Scanner(System.in);
    Game(){
        Random ran = new Random();
        computer_ch = ran.nextInt(100);
    }

    public void takeUserInput() {
        System.out.println("Guess the number between 1 to 100");

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nAttempts Remaining : "+attempts);
            System.out.println("Enter your choice : ");
            user_ch = sc.nextInt();
            noOfGuess++;
            attempts--;
            if (computer_ch > user_ch) {
                System.out.println("The number you hav chosen is Too Low.....");
            }
            else if (computer_ch < user_ch) {
                System.out.println("The number you hav chosen is Too High....");
            }
            else if (computer_ch == user_ch) {
                System.out.format("Yes you guessed it Right, It was %d \n You Guessed it in %d Attempts ", computer_ch, noOfGuess);
                break;

            }

        }
        System.out.println("\n\nSorry!!! You Had Lost the Game, the number was : " + computer_ch);
        System.out.println("\nPlease try again later......");

    }


}
public class GuessTheNumberGAME {
    public static void main(String[] args) {
        Game obj = new Game();
        obj.takeUserInput();
    }
}
