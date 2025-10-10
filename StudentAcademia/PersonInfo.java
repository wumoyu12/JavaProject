package AirplaneInfo;

// The Airplane class represents an airplane with position and altitude data
public class Airplane
{
    private String callSign;
    private double distance; // distance from the origin
    private int bearing;     // direction in degrees (0–360)
    private int altitude;    // altitude in feet

    // Default airplane constructor
    public Airplane()
    {
        this.callSign = "AAA01";
        this.distance = 1.0;
        this.bearing = 0;
        this.altitude = 0;
    }

    // Constructor with all parameters
    public Airplane(String cs, double dist, int dir, int alt)
    {
        this.callSign = cs;

        // Make sure distance and altitude are positive
        if (dist < 0) dist = -dist;
        this.distance = dist;

        // Normalize bearing (0–360)
        if (dir < 0) dir = -dir;
        if (dir > 360) dir = dir % 360;
        this.bearing = dir;

        if (alt < 0) alt = -alt;
        this.altitude = alt;
    }

    // Move the airplane by a certain distance and direction
    public void move(double dist, int dir)
    {
        // Convert polar coordinates to Cartesian (x, y)
        double x1 = this.distance * Math.cos(Math.toRadians(this.bearing));
        double y1 = this.distance * Math.sin(Math.toRadians(this.bearing));

        double x2 = dist * Math.cos(Math.toRadians(dir));
        double y2 = dist * Math.sin(Math.toRadians(dir));

        // Calculate new coordinates
        double newX = x1 + x2;
        double newY = y1 + y2;

        // Convert back to polar form (distance and bearing)
        this.distance = Math.sqrt(newX * newX + newY * newY);
        this.bearing = (int) Math.round(Math.toDegrees(Math.atan2(newY, newX)));
        if (this.bearing < 0) this.bearing += 360;
    }

    // Increase altitude by 1000 feet
    public void gainAlt()
    {
        this.altitude = this.altitude + 1000;
    }

    // Decrease altitude by 1000 feet (minimum 0)
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

    // Return current altitude
    public int getAlt()
    {
        return this.altitude;
    }

    // Calculate straight-line distance to another airplane
    public double distTo(Airplane other)
    {
        double x1 = this.distance * Math.cos(Math.toRadians(this.bearing));
        double y1 = this.distance * Math.sin(Math.toRadians(this.bearing));
        double x2 = other.distance * Math.cos(Math.toRadians(other.bearing));
        double y2 = other.distance * Math.sin(Math.toRadians(other.bearing));

        double dx = x1 - x2;
        double dy = y1 - y2;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Display airplane information in a formatted string
    public String toString()
    {
        String b = Integer.toString(this.bearing);
        if (this.bearing < 10) b = "00" + this.bearing;
        else if (this.bearing < 100) b = "0" + this.bearing;

        return this.callSign + " - " + String.format("%.2f", this.distance)
                + " miles away at bearing " + b + "°, altitude " + this.altitude + " feet";
    }
}
