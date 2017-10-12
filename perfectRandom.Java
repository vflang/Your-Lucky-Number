package com.company;

/**
 * Created by Veronica Lang on 10/10/2017.
 * Use modulus to see if it's a whole number number%1
 */
import java.util.Random;
import java.util.Scanner;

public class perfectRandom {

    public double randomSquare;
    public double perfectSquare;


    perfectRandom() {

    }

    public void randomizer() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = userInput.nextLine();
        Random rand = new Random();
        int random = rand.nextInt(999999999) + 1; //won't work
        randomSquare = Math.sqrt(random);

        if (randomSquare % 1 == 0) {
            perfectSquare = randomSquare;
        }
        System.out.print("Nice to meet you " + name + "! \nYour lucky number is " + perfectSquare);
    }

    public String exitOrRedo(/*press zero or 1*/) {
        Scanner redoOrno = new Scanner(System.in);
        System.out.println("\nPress 0 to exit or press 1 for another random number");
        String choice = redoOrno.nextLine();
        if (choice.equalsIgnoreCase("1")) {
            System.out.println("You pressed 1");
            perfectRandom myObject = new perfectRandom(); //make new object
            perfectRandom newRandom = (perfectRandom) myObject; //set object as same format as previous; won't work
            System.out.println(newRandom);
        } else if (choice.equalsIgnoreCase("0")) {
            System.exit(0);
        } else {
            System.out.println("That is not a valid number");
        }
        return exitOrRedo();

    }
}
