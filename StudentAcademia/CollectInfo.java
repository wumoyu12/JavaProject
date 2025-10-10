package AirplaneInfo;

import java.util.Scanner;

// This class handles collecting airplane data and performing operations on them
public class CollectAirplane
{
    public CollectAirplane()
    {
        Scanner input = new Scanner(System.in);

        // Get information for the third airplane from user input
        System.out.println("Enter the details of the third airplane (call-sign, distance, bearing, altitude):");
        String cs = input.next();
        cs = cs.toUpperCase(); // convert to uppercase for consistency
        double dist = input.nextDouble();
        int dir = input.nextInt();
        int alt = input.nextInt();

        // Create three airplane objects with different data
        Airplane airplane1 = new Airplane();
        Airplane airplane2 = new Airplane("AAA02", 15.8, 128, 30000);
        Airplane airplane3 = new Airplane(cs, dist, dir, alt);

        // Display initial positions
        System.out.println("\nInitial Positions:");
        System.out.println("Airplane 1: " + airplane1);
        System.out.println("Airplane 2: " + airplane2);
        System.out.println("Airplane 3: " + airplane3);

        // Calculate and display initial distances between airplanes
        System.out.println("\nInitial Distances:");
        System.out.println("Between 1 & 2: " + String.format("%.2f", airplane1.distTo(airplane2)) + " miles");
        System.out.println("Between 1 & 3: " + String.format("%.2f", airplane1.distTo(airplane3)) + " miles");
        System.out.println("Between 2 & 3: " + String.format("%.2f", airplane2.distTo(airplane3)) + " miles");

        // Move airplanes based on given distances and directions
        double d23 = airplane2.distTo(airplane3);
        airplane1.move(d23, 65);
        airplane2.move(8, 135);
        airplane3.move(5, 55);

        // Change altitudes (gain or lose)
        airplane1.gainAlt(); airplane1.gainAlt(); airplane1.gainAlt();
        airplane2.loseAlt(); airplane2.loseAlt();
        airplane3.loseAlt(); airplane3.loseAlt(); airplane3.loseAlt(); airplane3.loseAlt();

        // Display updated positions after movement
        System.out.println("\nNew Positions:");
        System.out.println("Airplane 1: " + airplane1);
        System.out.println("Airplane 2: " + airplane2);
        System.out.println("Airplane 3: " + airplane3);

        // Display new distances between airplanes
        System.out.println("\nNew Distances:");
        System.out.println("Between 1 & 2: " + String.format("%.2f", airplane1.distTo(airplane2)) + " miles");
        System.out.println("Between 1 & 3: " + String.format("%.2f", airplane1.distTo(airplane3)) + " miles");
        System.out.println("Between 2 & 3: " + String.format("%.2f", airplane2.distTo(airplane3)) + " miles");

        // Display height differences
        System.out.println("\nNew Height Differences:");
        System.out.println("Between 1 & 2: " + (airplane2.getAlt() - airplane1.getAlt()) + " feet");
        System.out.println("Between 1 & 3: " + (airplane3.getAlt() - airplane1.getAlt()) + " feet");
        System.out.println("Between 2 & 3: " + (airplane2.getAlt() - airplane3.getAlt()) + " feet");
    }
}
