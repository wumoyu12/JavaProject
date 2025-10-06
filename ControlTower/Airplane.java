package javaPack;

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
        if (dist < 0)
        {
        	dist = -dist;
        }
        this.distance = dist;

        if (dir < 0)
        {
        	dir = -dir;
        }
        if (dir > 360)
        {
        	dir = dir % 360;
        }
        this.bearing = dir;

        if (alt < 0)
        {
        	alt = -alt;
        }
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
        if (diff < 0)
        {
        	diff = -diff;
        }
        return diff;
    }

    public String toString()
    {
        String b = Integer.toString(this.bearing);
        if (this.bearing < 10)
        {
        	b = "00" + this.bearing;
        }
        else if (this.bearing < 100)
        {
        	b = "0" + this.bearing;
        }

        return this.callSign + " - " + this.distance + " miles away at bearing " + b + "°, altitude " + this.altitude + " feet";
    }
}
