// Programmer: Ayana Thompson
// Course: CS 212
// Due Date: 02/01/2024
// Lab Assignment: 3
// Problem Statement: Make a program to calculate the distance traveled based on speed and determine how many points they'd receive if they went that distance.
// Data In:
// Data Out:
// Credits: Based on examples used in class

// Import Scanner scan
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("#0.00");

        // Ask user for the type of ski jump ("normal" vs "large") - store variable
        System.out.println("What type of ski jump? (Normal or Large)? ");
        String skiType = scan.nextLine().toLowerCase();

        // Ask user for the jumper's speed - store variable
        System.out.println("What is the jumper's speed: ");
        int jumperSpeed = scan.nextInt();

        // Create if state.
        // Declare variables
        double height = 0;
        double points = 0;
        double par = 0;

        // If the hill type is "normal":
        if (skiType.equals("normal")){
            height = 46;
            points = 2;
            par = 90;
        }

        if (skiType.equals("large")){
            height = 70;
            points = 1.8;
            par = 120;
        }

        // Calulcate for time in air and store variable
        // ex: timeInAir = sqrt((2*height)/9.8)
        double timeInAir = Math.sqrt((2*height)/9.8);

        // Calculate distance traveled
        double distanceTraveled = jumperSpeed * timeInAir;

        //  Calculate points earned
        double pointsEarned = 60 + (distanceTraveled - par)*points;

        // Create if state.
        if (pointsEarned > 61){
            System.out.println("Great job for doing better than par!");
        } else if (pointsEarned < 10){
            System.out.println("What happened");
        } else {
            System.out.println("Sorry you didn't go very far");
        }
        System.out.println("The points earned: " + fmt.format(pointsEarned));
        System.out.println("The distance traveled: " + fmt.format(distanceTraveled));
    }
}