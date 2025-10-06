package javaPack;

import java.util.Scanner;

public class CollectAirplane
{
    public CollectAirplane()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the details of the third airplane (call-sign, distance, bearing, altitude):");
        String cs = input.next();
        cs = cs.toUpperCase();
        double dist = input.nextDouble();
        int dir = input.nextInt();
        int alt = input.nextInt();

        Airplane airplane1 = new Airplane();
        Airplane airplane2 = new Airplane("AAA02", 15.8, 128, 30000);
        Airplane airplane3 = new Airplane(cs, dist, dir, alt);

        System.out.println("Initial Positions:");
        System.out.println("\"Airplane 1\": " + airplane1);
        System.out.println("\"Airplane 2\": " + airplane2);
        System.out.println("\"Airplane 3\": " + airplane3);

        System.out.println("Initial Distances:");
        System.out.println("The distance between Airplane 1 and Airplane 2 is " + airplane1.distTo(airplane2) + " miles.");
        System.out.println("The distance between Airplane 1 and Airplane 3 is " + airplane1.distTo(airplane3) + " miles.");
        System.out.println("The distance between Airplane 2 and Airplane 3 is " + airplane2.distTo(airplane3) + " miles.");

        System.out.println("Initial Height Differences:");
        System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + (airplane2.getAlt() - airplane1.getAlt()) + " feet.");
        System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + (airplane3.getAlt() - airplane1.getAlt()) + " feet.");
        System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + (airplane2.getAlt() - airplane3.getAlt()) + " feet.");

        double d23 = airplane2.distTo(airplane3);
        airplane1.move(d23, 65);
        airplane2.move(8, 135);
        airplane3.move(5, 55);

        airplane1.gainAlt();
        airplane1.gainAlt();
        airplane1.gainAlt();
        airplane2.loseAlt();
        airplane2.loseAlt();
        airplane3.loseAlt();
        airplane3.loseAlt();
        airplane3.loseAlt();
        airplane3.loseAlt();

        System.out.println("New Positions:");
        System.out.println("\"Airplane 1\": " + airplane1);
        System.out.println("\"Airplane 2\": " + airplane2);
        System.out.println("\"Airplane 3\": " + airplane3);

        System.out.println("New Distances:");
        System.out.println("The distance between Airplane 1 and Airplane 2 is " + airplane1.distTo(airplane2) + " miles.");
        System.out.println("The distance between Airplane 1 and Airplane 3 is " + airplane1.distTo(airplane3) + " miles.");
        System.out.println("The distance between Airplane 2 and Airplane 3 is " + airplane2.distTo(airplane3) + " miles.");

        System.out.println("New Height Differences:");
        System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + (airplane2.getAlt() - airplane1.getAlt()) + " feet.");
        System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + (airplane3.getAlt() - airplane1.getAlt()) + " feet.");
        System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + (airplane2.getAlt() - airplane3.getAlt()) + " feet.");
    }
}
