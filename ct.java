package AirplaneInfo;


public class Main
{
    public static void main(String[] args)
    {
        CollectAirplane collect = new CollectAirplane();
    }
}


package AirplaneInfo;


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

        airplane1.gainAlt(); airplane1.gainAlt(); airplane1.gainAlt();
        airplane2.loseAlt(); airplane2.loseAlt();
        airplane3.loseAlt(); airplane3.loseAlt(); airplane3.loseAlt(); airplane3.loseAlt();

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





package AirplaneInfo;

public class Airplane
{
    private String callSign;
    private double distance;
    private int bearing;
    private int altitude;

    public Airplane()
    {
        this.callSign = "AAA01";
        this.distance = 1.0;
        this.bearing = 0;
        this.altitude = 0;
    }

    public Airplane(String cs, double dist, int dir, int alt)
    {
        this.callSign = cs;
        if (dist < 0) { dist = -dist; }
        this.distance = dist;

        if (dir < 0) { dir = -dir; }
        if (dir > 360) { dir = dir % 360; }
        this.bearing = dir;

        if (alt < 0) { alt = -alt; }
        this.altitude = alt;
    }

    public void move(double dist, int dir)
    {
        this.distance = this.distance + dist;
        this.bearing = dir;
    }

    public void gainAlt()
    {
        this.altitude = this.altitude + 1000;
    }

    public void loseAlt()
    {
        if (this.altitude < 1000)
        {
            this.altitude = 0;
        }
        else
        {
            this.altitude = this.altitude - 1000;
        }
    }

    public int getAlt()
    {
        return this.altitude;
    }

    public double distTo(Airplane other)
    {
        double diff = this.distance - other.distance;
        if (diff < 0) { diff = -diff; }
        return diff;
    }

    public String toString()
    {
        String b = Integer.toString(this.bearing);
        if (this.bearing < 10) { b = "00" + this.bearing; }
        else if (this.bearing < 100) { b = "0" + this.bearing; }

        return this.callSign + " - " + this.distance + " miles away at bearing " + b + "°, altitude " + this.altitude + " feet";
    }
}
