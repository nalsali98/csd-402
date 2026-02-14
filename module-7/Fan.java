/**
 * Fan represents a fan with speed, on/off status, radius, and color.
 * Uses 'this' where allowed.
 *
 * @author Noor
 * @version 1.0
 */
public class Fan {

    // Constants
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * Default constructor:
     * Fan is off, speed is SLOW, radius is 5, color is blue.
     */
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    /**
     * Full constructor.
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns a friendly label for speed (not toString()).
     */
    public String getSpeedLabel() {
        if (this.speed == SLOW) return "SLOW";
        if (this.speed == MEDIUM) return "MEDIUM";
        if (this.speed == FAST) return "FAST";
        return "CUSTOM(" + this.speed + ")";
    }
}
